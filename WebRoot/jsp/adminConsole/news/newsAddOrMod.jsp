<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'newsAddOrMod.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script src="js/ckeditor/ckeditor.js"></script>
	<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
  </head>
  
  <body>
	<form name="doAddOrMod" action="newsCrud/doSave.action" method="post" enctype="multipart/form-data">
	
			<label class="label">新闻主题：</label>
  			<input type="text" name="newsVO.title" value="${newsVO.title }"/>
  			<br/>
  			<label class="label">新闻类型：</label>
  			<select class="rightSelect175" name="newsVO.categoryId">
  				<s:iterator id="category" value="categoryList">
					<option value="<s:property value='#category.categoryId'/>" <s:if test="#category.categoryId==newsVO.categoryId">selected</s:if> >
							<s:property value="#category.name" />
					</option>
				</s:iterator>
			</select>
			
		<!-- 	<s:select list="categoryList" listKey="categoryId" listValue="name" label="新闻类型：" name="newsVO.categoryId" headerKey="0" headerValue="--请选择--"></s:select>		
           	<br/>
           	
           	<label class="label">新闻类型：</label>
           	<select name="newsVO.categoryId" class="rightSelect175">
                      <c:forEach items="${categoryList}" var="zl">
				          <option value="${zl.categoryId }" <c:if test="${zl.categoryId==newsVO.categoryId}">selected="selected"</c:if>>${zl.name }</option>
				      </c:forEach>
            </select>
            --> 
            <textarea name="newsVO.content" id="editor1" rows="10" cols="80">
                
            </textarea>
            <input type="submit" value="提交"/>
            <input type="reset" value="重置"/>
            <script>
                // Replace the <textarea id="editor1"> with a CKEditor
                // instance, using default configuration.
                
                CKEDITOR.replace( 'editor1' );
            </script>
        </form>
  </body>
</html>
