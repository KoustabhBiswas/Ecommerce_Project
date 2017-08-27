package com.ecommerce1;

 
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ecommerce2.ecommercebackend.Dao.ProductDao;
import com.ecommerce2.ecommercebackend.model.Product;

 

@Controller
public class HomeController {
	@Autowired
	ProductDao productDao;
	 
	@RequestMapping("/")
	public ModelAndView user(){
		ModelAndView mv = new ModelAndView("home");
		 //mv.addObject("msg1", "HELLO");
		return mv; 
		 
	}

	/* @RequestMapping("/samsung")
	 public String productView(ModelMap model){
		 List<Product> prdList = productDao.getAll();
		  Iterator itr = prdList.iterator();
		  if(itr.hasNext()){
			//Product product1 = (Product) itr.next();  
		 model.addAttribute("prod" , itr.next() );
		 return  "product";
		 		 }
		  
		  else{return "test";}
		  
	 }*/
	@RequestMapping("/samsung")
	public ModelAndView productView(){
		
		List<Product> list = productDao.getAll();
		ModelAndView model = new ModelAndView("product");
		model.addObject("prdList", list);
		return model;
	}
	
	@RequestMapping("/ecommerce1/samsung/{id}")
	public ModelAndView show(@PathVariable("id") int id){
		Product prod = productDao.getbyId(id);
		ModelAndView model = new ModelAndView("showproduct");
		model.addObject("product", prod);
		return model;
	}
	

}