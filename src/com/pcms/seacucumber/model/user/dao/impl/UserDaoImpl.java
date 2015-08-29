package com.pcms.seacucumber.model.user.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.pcms.seacucumber.model.user.dao.UserDao;
import com.pcms.seacucumber.model.user.vo.UserVO;

/**
 * ��������: 
 * @author ZhuMing
 * @version 2013-4-26
 * @see com.demo.hello.model.login.dao.impl
 * @since JDK 1.6
 */
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
    private Connection conn;
	/**
	 * ��������: 
	 * @param username
	 * @param userpass
	 * @return  
	 * @see com.demo.hello.model.login.dao.UserDao#queryUserByUserAndPass(java.lang.String, java.lang.String)
	 */
	public boolean queryUserByUserAndPass(String username, String userpass) {
		// TODO Auto-generated method stub	
		boolean existtag = false;
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		try {
			String sql = "select * from com_t_users where username='"+username+"' and userpass = '"+userpass+"'";
			SQLQuery query = session.createSQLQuery(sql);
			List<Object[]> list = query.list();
			tx.commit();
			if(list.size()>0) existtag = true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			tx.rollback();
			existtag = false;
			//e.printStackTrace();
		}finally{
			session.close();
		}
		return existtag;
	}
	
	public boolean chkAddUser(UserVO uservo){
		boolean addtag = true;
		
		return addtag;
	}

	/**
	 * 功能描述: 
	 * @param uservo
	 * @return  
	 * @see com.demo.hello.model.login.dao.UserDao#addUser(com.demo.hello.model.login.vo.UserVO)
	 */
	public boolean addUser(UserVO uservo) {
		boolean succefultag = true;
		
		return succefultag;
	}							

	/**
	 * ��������: 
	 * @param uservo
	 * @return  
	 * @see com.demo.hello.model.login.dao.UserDao#delUser(com.demo.hello.model.login.vo.UserVO)
	 */
	public boolean delUser(UserVO uservo) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * ��������: 
	 * @param uservo
	 * @return  
	 * @see com.demo.hello.model.login.dao.UserDao#modUser(com.demo.hello.model.login.vo.UserVO)
	 */
	public boolean modUser(UserVO uservo) {
		// TODO Auto-generated method stub
		return false;
	}

}
