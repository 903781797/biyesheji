<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
<link rel="stylesheet"
	href="bootstrap-3.3.5-dist/css/bootstrap.min.css"
	type="text/css" />
<link rel="stylesheet" href="css/index.css" />
<script src="js/jquery.min.js"></script>
<script src="bootstrap-3.3.5-dist/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="/css/video-js.css" />
<script type="text/javascript" src="/js/video.js"></script>
<script src="js/userMenu.js"></script>
<link rel="stylesheet" href="css/index2.css" />
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
	时间：2016-09-28
	描述：轮播
-->
	<div id="carousel-example-generic" class="carousel slide"
		data-ride="carousel">
		<!-- Indicators 点点-->
		<ol class="carousel-indicators">
			<li data-target="#carousel-example-generic" data-slide-to="0"
				class="active"></li>
			<li data-target="#carousel-example-generic" data-slide-to="1"></li>

		</ol>
		<!-- Wrapper for slides -->
		<div class="carousel-inner" role="listbox">
			<div class="item active">
				<a href=""><img class="img-responsive" src="images/image.png"
					id="lunbo"> </a>
				<div class="carousel-caption "></div>
			</div>
			<div class="item">
				<a href=""> <img class="img-responsive"
					src="http://shp.qpic.cn/txdiscuz_pic/0/_bbs_qcloud_com_forum_201609_26_104638fq80y3myqxu743u7.jpg/0"
					id="lunbo">
				</a>
				<div class="carousel-caption"></div>
			</div>

		</div>
		<!-- Controls -->
		<a class="left carousel-control" href="#carousel-example-generic"
			role="button" data-slide="prev"> <span
			class="glyphicon glyphicon-chevron-left"></span> <span
			class="sr-only"></span>
		</a> <a class="right carousel-control" href="#carousel-example-generic"
			role="button" data-slide="next"> <span
			class="glyphicon glyphicon-chevron-right"></span> <span
			class="sr-only"></span>
		</a>

	</div>

	<!--
        	轮播结束
        -->
	<div class="container in_margin">
		<div class="tj_head ">
			<span class="left">推荐课程 </span><span class="right">更多> </span>
		</div>

		<div class="row">
			<!-- 推荐 -->
			<s:iterator value="allCourse.hot">
				<div class="col-lg-3">
					<a href="index_courseHome?courseid=<s:property value="coid"/>">
						<div class="coursebox">
							<img src="<s:property value="coimg"/>" class="img-responsive"  />
							<p>
								<s:property value="coname" />
							</p>
							<p class="help-block">
								<s:property value="codesc" />
							</p>
							<span class="xue"><s:property value="count" />人在学习</span>
						</div>
					</a>
				</div>
			</s:iterator>
		</div>
	</div>
	<s:iterator value="allCourse.course">
		<div class="container in_margin2">
			<div class="tj_head ">
				<span class="title"><s:property value="ctname" /></span><span
					class="help"><s:property value="ctdesc" /></span><span class="right"><a
					href="<s:property value="ctid"/>">更多></a> </span>
			</div>
			<div class="row">
				<s:iterator value="value" >
					<div class="col-lg-3"><a href="index_courseHome?courseid=<s:property value="coid"/>">
						<div class="coursebox">
							<img src="<s:property value="coimg" />" class="img-responsive" />
							<p><s:property value="coname" /></p>
							<span class="xue"><s:property value="count" />人在学习</span>
						</div></a>
					</div>
				</s:iterator >
	
			</div>
		</div>
	</s:iterator>
	<!--
              	作者：zhaoqingchun163@163.com
              	时间：2016-09-12
              	描述：底部
              -->
	<div class="container-fluid bgfooter">
		<div class="container">
			<div class="col-lg-12">
				<p class="friend">

					友情连接： <a href="www.baidu.com">百度</a> <a href="www.baidu.com">百度</a>
					<a href="www.baidu.com">百度</a>
				</p>
			</div>

			<div class="col-lg-12">
				<p>
				<center class="host">主办单位：中国成人教育协会 工信部备案：京ICP备12020869号-3</center>
				</p>
			</div>

			<div class="col-lg-12">
				<p>
				<center class="host">© Copyright 2009-2016</center>
				</p>
			</div>
		</div>
	</div>
</body>

</html>