/**
 * 
 */
package com.common.model.service;

import java.util.List;

/**
 * @author zhuming
 *
 */
public interface BaseService {

	public void save(Object vo);
	
	public void mod(Object vo);
	
	public void del(Object vo);
	
	public List findByProperty(String propertyName, Object value);
	
	public List findAll();
}
