package hibernate.backend;

import static org.junit.Assert.*;

import org.hibernate.Session;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dao.categorydao;
import jdk.nashorn.internal.ir.annotations.Ignore;


public class Categorytest {
	 static ApplicationContext context;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		context=new AnnotationConfigApplicationContext(Springconfiguration.class);
	}
	
	@Test 
	public void addCategoryTest()
	{
		categorydao dao=(categorydao)context.getBean("categorydao");
		category m=new category();
		m.setcategoryName("keychain");
		
		
 assertTrue(dao.addcategory(m));		
	}


	@Test
	public void testfind() {
		categorydao m=(categorydao)context.getBean("categorydao");
		category no=m.find(26);
		System.out.println(no.getcategoryName());
		}

	@Test
	public void testupdateCategory() {
		categorydao m=(categorydao)context.getBean("categorydao");
		category no=m.find(6);
		
		m.updatecategory(no);
	}

	@Test
	public void testdeleteCategory() {
		categorydao m=(categorydao)context.getBean("categorydao");
		category no=m.find(24);
		assert(m.deletecategory(no));
		
	}
	@Test
	public void testGetallcategorys()
	{
		categorydao m=(categorydao)context.getBean("categorydao");
		for(category no:m.getAllcategorys())
		{
			System.out.println(no.getcategoryName());
			
		}
			
	}
}
