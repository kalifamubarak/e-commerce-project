package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import hibernate.backend.Product;

@Repository
@Transactional
public class Productdaoimpl implements Productdao{
	@Autowired
	SessionFactory sessionFactory;

	public boolean addProduct(Product p) {

		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.save(p);
		return true;
	}

	
		public Product findProduct(int id) {
			System.out.println("finding product with id"+id);
			// TODO Auto-generated method stub
			Session session=sessionFactory.getCurrentSession();
			Query query=session.createQuery("from Product p where p.id="+id);
			List<Product> Productlist=query.list();
			return(Product)Productlist.get(0);
		}	

	public boolean updateProduct(Product p) {
		Session session =sessionFactory.getCurrentSession();
		 session.update(p);		
		  	
			// TODO Auto-generated method stub
			return true;
	}

	public boolean deleteProduct(Product p) {
		 Session session=sessionFactory.getCurrentSession();
		 session.delete(p);		
		  	
			// TODO Auto-generated method stub
			return false;
	}

	public List<Product> getAllproducts() {
return  sessionFactory.getCurrentSession().createQuery("from Product p").list()	;	
	  	
		// TODO Auto-generated method stub
		
	}

	

}