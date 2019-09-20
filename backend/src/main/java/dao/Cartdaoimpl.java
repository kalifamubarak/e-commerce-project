package dao;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import hibernate.backend.Cart;

@Repository
	@Transactional
	public class Cartdaoimpl implements Cartdao {

		@Autowired 
		SessionFactory sessionFactory;
		public boolean addCart(Cart c) {

            // TODO Auto-generated method stub
			Session session=sessionFactory.getCurrentSession();
			session.save(c);
			return true;
		

		}

		public boolean deleteCart(Cart c) {
			Session session= sessionFactory.getCurrentSession();
			session.delete(c);		
			  	
				// TODO Auto-generated method stub
				return false;
			}

		public Cart findCart(int id) {
			 Session session=sessionFactory.getCurrentSession();
			 Query query=session.createQuery("from Cart c where c.id="+id);
			 session.get(Cart.class, id);
			 List<Cart> Cartlist=query.list();
			return Cartlist.get(0);
			 
			 
		}
		public boolean updateCart(Cart c) {
			Session session= sessionFactory.getCurrentSession();
			session.update(c);		
		  	
			// TODO Auto-generated method stub
			return true;
		}


		public java.util.List<Cart> getAllCarts() {
			return  sessionFactory.getCurrentSession().createQuery("from Cart c").list()	;
			// TODO Auto-generated method stub
		
	
		}
		
		public int totalelements(String cartid) {
		    Session session=sessionFactory.getCurrentSession();
		    System.out.println(cartid);
		    Query query=session.createQuery("select c from Cart c where c.id='"+cartid+"'");
			Integer size=query.list().size();
			System.out.println(size);
		    // TODO Auto-generated method stub
				return size;
			}
		}