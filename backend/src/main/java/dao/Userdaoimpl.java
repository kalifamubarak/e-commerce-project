package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import hibernate.backend.User;

@Repository
@Transactional
public class Userdaoimpl implements Userdao{
	
	@Autowired
	SessionFactory sessionFactory;
	public boolean addUser(User u) {

		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.save(u);
		return true;
	}
	

	


	public User findUser(int id) {
		System.out.println("finding supplier with id"+id);
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from User n where n.Userid="+id);
		List<User> Userlist=query.list();
		return Userlist.get(0);
	}

	


	public boolean updateUser(User u) {
		Session session= sessionFactory.getCurrentSession();
		session.update(u);		
		  	
			// TODO Auto-generated method stub
			return true;
	}


	public boolean deleteUser(User u) {
		Session session= sessionFactory.getCurrentSession();
		session.delete(u);		
	  	
		// TODO Auto-generated method stub
		return false;

	}


	public List<User> getAllUsers() {
		return	( sessionFactory.getCurrentSession().createQuery("from User m").list());
	  	
		// TODO Auto-generated method stub
	}


}
