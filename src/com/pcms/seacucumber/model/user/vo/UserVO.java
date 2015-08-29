package com.pcms.seacucumber.model.user.vo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * ��������: 
 * @author ZhuMing
 * @version 2013-4-26
 * @see com.demo.hello.model.login.vo
 * @since JDK 1.6
 */
@Entity
public class UserVO implements Serializable, Cloneable {

	@Id
	@GeneratedValue
	private static final long serialVersionUID = 1L;
	private String username;
	private String userpass;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpass() {
		return userpass;
	}
	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}
}
