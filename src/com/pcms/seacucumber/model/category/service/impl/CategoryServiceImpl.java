/**
 * 
 */
package com.pcms.seacucumber.model.category.service.impl;

import java.util.List;

import com.pcms.seacucumber.model.category.dao.CategoryDao;
import com.pcms.seacucumber.model.category.service.CategoryService;

/**
 * @author zhuming
 *
 */
public class CategoryServiceImpl implements CategoryService {
	private CategoryDao categoryDao;
	public void setCategoryDao(CategoryDao categoryDao) {
		this.categoryDao = categoryDao;
	}

	/* (non-Javadoc)
	 * @see com.common.model.service.BaseService#save(java.lang.Object)
	 */
	public void save(Object vo) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.common.model.service.BaseService#mod(java.lang.Object)
	 */
	public void mod(Object vo) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.common.model.service.BaseService#del(java.lang.Object)
	 */
	public void del(Object vo) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.common.model.service.BaseService#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		// TODO Auto-generated method stub
		return categoryDao.findByProperty(propertyName, value);
	}

	/* (non-Javadoc)
	 * @see com.common.model.service.BaseService#findAll()
	 */
	public List findAll() {
		// TODO Auto-generated method stub
		return categoryDao.findAll();
	}

}
