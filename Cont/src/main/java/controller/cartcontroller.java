package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dao.Cartdao;
import hibernate.backend.Cart;
import hibernate.backend.Product;
import hibernate.backend.supplier;

@Controller
public class cartcontroller {
	@Autowired
	Cartdao Cartdao;

	   @RequestMapping(value="addtocart", method=RequestMethod.POST)
	   public String addtocart(Cart cart,HttpSession session)
	   {
		   String username=(String)session.getAttribute("username");
		    java.util.Date dt=new java.util.Date();
		   String cartid=	dt.getDate()+":"+dt.getYear()+":"+dt.getMonth()+username+"/";
			cart.setCartid(cartid);
			Cartdao.addCart(cart);
			return "redirect:userhome";
	   }
	   @RequestMapping("/cart")
	   public String viewCart(HttpSession session,Model model)
	   {
		   String username=(String)session.getAttribute("username");
		   java.util.Date dt=new java.util.Date();
		   String cartid=	dt.getDate()+":"+dt.getYear()+":"+dt.getMonth()+username+"/";
				   java.util.List<Cart> cartlist=Cartdao.getAllCarts();
				   float sum=0;
				   for(Cart c:cartlist)
				   {
					   sum=sum+c.getPrice();
				   }
	           model.addAttribute("cartlist",cartlist);
		     model.addAttribute("carttotal",sum);
		   return "cart";
	   }
	   @RequestMapping("deletecart")
	   public String deletecart(HttpServletRequest request)
	   {
		   int id=Integer.parseInt(request.getParameter("id"));
		   Cart c=Cartdao.findCart(id);
		   Cartdao.deleteCart(c);
		    return "redirect:cart";
	   }
}
