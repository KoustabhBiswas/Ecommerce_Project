package com.ecommerce2.ecommercebackend.DaoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ecommerce2.ecommercebackend.Dao.UserDao;
import com.ecommerce2.ecommercebackend.model.User;
@Repository("userdao")
@Transactional
public class UserDaoImpl implements UserDao{
	@Autowired
	SessionFactory sessionFactory;

	public boolean insertUser(User user) {
		// TODO Auto-generated method stub
		 try{
			 sessionFactory.getCurrentSession().save(user);
			return true; 
		 }
		 catch(Exception e){
			 return false; 
		 }
	}

	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public User getById(int id) {
		// TODO Auto-generated method stub
		 return (User)sessionFactory.getCurrentSession().get(User.class, id);
	}
 

}
