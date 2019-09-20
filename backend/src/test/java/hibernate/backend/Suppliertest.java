package hibernate.backend;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dao.supplierdao;
import jdk.nashorn.internal.ir.annotations.Ignore;

public class Suppliertest {
	public static ApplicationContext context;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		context=new AnnotationConfigApplicationContext(Springconfiguration.class);
	}
	
	@Test 
	public void addSupplierTest()
	{
		supplier n=new supplier();
		
     	n.setSupplierName("bulleet");
		n.setAddress("pudukkottai");
		
		supplierdao dao=(supplierdao)context.getBean("supplierdao");
 assertTrue(dao.addsupplier(n));		
	}

	@Test
	public void testfind() {
		supplierdao n=(supplierdao)context.getBean("supplierdao");
		supplier so=n.findsupplier(15);
		System.out.println(so.getSupplierName());
		}
	@Test
	public void testupdate() {
		supplierdao n=(supplierdao)context.getBean("supplierdao");
		supplier so=n.findsupplier(7);
		
		n.updatesupplier(so);
	}

	@Test
	public void testdeletesupplier() {
		supplierdao n=(supplierdao)context.getBean("supplierdao");
		supplier so=n.findsupplier(10);
		assert(n.deletesupplier(so));
		
	}
	@Test
	public void testGetallsuppliers()
	{
		supplierdao n=(supplierdao)context.getBean("supplierdao");
		for(supplier so:n.getAllsuppliers())
		{
			System.out.println(so.getSupplierName());
			
		}
			
	}
}
