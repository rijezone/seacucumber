/**
 * 
 */
package com.pcms.seacucumber.model.news.service.impl;

import java.util.List;

import com.pcms.seacucumber.model.news.dao.NewsDao;
import com.pcms.seacucumber.model.news.service.NewsService;
import com.pcms.seacucumber.model.news.vo.NewsVO;

/**
 * @author zhuming
 *
 */
public class NewsServiceImpl implements NewsService{
	public NewsDao newsDao;
	public void setNewsDao(NewsDao newsDao) {
		this.newsDao = newsDao;
	}

	public void save(NewsVO vo) {
		// TODO Auto-generated method stub
		newsDao.save(vo);
	}

	public void mod(NewsVO vo) {
		// TODO Auto-generated method stub
		newsDao.mod(vo);
	}

	public void del(NewsVO vo) {
		// TODO Auto-generated method stub
		newsDao.del(vo);
	}

	public List findByProperty(String propertyName, Object value) {
		// TODO Auto-generated method stub
		return newsDao.findByProperty(propertyName, value);
	}

	public List findByTitle(Object vo) {
		// TODO Auto-generated method stub
		return newsDao.findByTitle(vo);
	}

	public List findByCategoryId(Object categoryId) {
		// TODO Auto-generated method stub
		return newsDao.findByCategoryId(categoryId);
	}

	public List findByCreateUser(Object createUser) {
		// TODO Auto-generated method stub
		return newsDao.findByCreateUser(createUser);
	}

	public List findAll() {
		// TODO Auto-generated method stub
		return newsDao.findAll();
	}

	public NewsVO findById(Integer id) {
		// TODO Auto-generated method stub
		return newsDao.findById(id);
	}

	public List findByCategoryIdWithCount(Object categoryId, int count) {
		// TODO Auto-generated method stub
		return newsDao.findByCategoryIdWithCount(categoryId, count);
	}

	

}
