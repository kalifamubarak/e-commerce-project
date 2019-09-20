package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dao.Paymentdao;
import hibernate.backend.Payment;
import hibernate.backend.Product;


@Controller
public class paymentcontroller {
	@Autowired
	Paymentdao Paymentdao;
	
	
	@ModelAttribute("addpayment")
	public Payment getPayment()
	{
		return new Payment();
	}
	/*@RequestMapping("/Paymentdetails")
	public String getPaymentPage()
	{
		return "Paymentdetails";
	}
	*/
	@RequestMapping(value="add",method=RequestMethod.POST)
	public String getpayment(Payment payment,HttpSession session)
	{
		String username=(String)session.getAttribute("username");
		java.util.Date dt=new java.util.Date();
		 String cartid=	dt.getDate()+":"+dt.getYear()+":"+dt.getMonth()+username+"/";
		payment.setCartid(cartid);
		Paymentdao.addPayment(payment);
		return "redirect:payment";
	}
	@RequestMapping("/payment")
	public String getpayment(Model model,HttpServletRequest request,HttpSession session)
	{
		String username=(String)session.getAttribute("username");
		java.util.Date dt=new java.util.Date();
		 String cartid=	dt.getDate()+":"+dt.getYear()+":"+dt.getMonth()+username+"/";
		
		java.util.List<Payment> productlist=Paymentdao.getAllPayments(cartid);
     	model.addAttribute("productlist", productlist);
		String id=request.getParameter("id");
		java.util.List<Payment> supplierlist=Paymentdao.getAllPayments(cartid);
		model.addAttribute("supplierlist",supplierlist);
	
if(id!=null)
			
		{
			int aid=Integer.parseInt(id);
			Payment a=Paymentdao.findPayment(aid);
           model.addAttribute("currpayment",a);   
          return "payment";
		} 
		
		 return "payment";
	}
	@RequestMapping(value="addpayment",method=RequestMethod.POST)
	public String addpayment(Payment payment,HttpSession session)
	{
		String username=(String)session.getAttribute("username");
		java.util.Date dt=new java.util.Date();
		 String cartid=	dt.getDate()+":"+dt.getYear()+":"+dt.getMonth()+username+"/";
		payment.setCartid(cartid);
	Paymentdao.addPayment(payment);
	return "redirect:invoices";
		
	}
	
	
	
}



