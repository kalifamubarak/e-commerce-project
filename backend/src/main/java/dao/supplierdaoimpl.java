package dao;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import hibernate.backend.supplier;

@Repository
@Transactional
public  class supplierdaoimpl implements supplierdao{
	@Autowired
	SessionFactory sessionFactory;

	public boolean addsupplier(supplier n) {
		Session session=sessionFactory.getCurrentSession();
		session.save(n);
		return true;
	}

	public supplier findsupplier(int id) {
		System.out.println("finding supplier with id"+id);
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from supplier n where n.id="+id);
		List<supplier> supplierlist=query.list();
		return supplierlist.get(0);
	}


	public boolean updatesupplier(supplier n) {
		Session session= sessionFactory.getCurrentSession();
		session.update(n);		
		  	
			// TODO Auto-generated method stub
			return true;
		}

	
	

	public boolean deletesupplier( supplier n) {
		Session session= sessionFactory.getCurrentSession();
		session.delete(n);		
	  	
		// TODO Auto-generated method stub
		return false;
	}

	
	public List<supplier> getAllsuppliers() {
	     
	return	( sessionFactory.getCurrentSession().createQuery("from supplier m").list());
			  	
			// TODO Auto-generated method stub
			
		}

	
	}

	
	
	

	
	
