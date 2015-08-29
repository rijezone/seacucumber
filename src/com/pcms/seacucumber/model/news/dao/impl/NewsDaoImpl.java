package com.pcms.seacucumber.model.news.dao.impl;
// default package

import java.util.List;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pcms.seacucumber.model.news.dao.NewsDao;
import com.pcms.seacucumber.model.news.vo.NewsVO;

/**
 * A data access object (DAO) providing persistence and search support for NewsVO entities.
 * Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
 * @see .NewsVO
 * @author MyEclipse Persistence Tools 
 */

public class NewsDaoImpl implements NewsDao {
	private static final Logger log = LoggerFactory.getLogger(NewsDao.class);
	//property constants
	public static final String TITLE = "title";
	public static final String CATEGORY_ID = "categoryId";
	public static final String CREATE_USER = "createUser";
	public static final String CONTENT = "content";

	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	private Session session;
	public Session getSession() {
		return sessionFactory.openSession();
	}

	public void save(NewsVO transientInstance) {
		log.debug("saving NewsVO instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(NewsVO persistentInstance) {
		log.debug("deleting NewsVO instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public NewsVO findById( java.lang.Integer id) {
		log.debug("getting NewsVO instance with id: " + id);
		try {
			NewsVO instance = (NewsVO) getSession()
					.get("NewsVO", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}


	public List findByExample(NewsVO instance) {
		log.debug("finding NewsVO instance by example");
		try {
			List results = getSession()
					.createCriteria("NewsVO")
					.add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}    

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding NewsVO instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from NewsVO as model where model." 
					+ propertyName + "= ? order by model.createTime desc";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByTitle(Object title
			) {
		return findByProperty(TITLE, title
				);
	}

	public List findByCategoryId(Object categoryId
			) {
		return findByProperty(CATEGORY_ID, categoryId
				);
	}

	public List findByCreateUser(Object createUser
			) {
		return findByProperty(CREATE_USER, createUser
				);
	}

	public List findByContent(Object content
			) {
		return findByProperty(CONTENT, content
				);
	}


	public List findAll() {
		log.debug("finding all NewsVO instances");
		try {
			String queryString = "from NewsVO as news order by news.createTime desc";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public NewsVO merge(NewsVO detachedInstance) {
		log.debug("merging NewsVO instance");
		try {
			NewsVO result = (NewsVO) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(NewsVO instance) {
		log.debug("attaching dirty NewsVO instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(NewsVO instance) {
		log.debug("attaching clean NewsVO instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void mod(NewsVO vo) {
		// TODO Auto-generated method stub
		merge(vo);
	}

	public void del(NewsVO vo) {
		// TODO Auto-generated method stub
		delete(vo);
	}

	public List findByCategoryIdWithCount(Object categoryId, int count) {
		log.debug("finding NewsVO instances with count and categoryId");
		try {
			String queryString = "from NewsVO as model where model.categoryId= ? order by model.createTime desc";
			Query queryObject = getSession().createQuery(queryString).setFirstResult(0).setMaxResults(count);
			queryObject.setParameter(0, categoryId);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
}