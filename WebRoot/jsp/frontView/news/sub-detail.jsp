<%@page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%	
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
 <base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=8" />
<title>海参网新闻列表页</title>
<link rel="stylesheet" href="css/layout.css">
<link rel="stylesheet" href="css/theme.css">
<script src="js/jquery.min.js"></script>
<script src="js/slides.js"></script>
</head>

<body>
<!--头部-->
<div class="header">
  <div class="row">
    <div class="col-3  logo"> <img src="img/logo.png" width="168" height="61"  alt=""/> </div>
    <div class="col-9 nav">
      <ul>
        <li><a href="home/initMain.action"  class="on">首页</a></li>
        <li><a href="news/initMain.action?categoryId=1">行业新闻</a></li>
        <li><a href="news/initMain.action?categoryId=2">海参文化</a></li>
        <li><a href="news/initMain.action?categoryId=3">海参价值</a></li> 
        <li><a href="news/initMain.action?categoryId=7">海参鉴别</a></li>
        <li><a href="news/initMain.action?categoryId=5">海参食谱</a></li>
      </ul>
    </div>
  </div>
</div>
<!--内容-->
<div class="row wap">
  <div class="col-12 sub-banner"><img src="img/s-logo-${newsVO.categoryId }.jpg"/></div>
  <div class="col-12 sub-detail">
    <div class="tit">${newsVO.title }</div>
    <div class="mes"> <span>来源：中国海参网</span> <span>发布日期：<s:date name="newsVO.createTime" format="yyyy-MM-dd"/></span> <span>浏览次数：6534</span></div>
  </div>
  <div class="sub-text">
   <s:property value="newsVO.content" escape="false"/>   
    <div class="up-page">
      <a href="">上一篇：食材明细</a>
      <a href="">下一篇：食材三到四明细</a>
    </div>
  </div>
  
</div>
<div class="bottom">版权所有：海参网   《中华人民共和国电信与信息服务业务经营许可证》   编号：ICP备案号码134343446</div>
</body>
</html>
