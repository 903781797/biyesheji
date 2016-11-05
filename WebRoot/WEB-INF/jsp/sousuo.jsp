<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width,initial-scale=1" />
		<title></title>
		<link rel="stylesheet" href="bootstrap-3.3.5-dist/css/bootstrap.min.css" type="text/css" />
		<link rel="stylesheet" href="css/index.css" />
		<script src="js/jquery.min.js"></script>
		<script src="bootstrap-3.3.5-dist/js/bootstrap.min.js"></script>
		<link rel="stylesheet" href="css/video-js.css" />
		<link rel="stylesheet" href="css/userCenter.css" />
		<script type="text/javascript" src="js/video.js"></script>
		<script src="js/userMenu.js"></script>
		<script src="js/doT.js"></script>
	</head>
	<body>
			<%@ include file="commen/head.jsp"%>
		
		<div class="container mypadding">
			
			
			
			<div class="col-lg-12 ">
			<form action="article_search">
					<div style="margin: 50px auto;padding: auto; width: 100%;overflow:hidden;">
						<input id="serch" style="float:left;padding-left: 15px;border: none;height:40px;width: 70%;margin-left: 10%;border-bottom-left-radius: 5px;
border-top-left-radius: 5px;" placeholder="按课程名搜索" type="text" value="  <s:property value="o.search "/>  " name="articleId">
<input style="float:left;color: #ffffff;background-color:#4cae4c;border: none;height:40px;width: 10%;margin: 0px;border-bottom-right-radius: 5px;
border-top-right-radius: 5px;margin-right: 10%;" value="搜索" type="button">
			</div></form>
<s:if test="o.course!=null">
						<s:iterator value="o.course">
						<div class="bgwrite uc-classMapping">
							<div class="col-lg-3"><img src="<s:property value="coimg "/>" width="174" height="119"></div>
							<div class="col-lg-7 uc-class">
								<p class="uc-className">
									<span class="glyphicon glyphicon-list-alt uc-classIco"></span> <s:property value="coname "/>
								</p>
								<p><span>课程介绍：</span><s:property value="codesc "/></p>
								<p><span>学习人数：</span><s:property value="count "/>人
									
								</p>
							</div>
							<div class="col-lg-2" style="line-height: 119px;">
								<a href="index_courseHome?courseid=<s:property value="coid "/>" class="btn btn-success">开始学习</a>
							</div>
						</div>
						</s:iterator>
						</s:if><s:else>
						<div class="text-center">没有查询结果</div>
						</s:else>
						<div class=" text-center">
							<ul class="pagination pagination-sm">
								<li>
									<a href="#">&laquo;</a>
								</li>
								<li class="active">
									<a href="#">1</a>
								</li>
								
								<li>
									<a href="#">&raquo;</a>
								</li>
							</ul>
						</div>
		</div>
	</body>
</html>
