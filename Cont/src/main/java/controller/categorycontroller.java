package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dao.categorydao;

import hibernate.backend.category;
import hibernate.backend.supplier;

@Controller
public class categorycontroller {
	@Autowired
	categorydao categorydao;
		@ModelAttribute("addcategory")
		public category getcategory()
		{
			return new category();
		}
		@RequestMapping("/categorydetails")
		public String getcategorydetails(Model model,HttpServletRequest request)
		{
			java.util.List<category> categorylist=categorydao.getAllcategorys();
	     	model.addAttribute("categorylist", categorylist);
			String id=request.getParameter("id");
			
		
			if(id!=null)
				
			{
				int mid=Integer.parseInt(id);
				category m=categorydao.find(mid);
	           model.addAttribute("currcategory",m);   
	           return "Editcategory";
	           
			}
			 
			 return "categorydetails";
		}
		@RequestMapping(value="/addcategory",method=RequestMethod.POST)
		public String addcatetory(category category)
		{
			categorydao.addcategory(category);
			return "redirect:categorydetails";
		}
		@RequestMapping(value="/updatecategory",method=RequestMethod.POST)
		
		public String updatecatetory(category category)
		{
			int id=category.getId();
			   category m=categorydao.find(id);
			   m.setcategoryName(category.getcategoryName());
			categorydao.updatecategory(m);
			return "redirect:categorydetails";
		}
		@RequestMapping("deletecategory")
		 public String deletecategory(HttpServletRequest request)
		 {
			 int id=Integer.parseInt(request.getParameter("id"));
		    category m=categorydao.find(id);
		    categorydao.deletecategory(m);
		    return "redirect:categorydetails";
		 }
	}



