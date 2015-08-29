package com.pcms.seacucumber.model.user.service.impl;

import com.pcms.seacucumber.model.user.dao.UserDao;
import com.pcms.seacucumber.model.user.service.UserService;
import com.pcms.seacucumber.model.user.vo.UserVO;


/**
 * ��������: 
 * @author ZhuMing
 * @version 2013-4-26
 * @see com.demo.hello.model.login.service.impl
 * @since JDK 1.6
 */
public class UserServcieImpl implements UserService {
	private UserDao userDao;

	/**
	 * ��������: 
	 * @param username
	 * @param userpass
	 * @return  
	 * @see com.demo.hello.model.login.service.UserService#queryUserByUserAndPass(java.lang.String, java.lang.String)
	 */
	public boolean queryUserByUserAndPass(String username, String userpass) {
		// TODO Auto-generated method stub
		
		return userDao.queryUserByUserAndPass(username, userpass);
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	/**
	 * 
	 * ��������: ����У��
	 * @param uservo
	 * @return  
	 * @see com.demo.hello.model.login.service.UserService#chkAddUser(com.demo.hello.model.login.vo.UserVO)
	 */
	public boolean chkAddUser(UserVO uservo){
		return userDao.chkAddUser(uservo);
	}

	/**
	 * ��������: 
	 * @param uservo
	 * @return  
	 * @see com.demo.hello.model.login.service.UserService#addUser(com.demo.hello.model.login.vo.UserVO)
	 */
	public boolean addUser(UserVO uservo) {
		// TODO Auto-generated method stub
		return userDao.addUser(uservo);
	}

	/**
	 * ��������: 
	 * @param uservo
	 * @return  
	 * @see com.demo.hello.model.login.service.UserService#delUser(com.demo.hello.model.login.vo.UserVO)
	 */
	public boolean delUser(UserVO uservo) {
		// TODO Auto-generated method stub
		return userDao.delUser(uservo);
	}

	/**
	 * ��������: 
	 * @param uservo
	 * @return  
	 * @see com.demo.hello.model.login.service.UserService#modUser(com.demo.hello.model.login.vo.UserVO)
	 */
	public boolean modUser(UserVO uservo) {
		// TODO Auto-generated method stub
		return userDao.modUser(uservo);
	}

}
