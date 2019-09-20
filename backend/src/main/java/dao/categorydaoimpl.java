package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import hibernate.backend.category;

@Repository
@Transactional
public class categorydaoimpl implements categorydao{
	@Autowired
	SessionFactory sessionFactory;

	public boolean addcategory(category m) {

		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.save(m);
		return true;
	}

	public category find(int id) {
		
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from category m where m.id="+id);
		List<category> categorylist=query.list();
		return categorylist.get(0);
	}
	public boolean  updatecategory(category m) {
		Session session= sessionFactory.getCurrentSession();
		session.update(m);		
	  	
		// TODO Auto-generated method stub
		return true;
	}

	public boolean deletecategory(category m) {
		Session session= sessionFactory.getCurrentSession();
		session.delete(m);		
		  	
			// TODO Auto-generated method stub
			return false;
	}

	

	public List<category> getAllcategorys() {
return  sessionFactory.getCurrentSession().createQuery("from category m").list()	;	
	  	
		// TODO Auto-generated method stub
		
	}

	

	

}