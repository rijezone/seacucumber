/**
 * 
 */
package com.pcms.seacucumber.controller.news;

import java.util.ArrayList;
import java.util.List;

import com.common.controller.BaseAction;
import com.pcms.seacucumber.model.category.service.CategoryService;
import com.pcms.seacucumber.model.category.vo.CategoryVO;
import com.pcms.seacucumber.model.news.service.NewsService;
import com.pcms.seacucumber.model.news.vo.NewsVO;

/**
 * @author zhuming
 *
 */
public class NewsShowControl extends BaseAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private NewsService newsService;
	private CategoryService categoryService;
	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	public NewsVO newsVO = new NewsVO();
	public List<NewsVO> newsList = new ArrayList<NewsVO>();
	public List<CategoryVO> categoryList;
	public String addOrModTag = "";
	public String categoryId = "";

	/* (non-Javadoc)
	 * @see com.common.controller.BaseAction#initMain()
	 */
	@Override
	public String initMain() throws Exception {
		// TODO Auto-generated method stub
		//newsList = newsService.findAll();
		newsList = newsService.findByCategoryId(categoryId);
		newsVO.setCategoryId(categoryId);
		return "toInitPage";
	}
	
	public String showDetails(){
	//	newsVO = new NewsVO();
//		newsVO = newsService.findById(newsVO.getNewsId());
		newsVO = (NewsVO) newsService.findByProperty("newsId", newsVO.getNewsId()).get(0);
		return "toDetailPage";
	}
 
	/**
	 * 条件查询
	 * @return
	 * @throws Exception
	 */
	public String callConditionSearch() throws Exception{
		//callQueryResult();
		return "toInitPage";
	}
	
	public List callSearchResult(){
		List list = new ArrayList();
		return list;
	}

	public void setNewsService(NewsService newsService) {
		this.newsService = newsService;
	}

	public NewsService getNewsService() {
		return newsService;
	}

	public List<NewsVO> getNewsList() {
		return newsList;
	}

	public void setNewsList(List<NewsVO> newsList) {
		this.newsList = newsList;
	}

	public NewsVO getNewsVO() {
		return newsVO;
	}

	public void setNewsVO(NewsVO newsVO) {
		this.newsVO = newsVO;
	}

	public List<CategoryVO> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(List<CategoryVO> categoryList) {
		this.categoryList = categoryList;
	}

	public String getAddOrModTag() {
		return addOrModTag;
	}

	public void setAddOrModTag(String addOrModTag) {
		this.addOrModTag = addOrModTag;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

}
