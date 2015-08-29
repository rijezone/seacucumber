package com.pcms.seacucumber.model.category.dao.impl;

import static org.hibernate.criterion.Example.create;

import java.util.List;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pcms.seacucumber.model.category.dao.CategoryDao;
import com.pcms.seacucumber.model.category.vo.CategoryVO;

/**
 * A data access object (DAO) providing persistence and search support for CategoryVO entities.
 * Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
 * @see .CategoryVO
 * @author MyEclipse Persistence Tools 
 */

public class CategoryDaoImpl implements CategoryDao{
	private static final Logger log = LoggerFactory.getLogger(CategoryDaoImpl.class);
	//property constants
	public static final String NAME = "name";

	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	private Session session;
	public Session getSession() {
		return sessionFactory.openSession();
	}



	public void save(CategoryVO transientInstance) {
		log.debug("saving CategoryVO instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CategoryVO persistentInstance) {
		log.debug("deleting CategoryVO instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CategoryVO findById( java.lang.String id) {
		log.debug("getting CategoryVO instance with id: " + id);
		try {
			CategoryVO instance = (CategoryVO) getSession()
					.get("CategoryVO", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}


	public List<CategoryVO> findByExample(CategoryVO instance) {
		log.debug("finding CategoryVO instance by example");
		try {
			List<CategoryVO> results = (List<CategoryVO>) getSession()
					.createCriteria("CategoryVO")
					.add( create(instance) )
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}    

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding CategoryVO instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from CategoryVO as model where model." 
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<CategoryVO> findByName(Object name
			) {
		return findByProperty(NAME, name
				);
	}


	public List findAll() {
		log.debug("finding all CategoryVO instances");
		try {
			String queryString = "from CategoryVO";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CategoryVO merge(CategoryVO detachedInstance) {
		log.debug("merging CategoryVO instance");
		try {
			CategoryVO result = (CategoryVO) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CategoryVO instance) {
		log.debug("attaching dirty CategoryVO instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CategoryVO instance) {
		log.debug("attaching clean CategoryVO instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}



	public void save(Object vo) {
		// TODO Auto-generated method stub
		
	}



	public void mod(Object vo) {
		// TODO Auto-generated method stub
		
	}



	public void del(Object vo) {
		// TODO Auto-generated method stub
		
	}
}