package controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.Productdao;
import hibernate.backend.Product;
@Controller
public class homecontroller {
	@Autowired
	Productdao productdao;
	@RequestMapping("/")
	public String getIndex()
	{
		return "index";
	}
	@RequestMapping("/login")
	public String getLogin()
	{
		 
		return "login";
	
	}
	@RequestMapping("/user")
	public String getuser()
	{
		 
		return "user";
	
	}
	@RequestMapping("/admin")
	public String getadmin()
	{
		 
		return "admin";
	
	}
	
	@RequestMapping("/aboutus")
	public String getaboutus()
	{
		 
		return "aboutus";
	
	}
	
	
	
	
	
	@RequestMapping("/category")
	public String getcategory()
	{
		 
		return "category";
	
	}
	@RequestMapping("/Product")
	public String getproduct()
	{
		 
		return "Product";
	
	}
	@RequestMapping("/supplier")
	public String getsupplier()
	{
		 
		return "supplier";
	
	}
	@RequestMapping("/signup")
	public String getsignup()
	{
		 
		return "signup";
	
	}
	@RequestMapping("/userhome")
	public String getuserhome(HttpSession session,Model model)
	{
	String username=SecurityContextHolder.getContext().getAuthentication().getName();
		session.setAttribute("username", username);
		java.util.List<Product> productlist=productdao.getAllproducts();
		model.addAttribute("productlist", productlist);
		return "userhome";
	}
	@RequestMapping("/logout")
	public String getlogout()
	{
		
		return "logout";
	}
	
	}
