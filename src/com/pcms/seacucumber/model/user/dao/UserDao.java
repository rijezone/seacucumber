package com.pcms.seacucumber.model.user.dao;

import com.pcms.seacucumber.model.user.vo.UserVO;


/**
 * ��������: 
 * @author ZhuMing
 * @version 2013-4-26
 * @see com.demo.hello.model.login.dao
 * @since JDK 1.6														
 */
public interface UserDao {
	public boolean queryUserByUserAndPass(String username,String userpass);
	
	public boolean chkAddUser(UserVO uservo);
	
	public boolean addUser(UserVO uservo);

	public boolean modUser(UserVO uservo);

	public boolean delUser(UserVO uservo);
}
