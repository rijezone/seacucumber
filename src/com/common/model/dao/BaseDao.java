/**
 * 
 */
package com.common.model.dao;

import java.util.List;

/**
 * @author zhuming
 *
 */
public interface BaseDao {

	public void save(Object vo);
	
	public void mod(Object vo);
	
	public void del(Object vo);
	
	public List findByProperty(String propertyName, Object value);
	
	public List findAll();
}
