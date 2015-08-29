/**
 * 
 */
package com.pcms.seacucumber.model.news.service;

import java.util.List;

import com.pcms.seacucumber.model.news.vo.NewsVO;

/**
 * @author zhuming
 *
 */
public interface NewsService {

	public void save(NewsVO vo);
	
	public void mod(NewsVO vo);
	
	public void del(NewsVO vo);
	
	public List findByProperty(String propertyName, Object value);
	
	public List findByTitle(Object vo);
	
	public List findByCategoryId(Object categoryId);

	public List findByCreateUser(Object createUser);
	
	public List findAll();
	
	public NewsVO findById(Integer id);
	
	public List findByCategoryIdWithCount(Object categoryId,int count);
}
