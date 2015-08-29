/**
 * 
 */
package com.pcms.seacucumber.controller.home;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.common.controller.BaseAction;
import com.pcms.seacucumber.model.news.service.NewsService;
import com.pcms.seacucumber.model.news.vo.NewsVO;

/**
 * @author zhuming
 *
 */
public class HomeControl extends BaseAction{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private NewsService newsService;
	public void setNewsService(NewsService newsService) {
		this.newsService = newsService;
	}
	
	public NewsVO newsVO = new NewsVO();
	public List<NewsVO> newsList = new ArrayList<NewsVO>();
	public List<NewsVO> cultureList = new ArrayList<NewsVO>();
	public List<NewsVO> valueList = new ArrayList<NewsVO>();
	public List<NewsVO> nutritionList = new ArrayList<NewsVO>();
	public List<NewsVO> recipeList = new ArrayList<NewsVO>();

	@Override
	public String initMain() throws Exception {
		// TODO Auto-generated method stub
		Object o = new Object();
		newsList = callSearchResult("1",14,o);
		cultureList  = callSearchResult("2",4,o);
		valueList = callSearchResult("3",5,o);	
		recipeList = callSearchResult("5",5,o);
		nutritionList = callSearchResult("6",5,o);
		return "toInitPage";
	}

	public List<NewsVO> callSearchResult(String categoryId,int count,Object o){
		return newsService.findByCategoryIdWithCount(categoryId, count);
	}
	/**
	 * @return the newsVO
	 */
	public NewsVO getNewsVO() {
		return newsVO;
	}

	/**
	 * @param newsVO the newsVO to set
	 */
	public void setNewsVO(NewsVO newsVO) {
		this.newsVO = newsVO;
	}

	/**
	 * @return the newsList
	 */
	public List<NewsVO> getNewsList() {
		return newsList;
	}

	/**
	 * @param newsList the newsList to set
	 */
	public void setNewsList(List<NewsVO> newsList) {
		this.newsList = newsList;
	}

	public List<NewsVO> getCultureList() {
		return cultureList;
	}

	public void setCultureList(List<NewsVO> cultureList) {
		this.cultureList = cultureList;
	}

	public List<NewsVO> getValueList() {
		return valueList;
	}

	public void setValueList(List<NewsVO> valueList) {
		this.valueList = valueList;
	}

	public List<NewsVO> getNutritionList() {
		return nutritionList;
	}

	public void setNutritionList(List<NewsVO> nutritionList) {
		this.nutritionList = nutritionList;
	}

	public List<NewsVO> getRecipeList() {
		return recipeList;
	}

	public void setRecipeList(List<NewsVO> recipeList) {
		this.recipeList = recipeList;
	}

}
