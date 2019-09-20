package hibernate.backend;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dao.Productdao;
import jdk.nashorn.internal.ir.annotations.Ignore;


public class Productdaotest {
	public static ApplicationContext context;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		context=new AnnotationConfigApplicationContext(Springconfiguration.class);
	}
	
	@Test
	public void addProductTest()
	{
		Productdao dao=(Productdao)context.getBean("Productdao");
		Product p=new Product();
		p.setProductName("chai");
		p.setPrice(1000);
		
		
 assertTrue(dao.addProduct(p));		
	}
	
	

	
	@Test
	public void testfindProduct() {
		Productdao p=(Productdao)context.getBean("Productdao");
		Product mo=p.findProduct(1);
		System.out.println(mo.getProductName());
		}

	@Test
	public void testupdateProduct() {
		Productdao p=(Productdao)context.getBean("Productdao");
		Product mo=p.findProduct(1);
		mo.setPrice(8700);
		p.updateProduct(mo);
	}

	@Test
	public void testdeleteProduct() {
		Productdao p=(Productdao)context.getBean("Productdao");
		Product mo=p.findProduct(1);
	p.deleteProduct(mo);
		
	}
	@Test
	public void testGetallproducts()
	{
		Productdao p=(Productdao)context.getBean("Productdao");
		for(Product mo:p.getAllproducts())
		{
			System.out.println(mo.getProductName());
			
		}
			
	}
}
