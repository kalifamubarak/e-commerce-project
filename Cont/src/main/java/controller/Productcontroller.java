package controller;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.function.Supplier;

import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import dao.Productdao;
import dao.supplierdao;
import hibernate.backend.Product;
import hibernate.backend.supplier;

@Controller
public class Productcontroller {
	@Autowired
	Productdao productdao;
	@Autowired
	supplierdao supplierdao;
	@ModelAttribute("addproduct")
	public Product getProduct()
	{
		return new Product();
	}
	@RequestMapping("/Productdetails")
	public String getProductDetails(Model model,HttpServletRequest request)
	{
		java.util.List<Product> productlist=productdao.getAllproducts();
     	model.addAttribute("productlist", productlist);
		String id=request.getParameter("id");
		java.util.List<supplier> supplierlist=supplierdao.getAllsuppliers();
		model.addAttribute("supplierlist",supplierlist);
		if(id!=null)
			
		{
			int pid=Integer.parseInt(id);
			Product p=productdao.findProduct(pid);
           model.addAttribute("currproduct",p);   
           return "Editproduct";
           
		}
		 
		 return "Productdetails";
	}
	@RequestMapping(value="addproduct",method=RequestMethod.POST)
	public String addProduct(Product product)
	{
		productdao.addProduct(product);
				
		try {
		//byte[ bt=image.getBytes();
		//	productDAO.addProduct(product);
			MultipartFile image=(MultipartFile)product.getImage();
			byte[] bt=new byte[(int)image.getSize()];
			try {
				InputStream i=image.getInputStream();
				i.read(bt);
				FileOutputStream f=new FileOutputStream("F:\\sample\\Cont\\src\\main\\webapp\\resources\\images\\"+product.getId()+".jpg");
				f.write(bt);
				f.flush();
			}
			catch(Exception e) {
			      System.out.println(e);
			}
		System.out.println(bt);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return "redirect:Productdetails";	
	}
	@RequestMapping(value="updateproduct",method=RequestMethod.POST)
	public String updateProduct(Product product)
	{
		int id=product.getId();
	   Product p=productdao.findProduct(id);
	   p.setCategoryid(product.getCategoryid());
	   p.setSupplierid(product.getSupplierid());
	   p.setPrice(product.getPrice());
	   p.setDescription(product.getDescription());
   p.setQuantity(product.getQuantity());
   p.setProductName(product.getProductName());
   
	   productdao.updateProduct(p);
				
		try {
		//byte[ bt=image.getBytes();
		//	productdao.addProduct(product);
			MultipartFile image=(MultipartFile)product.getImage();
			byte[] bt=new byte[(int)image.getSize()];
			try {
				InputStream i=image.getInputStream();
				i.read(bt);
				FileOutputStream f=new FileOutputStream("F:\\sample\\Cont\\src\\main\\webapp\\resources\\images\\"+product.getId()+".jpg");
				f.write(bt);
				f.flush();
			}
			catch(Exception e) {
			      System.out.println(e);
			}
		System.out.println(bt);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return "redirect:Productdetails";	
	}

 @RequestMapping("/deleteproduct")
 public String deleteproduct(HttpServletRequest request)
 {
	 int id=Integer.parseInt(request.getParameter("id"));
    Product pr=productdao.findProduct(id);
    productdao.deleteProduct(pr);
    return "redirect:Productdetails";
 }
}

