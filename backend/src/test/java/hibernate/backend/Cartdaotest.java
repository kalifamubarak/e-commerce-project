package hibernate.backend;

import static org.junit.Assert.*;

import org.hibernate.Session;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dao.Cartdao;
import jdk.nashorn.internal.ir.annotations.Ignore;

public class Cartdaotest {
	public static ApplicationContext context;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		context=new AnnotationConfigApplicationContext(Springconfiguration.class);
	}
	
	@Test 
	public void addCartTest()
	{
		Cartdao dao=(Cartdao)context.getBean("Cartdao");
		Cart c=new Cart();
	
		c.setEmail("mail");
		c.setProductid(1232);
		c.setPrice(12002);
	
		java.util.Date dt=new java.util.Date();
		String cartid=	dt.getDate()+":"+dt.getYear()+":"+dt.getMonth()+":"+c.getEmail();
		c.setCartid(cartid);
		
 assertTrue(dao.addCart(c));		
	}

	@Test
	public void testfind() {
		Cartdao c=(Cartdao)context.getBean("Cartdao");
		Cart eo=c.findCart(1);
		System.out.println(eo.getId());
		}
	@Test
	public void testupdateCart() {
		Cartdao c=(Cartdao)context.getBean("Cartdao");
		Cart eo=c.findCart(1);
		
		c.updateCart(eo);
	}
	@Test
	public void testdeleteCart() {
		Cartdao c=(Cartdao)context.getBean("Cartdao");
		Cart eo=c.findCart(1);
		assert(c.deleteCart(eo));
		
	}
		
}




