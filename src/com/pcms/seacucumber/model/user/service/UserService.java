package com.pcms.seacucumber.model.user.service;

import com.pcms.seacucumber.model.user.vo.UserVO;


/**
 * ��������: 
 * @author ZhuMing
 * @version 2013-4-26
 * @see com.demo.hello.model.login.service
 * @since JDK 1.6
 */
public interface UserService {
	/**
	 * 
	 * ��������: ��ѯ�û�
	 * @author zhuming
	 * @param username
	 * @param userpass
	 * @return
	 * @date 2013-5-2
	 */
	public boolean queryUserByUserAndPass(String username, String userpass);
	
	public boolean chkAddUser(UserVO uservo);
	
	public boolean addUser(UserVO uservo);
	
	public boolean modUser(UserVO uservo);
	
	public boolean delUser(UserVO uservo);
}
