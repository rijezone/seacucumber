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
public class NewsCrudControl extends BaseAction {
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

	/* (non-Javadoc)
	 * @see com.common.controller.BaseAction#initMain()
	 */
	@Override
	public String initMain() throws Exception {
		// TODO Auto-generated method stub
		newsList = newsService.findAll();
		return "toInitPage";
	}

	public String initAdd(){
		addOrModTag = "add";
		initCategory();
		return "toAddOrModPage";
	}
	
	public String initMod(){
		addOrModTag = "mod";
		initCategory();
		return "toAddOrModPage";
	}
	
	public String doSave(){
		System.out.println(newsVO.getContent());
		newsService.save(newsVO);
		return "toInitPage";
	}

	/**
	 * 新闻删除
	 * @return
	 * @throws Exception
	 */
    public String doDelete() throws Exception{   	
    	return "toInitPage";
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
	
	public void initCategory(){
		categoryList = new ArrayList<CategoryVO>();
		/*
		for(int i=0;i<2;i++){
			CategoryVO vo = new CategoryVO();
			vo.setCategoryId(String.valueOf(i+1));
			vo.setName("新闻类"+i+i);
			categoryList.add(vo);
		}*/
		categoryList = categoryService.findAll();
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

}
