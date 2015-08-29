package com.pcms.seacucumber.model.news.vo;

// default package

import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * NewsVO entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_news", catalog = "pcms")
public class NewsVO implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer newsId;
	private String title;
	private String categoryId;
	private Timestamp createTime;
	private String createUser;
	private String content;

	// Constructors

	/** default constructor */
	public NewsVO() {
	}

	/** full constructor */
	public NewsVO(String title, String categoryId, Timestamp createTime,
			String createUser, String content) {
		this.title = title;
		this.categoryId = categoryId;
		this.createTime = createTime;
		this.createUser = createUser;
		this.content = content;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "newsId", unique = true, nullable = false)
	public Integer getNewsId() {
		return this.newsId;
	}

	public void setNewsId(Integer newsId) {
		this.newsId = newsId;
	}

	@Column(name = "title", length = 200)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "categoryId", length = 45)
	public String getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	@Column(name = "createTime", length = 19, insertable = false, updatable = false)
	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	@Column(name = "createUser", length = 45)
	public String getCreateUser() {
		return this.createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	@Column(name = "content")
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}