<%@ page language="java" import="java.util.*,com.jingpinke.entity.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1" />
<title></title>
<link rel="stylesheet" href="bootstrap-3.3.5-dist/css/bootstrap.min.css"
	type="text/css" />
<link rel="stylesheet" href="css/index.css" />

<script src="js/jquery.min.js"></script>
<script src="bootstrap-3.3.5-dist/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/video-js.css" />
<link rel="stylesheet" href="css/active.css" />
<script type="text/javascript" src="js/video.js"></script>
<script src="js/userMenu.js"></script>

</head>

<body data-spy="scroll" data-target="#myScrollspy">
	<!--
        	作者：zhaoqingchun163@163.com
        	时间：2016-08-01
        	描述：主导航
        -->
	<%@ include file="commen/head.jsp"%>
	<!--
              	作者：zhaoqingchun163@163.com
              	时间：2016-08-01
              	描述：副导航
              -->
	<div class="menu2">
		<div class="container">
			<ul class="list-unstyled mysmallmenubody">
				<li><a href="index_courseHome?courseid=<s:property value="allCourse.course.coid"/>">课程概况</a></li>
				<li><a href="index_videoList?courseid=<s:property value="allCourse.course.coid"/>">教学录像</a></li>
				<li><a href="index_resource?courseid=<s:property value="allCourse.course.coid"/>">教学资源</a></li>
		<li><a href="index_testpaper?courseid=<s:property value="allCourse.course.coid"/>">模拟试题</a></li>
				<li><a href="index_dayi?courseid=<s:property value="allCourse.course.coid"/>">在线答疑</a></li>
			<li><a href="index_taskList?courseid=<s:property value="allCourse.course.coid"/>">作业</a></li>
			</ul>
		</div>
	</div>
	<!-- 副导航end -->
	<div class="container myspacing">
		<ol class="breadcrumb bgwrite myborder ">
			当前位置：
			<li class=""><s:property value="allCourse.course.coname"/></li>
		</ol>
	</div>
	<div class="container ">
		<!--
        	作者：zhaoqingchun163@163.com
        	时间：2016-08-01
        	描述：课程简介
        -->
		<div class="row">
			<div class="col-lg-12">
				<div class="titlebox myborder bgwrite">
					<div class="title_img ">
						<img width="300px" height="200px" src="<s:property value="allCourse.course.coimg"/>" />
						<!--<video id="my-video" class="video-js vjs-big-play-centered "
							width="300px" height="200px" controls preload="auto"
							data-setup=""> <!--poster=""--> <source src="video/1.mp4"
							type='video/mp4' /> </video>
					</div>
					<div class="title-content col-lg-8">
						<h2><s:property value="allCourse.course.coname"/></h2>
						<p class="myintroduction"><s:property value="allCourse.course.coi "/></p>
					</div>
				</div>
			</div>
			<!--课程简介end-->
			<!--
            	作者：zhaoqingchun163@163.com
            	时间：2016-08-02
            	描述：课程描述
            -->

			<div class="col-lg-9 ">
				<div class="myborder myspacing bgwrite">
					<div class="texttitle" id="section-1">课程描述</div>
					<div class="content">
						<s:property value="allCourse.course.codesc "/>
					</div>
					<div class="texttitle" id="section-2">预备知识</div>
					<div class="content"><s:property value="allCourse.course.coknow "/></div>
					<div class="texttitle" id="section-3">课程大纲</div>
					<div class="content">
					<s:iterator value="allCourse.chapter">
						<p class="chapter"><s:property value="name"/></p>
					</s:iterator>
						<h4>1. 什么是设计</h4>
					
						<p class="chapter">1.2 什么是设计</p>
						<p class="chapter">1.3 设计的几个性质</p>
						<h4>2. 什么是好设计</h4>
						<p class="chapter">2.1 你心目中的好设计</p>
						<p class="chapter">2.2 好设计的标准</p>
						<p class="chapter">2.3 好设计的价值</p>
						<h4>1. 什么是设计</h4>
						<p class="chapter">1.1 为什么说人人爱设计</p>
						<p class="chapter">1.2 什么是设计</p>
						<p class="chapter">1.3 设计的几个性质</p>
						<h4>2. 什么是好设计</h4>
						<p class="chapter">2.1 你心目中的好设计</p>
						<p class="chapter">2.2 好设计的标准</p>
						<p class="chapter">2.3 好设计的价值</p>
					</div>
					<!--contentend-->
					<div class="texttitle" id="section-4">授课教师</div>
					<div class="content">
						<ul class="list-unstyled">
						<s:iterator value="allCourse.teacher">
							<li><img src="<s:property value="tico"/>" width="80px" height="80px"
								class="img-circle">
								<p>
									<s:property value="tname"/><span><s:property value="ttitl"/></span>
								</p></li>
								</s:iterator>
						</ul>
					</div>
				</div>
			</div>
			<!--
                  	作者：zhaoqingchun163@163.com
                  	时间：2016-08-02
                  	描述：课程信息
                  -->
			<div class="addbody hidden-xs" style=" ">
				<div class="addclass  bgwrite myspacing myborder  " data-spy="affix"
					id="addclass" data-offset-top="325">

					<div class="texttitle2">课程信息</div>
					<div class="content" id="myScrollspy">
						<p class="content">课程时长：99小时99分</p>
						<center>
							<a class="btn btn-success addclassbtn" />加入课程</a>
							<div class="catalog">
								<div class="arrow"></div>
								<div class="mylogs">
									<ul class="nav  nav-stacked">
										<li class="active"><a href="#section-1">课程描述</a></li>
										<li><a href="#section-2">预备知识</a></li>
										<li><a href="#section-3">课程大纲</a></li>
										<li><a href="#section-4">授课教师</a></li>
									</ul>
								</div>
							</div>
						</center>
					</div>
				</div>

			</div>

			<div class="col-lg-3 visible-xs-block">
				<div class="bgwrite myspacing myborder">
					<div class="texttitle2">课程信息</div>
					<div class="content">
						<p class="content">课程时长：99小时99分</p>
						<center>
							<a class="btn btn-success addclassbtn" href="<s:property value="allCourse.course.coid"/>" />加入课程</a>
						</center>
					</div>
				</div>
			</div>

		</div>
	</div>
	
		<!--
        	作者：zhaoqingchun163@163.com
        	时间：2016-08-01
        	描述：底部
        -->
	<%@ include file="commen/footer.jsp"%>
	
</body>
</html>
