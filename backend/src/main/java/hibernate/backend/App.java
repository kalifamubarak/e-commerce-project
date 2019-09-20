package hibernate.backend;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dao.Cartdao;
import dao.Paymentdao;
import dao.Productdao;
import dao.Userdao;
import dao.categorydao;
import dao.supplierdao;
/**
 * Hello world!
 *
 */
public class App 
{
    private static ApplicationContext ctx;

	public static void main( String[] args )
    {
try {
	ctx = new AnnotationConfigApplicationContext(Springconfiguration.class);
Productdao Productdao=(Productdao)ctx.getBean("productdao");
Product p=new Product();
p.setProductName("water");
p.setPrice(10);
p.setQuantity(1);
p.setCategoryid(1);
p.setSupplierid(2);
p.setDescription("3");

if(Productdao.addProduct(p))
{
System.out.println("added");	
}

categorydao categorydao=(categorydao)ctx.getBean("categorydao");
category m=new category();
m.setcategoryName("bullet");


if(categorydao.addcategory(m))
{
System.out.println("added");	
}

supplierdao supplierdao=(supplierdao)ctx.getBean("supplierdao");
supplier n=new supplier();
n.setAddress("pudukkottai");
n.setSupplierName("bulletsound");

if(supplierdao.addsupplier(n))
{
System.out.println("added");	
}

Userdao Userdao=(Userdao)ctx.getBean("Userdao");
User u=new User();
u.setUserid(1);
u.setName("kalifa");
u.setPassword("1234");
u.setMailaddress("arunkumar123@gmail.com");
u.setUser_role("ROLE_USER");
if(Userdao.addUser(u))
{
System.out.println("added");	
}
Cartdao Cartdao=(Cartdao)ctx.getBean("Cartdao");
Cart c=new Cart();
c.setEmail("mail");
c.setProductid(123);
c.setPrice(1200);
c.setCartid("1");
c.setQuantity("1");
if(Cartdao.addCart(c))
{
System.out.println("added");	
}
Paymentdao Paymentdao=(Paymentdao)ctx.getBean("Paymentdao");
Payment a=new Payment();
a.setPaymentname("light");
a.setShippingaddress("no-2,subramaniya nagar,chennai");
a.setCartid("1");

if(Paymentdao.addPayment(a))
{
System.out.println("added");	
}

/*Supplier supplier=(Supplier)ctx.getBean("supplier");
System.out.println(supplier.getProduct().getProductName());
Resource resource=(Resource)ctx.getBean("resource");
resource.getDetails();*/
} catch (Throwable e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
        
    }
}