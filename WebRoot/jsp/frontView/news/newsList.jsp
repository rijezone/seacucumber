<%@page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%	
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=8" />
<title>海参网新闻列表页</title>
<link rel="stylesheet" href="/css/layout.css">
<link rel="stylesheet" href="/css/theme.css">
<script src="/js/jquery.min.js"></script>
<script src="/js/slides.js"></script>
</head>

<body>
<!--头部-->
<div class="header">
  <div class="row">
    <div class="col-3  logo"> <img src="../img/logo.png" width="168" height="61"  alt=""/> </div>
    <div class="col-9 nav">
      <ul>
        <li><a href="/home/initMain.action" >首页</a></li>
        <li><a href="/news/initMain.action?categoryId=1" class="<s:if test='newsVO.categoryId==1'>on</s:if>">行业新闻</a></li>
        <li><a href="/news/initMain.action?categoryId=2" class="<s:if test='newsVO.categoryId==2'>on</s:if>">海参文化</a></li>
        <li><a href="/news/initMain.action?categoryId=3" class="<s:if test='newsVO.categoryId==3'>on</s:if>">海参价值</a></li> 
        <li><a href="/news/initMain.action?categoryId=7" class="<s:if test='newsVO.categoryId==7'>on</s:if>">海参鉴别</a></li>
        <li><a href="/news/initMain.action?categoryId=5" class="<s:if test='newsVO.categoryId==5'>on</s:if>">海参食谱</a></li>
      </ul>
    </div>
  </div>
</div>
<!--内容-->
<div class="row wap"> 
 <div class="col-12 sub-banner"><img src="../img/s-logo-${newsVO.categoryId }.jpg"/></div>
 <div class="col-12 sub-list">
			<ul>
				<s:iterator id="news" value="newsList" status="st">
					<s:if test="#st.index==1 or #st.index==0">
						<li class="hot">
							<a href="/news/showDetails?newsVO.newsId=<s:property value='#news.newsId'/>">
							<div class="tit"><s:property value="#news.title" /></div>
							<div class="time"><s:date name="#news.createTime" format="yyyy-MM-dd HH:MM"/><sup><img src="../img/new.gif" /></sup></div>
							<div class="txt-con">
								<s:property value="#news.content" escape="false"/>
							</div>
							<div class="sub-more"></div>
							</a>
						</li>
					</s:if>
					<s:else>
						<li><a href="/news/showDetails?newsVO.newsId=<s:property value='#news.newsId'/>">
							<div class="tit"><s:property value="#news.title" /></div>
							<div class="time"><s:date name="#news.createTime" format="yyyy-MM-dd HH:MM"/></div>
							<div class="txt-con">
								<s:property value="#news.content" escape="false"/>
							</div>
							<div class="sub-more"></div> </a>
						</li>
					</s:else>
				</s:iterator>
				<div class="clear"></div>
			</ul>

			<div class="page">
    <a href="">上一页</a>
    <a href="" class="on">1</a>
    <a href="">2</a>
    <a href="">3</a>
    <a href="">下一页</a>
   </div>
 </div>
</div>

<div class="bottom">版权所有：海参网   《中华人民共和国电信与信息服务业务经营许可证》   编号：ICP备案号码134343446</div>
</body>
</html>
