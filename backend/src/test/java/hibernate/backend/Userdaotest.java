package hibernate.backend;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dao.Userdao;
import dao.Userdao;

public class Userdaotest {
	public static ApplicationContext context;
	@BeforeClass
	public static void setConfiguration()
	{
		context=new AnnotationConfigApplicationContext(Springconfiguration.class);
	}
	
	@Test 
	public void addUserTest()
	{
		User u=new User();
		u.setUserid(1);
		u.setName("kishore");
		u.setPassword("1234");
		u.setMailaddress("kishore123@gmail.com");
		u.setUser_role("User");
		Userdao dao=(Userdao)context.getBean("Userdao");
 assertTrue(dao.addUser(u));		
	}
	@Test
	public void testfindUser() {
		Userdao u=(Userdao)context.getBean("Userdao");
		User po=u.findUser(3);
		System.out.println(po.getUserid());
		}

	@Test
	public void testupdateUser() {
		Userdao u=(Userdao)context.getBean("Userdao");
		User po=u.findUser(2);
	
		u.updateUser(po);
	}

	@Test
	public void testdeleteUser() {
		Userdao u=(Userdao)context.getBean("Userdao");
		User po=u.findUser(1);
	u.deleteUser(po);
		
	}
	@Test
	public void testGetallUsers()
	{
		Userdao u=(Userdao)context.getBean("Userdao");
		for(User po:u.getAllUsers())
		{
			System.out.println(po.getUserid());
			
		}
			
	}



	
}
