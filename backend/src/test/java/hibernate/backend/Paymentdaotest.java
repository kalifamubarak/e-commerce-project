package hibernate.backend;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dao.Paymentdao;
import jdk.nashorn.internal.ir.annotations.Ignore;

public class Paymentdaotest {
		public static ApplicationContext context;
		@BeforeClass
		public static void setConfiguration()
		{
			context=new AnnotationConfigApplicationContext(Springconfiguration.class);
		}
		
		@Test 
		public void addPaymentTest()
		{
			Payment a=new Payment();
			a.setPaymentname("phone");
			
		
			Paymentdao dao=(Paymentdao)context.getBean("Paymentdao");
	 assertTrue(dao.addPayment(a));		
		}
		@Test
		public void testfind() {
			Paymentdao a=(Paymentdao)context.getBean("Paymentdao");
			Payment zo=a.findPayment(1);
			System.out.println(zo.getId());
			}
		@Test
		public void testupdatepayment() {
			Paymentdao a=(Paymentdao)context.getBean("Paymentdao");
			Payment zo=a.findPayment(1);
			
			a.updatePayment(zo);
		}
		@Test
		public void testdeletePayment() {
			Paymentdao a=(Paymentdao)context.getBean("Paymentdao");
			Payment zo=a.findPayment(1);
			assert(a.deletePayment(zo));
			
		}
			

	

}
