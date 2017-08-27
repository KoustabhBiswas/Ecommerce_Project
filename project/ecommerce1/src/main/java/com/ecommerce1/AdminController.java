package com.ecommerce1;

 
import java.io.File;
 
import java.util.List;

import javax.servlet.http.HttpServletRequest;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.ecommerce2.ecommercebackend.Dao.ProductDao;
import com.ecommerce2.ecommercebackend.Dao.SupplierDao;
import com.ecommerce2.ecommercebackend.model.Product;
import com.ecommerce2.ecommercebackend.model.Supplier;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	ProductDao p;
	@Autowired
	SupplierDao s;
	@Autowired
	HttpServletRequest request;

//	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);

	@RequestMapping("/product")
	public ModelAndView Product() {
		List<Product> list = p.getAll();
		System.out.println("Size of list is " + list.size());
		ModelAndView mv = new ModelAndView("adminproduct");
		mv.addObject("product", new Product());
		mv.addObject("prdList", list);
		return mv;
	}

	// Add and update product . Add if product is zero.
	@RequestMapping(value = "/productsubmit", method = RequestMethod.POST)
	public String ProductSubmit(@ModelAttribute("product") Product product, @RequestParam("file") MultipartFile file,
			ModelMap mv) {

		if (product.getProductId() == 0) {
			 
			if (!file.isEmpty()) {
				try {
					 

					// Creating the directory to store file
					String rootPath = request.getServletContext().getRealPath("/resources/images/product/");
					File dir = new File(rootPath);
					if (!dir.exists())
						dir.mkdirs();
					String upload = rootPath + file.getOriginalFilename();
					System.out.println("Uploaded "+upload);
					System.out.println("Uploaded"+rootPath);
					File destination = new File(upload);
					
					file.transferTo(destination);

					// Create the file on server
					
					product.setProduct_image(file.getOriginalFilename());
					p.insertProduct(product);
				
			 
			// p.getAll();
			 
		}catch(Exception e){ }
				
			}
			return "test"; 
		}
	else

	{
		p.updateProduct(product);
		System.out.println("updated successfulluy");
		return "redirect:/admin/product";
	}
 
	}

	@RequestMapping("/supplier")
	public ModelAndView Supplier() {
		ModelAndView mv = new ModelAndView("adminsupplier");
		mv.addObject("supplier", new Supplier());
		return mv;
	}

	@RequestMapping(value = "/supplierdetails", method = RequestMethod.POST)
	public ModelAndView SupplierSubmit(@ModelAttribute("supplier") Supplier supplier) {
		s.insertSupplier(supplier);
		ModelAndView mv = new ModelAndView("home");

		return mv;
	}

	@GetMapping("/edit/{id}")
	public ModelAndView getProduct(@PathVariable("id") int id) {
		Product p1 = p.getbyId(id);
		System.out.println("Get peoduct where the id is " + id);

		List<Product> list = p.getAll();
		System.out.println("Size of list is " + list.size());
		ModelAndView mv = new ModelAndView("adminproduct");
		mv.addObject("product", p1);
		mv.addObject("prdList", list);
		return mv;

	}

	@GetMapping("/delete/{id}")
	public String deleteProduct(@PathVariable("id") int id) {
		Product p1 = p.getbyId(id);
		System.out.println("Get peoduct where the id is " + id);
		p.deleteProduct(p1);
		/*
		 * List<Product> list = p.getAll();
		 * System.out.println("Size of list is " + list.size()); ModelAndView mv
		 * = new ModelAndView("adminproduct");
		 * 
		 * mv.addObject("prdList", list); return mv;
		 */
		return "redirect:/admin/product";
	}

	/*
	 * @PutMapping(value="/edit/updateproduct") public ModelAndView
	 * update(@ModelAttribute("update") Product update ){
	 * 
	 * p.updateProduct(update); return new ModelAndView("test");
	 * 
	 * }
	 */

	/*
	 * @GetMapping("/productsubmit") public ModelAndView
	 * update(@ModelAttribute("product") Product product ){
	 * 
	 * if(product.getProductId()==0){ p.insertProduct(product);
	 * 
	 * }else{ p.updateProduct(product); }
	 * 
	 * ModelAndView mv = new ModelAndView("adminproduct");
	 * p.updateProduct(product); return mv; }
	 */

}
