package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import hibernate.backend.Payment;

@Repository
@Transactional
public class Paymentdaoimpl implements Paymentdao{
	@Autowired
	SessionFactory sessionFactory;

	public boolean addPayment(Payment a) {

		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.save(a);
		return true;
	}

	

	public boolean updatePayment(Payment a) {
		Session session= sessionFactory.getCurrentSession();
		session.update(a);		
	  	
		// TODO Auto-generated method stub
		return true;

	}

	public Payment findPayment(int id) {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Payment a where a.id="+id);
		List<Payment> Paymentlist=query.list();
		return Paymentlist.get(0);
	}

	public boolean deletePayment(Payment a) {
		Session session= sessionFactory.getCurrentSession();
		session.delete(a);		
		  	
			// TODO Auto-generated method stub
			return false;
	}

	

	public List<Payment> getAllPayments(String cartid) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Payment a where a.cartid='"+cartid+"' ").list()	;	
 
	}



	public List<Payment> getAllPayments() {
		// TODO Auto-generated method stub
		return null;
	}



	
}