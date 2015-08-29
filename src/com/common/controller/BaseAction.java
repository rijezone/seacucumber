/**
 * 
 */
package com.common.controller;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author zhuming
 *
 */
public abstract class BaseAction extends ActionSupport {

	/**
	 * initMain接口
	 * @return
	 * @throws Exception
	 */
	public abstract String initMain() throws Exception;
}
