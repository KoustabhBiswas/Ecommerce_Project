package com.ecommerce1;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ecommerce2.ecommercebackend.Dao.CartDao;
import com.ecommerce2.ecommercebackend.Dao.UserDao;
import com.ecommerce2.ecommercebackend.model.Cart;
import com.ecommerce2.ecommercebackend.model.User;

@Controller
public class UserController {
	@Autowired
	UserDao userDao;
	@Autowired
	CartDao cartDao;
@RequestMapping("/login1")
public ModelAndView login(){
	ModelAndView model = new ModelAndView("login");
	return model;
}

@RequestMapping("/registerpage")
public ModelAndView registerPage(){
	
	ModelAndView model=new ModelAndView("register");
	model.addObject("registration", new User());
	return model;
}

@PostMapping("/userSubmit")
public String userdetailsSubmit(@ModelAttribute("registration") User user, ModelMap model){
	Cart cart= new Cart();
	if(userDao.insertUser(user)){
		cart.setUser(user);
		cartDao.insertItem(cart);
	}
	return "redirect:/login1";
}


}
