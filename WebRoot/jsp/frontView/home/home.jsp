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
<title>海参网首页</title>
<link rel="stylesheet" href="css/layout.css">
<link rel="stylesheet" href="css/theme.css">
<script src="js/jquery.min.js"></script>
<script src="js/slides.js"></script>
<script src="js/food.js"></script>
<script src="jsnewsbanner.js"></script>
<script type="text/javascript">
$(function() {
    $.slide('#container', '.content', '.trigger', {
        auto: true,
        delay: 4000,
        interval: 4000,
        duration: 400,
        easing: 'linear',
        activeCls: 'current'
    });
});

</script>
</head>

<body>
<!--头部-->
<div><a href="newsCrud/initMain.action">登陆</a></div>
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
  <!--banner图-->
  <div id="slide">
    <ul>
      <li><img src="img/banner-1.png"/></li>
      <li><img src="img/banner-2.jpg"/></li>
      <li><img src="img/banner-3.jpg"/></li>
      <li><img src="img/banner-1.png"/></li>
    </ul>
  </div>
  <!--行业新闻-->
  <div class="col-12 news-bg">
    <div class="col-12 news-tit"></div>
    <div class="col-4 news-banner" id="newsBanner">
        
      <div id="container">
    <ul class="clear-fix content">
        <li> <a href="###"><img src="img/news-1.png"/></a> </li>
        <li> <a href="###"><img src="img/news-banner.jpg"/></a> </li>
        
        <li> <a href="###"><img src="img/news-banner-2.jpg"/></a> </li>
        <li> <a href="###"><img src="img/news-1.png"/></a> </li>
        
        <li> <a href="###"><img src="img/news-banner-3.jpg"/></a> </li>
        <li> <a href="###"><img src="img/news-1.png"/></a> </li>
    </ul>
    <ul class="clear-fix trigger">
        <li class="current">1</li>
        <li>2</li>
        <li>3</li>
        <li>4</li>
        <li>5</li>
        <li>6</li>
    </ul>
