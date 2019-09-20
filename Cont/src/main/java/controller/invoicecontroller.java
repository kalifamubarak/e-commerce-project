package controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import dao.Cartdao;
import dao.Paymentdao;
import dao.Productdao;
import dao.supplierdao;
import hibernate.backend.Cart;
import hibernate.backend.Payment;
@Controller
public class invoicecontroller {
	
	@Autowired
	Cartdao Cartdao;
	@Autowired
	Productdao productdao;
	@Autowired
	supplierdao supplierdao;
	@Autowired
	Paymentdao Paymentdao;
	 @RequestMapping("/invoices")
	 public String viewCart(HttpSession session,Model model,HttpServletRequest request)
	 {
	 String username=(String)session.getAttribute("username");
	 java.util.Date dt=new java.util.Date();
	 String cartid= dt.getDate()+":"+dt.getYear()+":"+dt.getMonth()+username+"/";
	 java.util.List<Cart> cartlist=Cartdao.getAllCarts();
	 float sum=0;
	 for(Cart c:cartlist)
	 {
	 sum=sum+c.getPrice();
	 }
	         model.addAttribute("cartlist",cartlist);
	   model.addAttribute("carttotal",sum);
	   
	   java.util.List<Payment> productlist=Paymentdao.getAllPayments(cartid);
	   model.addAttribute("productlist", productlist);
	   String id=request.getParameter("id");
	   java.util.List<Payment> supplierlist=Paymentdao.getAllPayments(cartid);
	   model.addAttribute("Paymentlist", supplierlist);
	   //model.addAttribute("cartsize",cartlist.size());
	 return "invoices";
	 }


	}

