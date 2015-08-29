package com.pcms.seacucumber.model.category.vo;
// default package

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


/**
 * CategoryVO entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_category"
    ,catalog="pcms"
, uniqueConstraints = @UniqueConstraint(columnNames="sn")
)

public class CategoryVO  implements java.io.Serializable {


    // Fields    

     private String categoryId;
     private Integer sn;
     private String name;


    // Constructors

    /** default constructor */
    public CategoryVO() {
    }

    
    /** full constructor */
    public CategoryVO(String categoryId, Integer sn, String name) {
        this.categoryId = categoryId;
        this.sn = sn;
        this.name = name;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="categoryId", unique=true, nullable=false, length=45)

    public String getCategoryId() {
        return this.categoryId;
    }
    
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }
    
    @Column(name="sn", unique=true, nullable=false)

    public Integer getSn() {
        return this.sn;
    }
    
    public void setSn(Integer sn) {
        this.sn = sn;
    }
    
    @Column(name="name", nullable=false)

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
   








}