</div> 
    </div>
    <div class="col-8 news-list">
      <ul>
      	<s:iterator id="news" value="newsList" status="st">
			<s:if test="#st.index==0 or #st.index==1 or #st.index==2 or #st.index==3">
				<li class="new"> <a href="news/showDetails?newsVO.newsId=<s:property value='#news.newsId'/>"> <span class="list"></span> <span class="text"><s:property value="#news.title"/> </span> <span class="time"><s:date name="#news.createTime" format="yyyy-MM-dd"/></span> </a> </li>
			</s:if>
			<s:else>
				<li> <a href="news/showDetails?newsVO.newsId=<s:property value='#news.newsId'/>"> <span class="list"></span> <span class="text"><s:property value="#news.title"/> </span> <span class="time"><s:date name="#news.createTime" format="yyyy-MM-dd"/></span> </a> </li>
			</s:else>
		</s:iterator></ul>
      <div class="clear"></div>
    </div>
  </div>
  <!--海参文化及产地-->
  <div class="col-12 culture-tit"></div>
  <div class="culture">
    <div class="span3 img"><img src="img/img-1.jpg"/></div>
    <div class="span6 text"> <a href=""> 海参又名刺参、海鼠、海瓜，是一种名贵海产动物，因补益作用类似人参而得名。海参肉质软嫩，营养丰富，是典型的高蛋白、低脂肪食物，滋味腴美，风味高雅，是久负盛名的名馔佳肴，是海味“八珍”之一，与燕窝、鲍鱼、鱼翅齐名，在大雅之堂上往往扮演着“压台轴”的角色。 <br>
      中国通称的海参(Sea cucumber)，包括所谓“海地瓜”的全部动物或指干海参。狭义指海参属。海参属是海参纲最大的属，包括120多种。棘皮动物门(Echinodermata)海参纲(Holothuroidea)1,100种无脊椎动物的统称。食用海参如海参属(Holothuria)、刺参属(Stichopus)和梅花参属(Thelonota)的种类。各地海洋中均有，多在浅水中，但有时也在深水中。主要产于印度洋和西太平洋。海参属的80～100种多在珊瑚礁。</a> </div>
    <div class="span3 list">
      <ul>
      	<s:iterator id="culture" value="cultureList">
      		<li> <a href="news/showDetails?newsVO.newsId=<s:property value='#culture.newsId'/>"> <span class="l-dot"></span> <span class="product"><s:property value="#culture.title"/></span></a></li>
      	</s:iterator>
      </ul>
    </div>
  </div>
  <!--海参价值-->
  
  <div class="col-12">
    <div class="span4 news-list nut">
      <div class="nut-1-tit"> </div>
      <ul>
      	<s:iterator id="nutrition" value="nutritionList">
      		<li> <a href="news/showDetails?newsVO.newsId=<s:property value='#nutrition.newsId'/>"> <span class="list"></span> <span class="text"><s:property value="#nutrition.title"/> </span> <span class="time"><s:date name="#nutrition.createTime" format="yyyy-MM-dd"/></span> </a> </li>
      	</s:iterator></ul>
    </div>
    <div class="span4  news-list nut  nut-2">
      <div class="nut-2-tit"> </div>
      <ul>
      	<s:iterator id="value" value="valueList">
      		<li> <a href="news/showDetails?newsVO.newsId=<s:property value='#value.newsId'/>"> <span class="list"></span> <span class="text"><s:property value="#value.title"/> </span> <span class="time"><s:date name="#value.createTime" format="yyyy-MM-dd"/></span> </a> </li>
      	</s:iterator></ul>
    </div>
    <div class="span4  news-list nut ">
      <div class="nut-3-tit"> </div>
      <ul>
      	<s:iterator id="recipe" value="recipeList">
      		<li> <a href="news/showDetails?newsVO.newsId=<s:property value='#recipe.newsId'/>"> <span class="list"></span> <span class="text"><s:property value="#recipe.title"/> </span> <span class="time"><s:date name="#recipe.createTime" format="yyyy-MM-dd"/></span> </a> </li>
      	</s:iterator></ul>
    </div>
  </div>
  <div class="col-12 food" id="food">
    <ul>
      <li><a href=""> <img src="img/s-1.png"/> <span>海参蒸蛋</span> </a> </li>
      <li><a href=""> <img src="img/s-2.png"/> <span>海参蒸蛋</span> </a> </li>
      <li><a href=""> <img src="img/s-1.png"/> <span>海参蒸蛋</span> </a> </li>
      <li><a href=""> <img src="img/s-2.png"/> <span>海参蒸蛋</span> </a> </li>
      <li><a href=""> <img src="img/s-1.png"/> <span>海参蒸蛋</span> </a> </li>
      <li><a href=""> <img src="img/s-2.png"/> <span>海参蒸蛋</span> </a> </li>
      <li><a href=""> <img src="img/s-1.png"/> <span>海参蒸蛋</span> </a> </li>
      <li><a href=""> <img src="img/s-2.png"/> <span>海参蒸蛋</span> </a> </li>
      <li><a href=""> <img src="img/s-1.png"/> <span>海参蒸蛋</span> </a> </li>
      <li><a href=""> <img src="img/s-2.png"/> <span>海参蒸蛋</span> </a> </li>
      <li><a href=""> <img src="img/s-1.png"/> <span>海参蒸蛋</span> </a> </li>
      <li><a href=""> <img src="img/s-2.png"/> <span>海参蒸蛋</span> </a> </li>
      <li><a href=""> <img src="img/s-1.png"/> <span>海参蒸蛋</span> </a> </li>
      <li><a href=""> <img src="img/s-2.png"/> <span>海参蒸蛋</span> </a> </li>
      <div class="clear"></div>
    </ul>
  </div>
</div>
<div class="bottom">版权所有：海参网   《中华人民共和国电信与信息服务业务经营许可证》   编号：ICP备案号码134343446</div>
</body>
</html>

