package hibernate.backend;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import dao.Cartdao;
import dao.Cartdaoimpl;
import dao.Paymentdao;
import dao.Paymentdaoimpl;
import dao.Productdao;
import dao.Productdaoimpl;
import dao.Userdao;
import dao.Userdaoimpl;
import dao.categorydao;
import dao.categorydaoimpl;
import dao.supplierdao;
import dao.supplierdaoimpl;

import java.util.Properties;


@Configuration
	@EnableTransactionManagement
	public class Springconfiguration {
		@Bean
		public Product getProduct()
		{
			Product obj=new Product();
			obj.setProductName("Cofee");
			obj.setPrice(200);
		
			return obj;
		}
		 @Bean("dataSource")
		 public DataSource getH2DataSource()
	     {
	     	System.out.println("Starting of the method getH2DataSource");
	     	DriverManagerDataSource dataSource = new DriverManagerDataSource();
	     	dataSource.setDriverClassName("org.h2.Driver");
	     	dataSource.setUrl("jdbc:h2:tcp://localhost/~/test");
	     	dataSource.setUsername("sa");
	     	dataSource.setPassword("");
	     	System.out.println("Data source creation");
	     	return  dataSource;
	     }
		  @Bean(name="sessionFactory")
			 public SessionFactory getSessionFactory()
		     {  
		     	System.out.println("------Hibernate Properties----");
		     	Properties prop = new Properties();
		     	prop.setProperty("hibernate.hbm2ddl.auto", "update");
		     	prop.put("hibernate.show_sql", "true");
		     	prop.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		     	System.out.println("-----Hibernate properties created----");
		     	
		     	System.out.println("----Local session factory builder object creation----");
		     	LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder( getH2DataSource());
		     	sessionBuilder.addProperties(prop);
		     	sessionBuilder.addAnnotatedClasses(Product.class);
		     	sessionBuilder.addAnnotatedClasses(category.class);
		     	sessionBuilder.addAnnotatedClasses(supplier.class);
		     	sessionBuilder.addAnnotatedClasses(User.class);
		     	sessionBuilder.addAnnotatedClasses(Cart.class);
		     	sessionBuilder.addAnnotatedClasses(Payment.class);
		     	System.out.println("-----Factory builder object created----");
		     	//sessionBuilder.addAnnotatedClasses(Product.class);
		     	
               SessionFactory sessionFactory =sessionBuilder.buildSessionFactory();

		     	System.out.println("Session factory object creation");
		     	//SessionFactory sessionFactory = sessionBuilder.buildSessionFactory();
		     	System.out.println("Session factory object created");
		     	return sessionFactory;
		     	
		     }
		  @Bean("txManagaer")
		  public HibernateTransactionManager getTransactionManager()
		  {
			  HibernateTransactionManager manager=new HibernateTransactionManager(getSessionFactory());
			return manager;
		  }
		  @Bean("productdao")
          public Productdao getproductdao()
		  {
			  Productdaoimpl daoimpl=new Productdaoimpl();
			  return daoimpl;
		  }
		@Bean("categorydao")
        public categorydao getcategorydao()
		  {
			  categorydaoimpl daoimpl=new categorydaoimpl();
			  return daoimpl;
		  }
		@Bean("supplierdao")
        public supplierdao getsupplierdao()
		  {
			  supplierdaoimpl daoimpl=new supplierdaoimpl();
			  return daoimpl;
		  }
		@Bean("Userdao")
		public Userdao getUserdao()
		  {
			  Userdaoimpl daoimpl=new Userdaoimpl();
			  return daoimpl;
		  }
		@Bean("Cartdao")
		public Cartdao getCartdao()
		  {
			  Cartdaoimpl daoimpl=new Cartdaoimpl();
			  return daoimpl;
		  }
		@Bean("Paymentdao")
		public Paymentdao getPaymentdao()
		  {
			  Paymentdaoimpl daoimpl=new Paymentdaoimpl();
			  return daoimpl;
		  }
	}



