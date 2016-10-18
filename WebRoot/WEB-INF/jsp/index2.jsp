<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
				<li><a href="index.html">课程概况</a></li>
				<li><a href="videoList.html">教学录像</a></li>
				<li><a href="RecourseList.html">教学资源</a></li>
				<li><a href="testpaperList.html">模拟试题</a></li>
				<li><a href="olineAnswer.html">在线答疑</a></li>
				<li><a href="taskList.html">作业</a></li>
			</ul>
		</div>
	</div>
	<!-- 副导航end -->
	<div class="container myspacing">
		<ol class="breadcrumb bgwrite myborder ">
			当前位置：

			<li class="">人人爱设计</li>
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
						<!--<img width="300px" height="200px" src="#" />-->
						<video id="my-video" class="video-js vjs-big-play-centered "
							width="300px" height="200px" controls preload="auto"
							data-setup=""> <!--poster=""--> <source src="video/1.mp4"
							type='video/mp4' /> </video>
					</div>
					<div class="title-content col-lg-8">
						<h2>人人爱设计</h2>
						<p class="myintroduction">设计无处不在，一支笔、一个杯子、一张沙发甚至是一座城市都是设计的成果。设计是一种思维方式，教给我们怎样发现问题，怎么有效的解决问题。设计更是一面镜子，它是世界的缩影，让我们学会如何发现身边的美丽世界，学会更加积极乐观地生活。山东大学“学生最喜爱的老师”王震亚带您走进设计的世界。</p>
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
						《人人爱设计》面向所有专业大学生开课，其目标是：普及创新设计知识和方法，提高学生的创新设计能力，进而提高全社会的创新意识。 <br>
						<br> 这是一门艺术欣赏课，你将领略到创意的神奇和无所不在； 这是一门科技普及课，你会了解很多关于设计的知识；
						这更是一门创新实践课，你会发现，你也可以做一名设计师！ <br> <br>设计是一种本能，每个人心底都藏着一位设计师的灵魂。
					</div>
					<div class="texttitle" id="section-2">预备知识</div>
					<div class="content">无</div>
					<div class="texttitle" id="section-3">课程大纲</div>
					<div class="content">
						<h4>1. 什么是设计</h4>
						<p class="chapter">1.1 为什么说人人爱设计</p>
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
							<li><img src="#" width="80px" height="80px"
								class="img-circle">
								<p>
									刘老师<span>博士后</span>
								</p></li>
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
							<a class="btn btn-success addclassbtn" />加入课程</a>
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
