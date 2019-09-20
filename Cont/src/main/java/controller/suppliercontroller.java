package controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dao.supplierdao;
import hibernate.backend.Product;
import hibernate.backend.category;
import hibernate.backend.supplier;
@Controller
public class suppliercontroller {
	
	
	@Autowired
	supplierdao supplierdao;
		@ModelAttribute("addsupplier")
		public supplier getsupplier()
		{
			return new supplier();
		}
		/*@RequestMapping("/supplierdetails")
		public String getsupplierPage()
		{
			return "supplierdetails";
		}
		*/
		@RequestMapping("supplierdetails")
		public String getsupplierdetails(Model model,HttpServletRequest request)
		{
			java.util.List<supplier> supplierlist=supplierdao.getAllsuppliers();
	     	model.addAttribute("supplierlist", supplierlist);
			String id=request.getParameter("id");
			
		
			if(id!=null)
				
			{
				int nid=Integer.parseInt(id);
				supplier n=supplierdao.findsupplier(nid);
	           model.addAttribute("currsupplier",n);   
	           return "Editsupplier";
	           
			}
			 
			 return "supplierdetails";
		}
		@RequestMapping(value="addsupplier",method=RequestMethod.POST)
		public String addsupplier(supplier supplier)
		{
			supplierdao.addsupplier(supplier);
			return "redirect:supplierdetails";
		}
		@RequestMapping(value="updatesupplier",method=RequestMethod.POST)
		public String updatesupplier(supplier supplier)
		{
			int id=supplier.getId();
			   supplier n=supplierdao.findsupplier(id);
			   n.setAddress(supplier.getAddress());
			   n.setSupplierName(supplier.getSupplierName());  
			supplierdao.updatesupplier(n);
			return "redirect:supplierdetails";
		}
		@RequestMapping("deletesupplier")
		 public String deletesupplier(HttpServletRequest request)
		 {
			 int id=Integer.parseInt(request.getParameter("id"));
		    supplier n=supplierdao.findsupplier(id);
		    supplierdao.deletesupplier(n);
		    return "redirect:supplierdetails";
		 }
	}

