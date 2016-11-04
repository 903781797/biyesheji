<%@ page language="java" import="java.util.*,com.jingpinke.entity.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	int i=1;
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
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
		<link rel="stylesheet" href="css/videolist.css" />
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
				<li><a href="index_courseHome?courseid=<s:property value="allCourse.coid"/>">课程概况</a></li>
				<li><a href="index_videoList?courseid=<s:property value="allCourse.coid"/>">教学录像</a></li>
				<li><a href="index_resource?courseid=<s:property value="allCourse.coid"/>">教学资源</a></li>
		<li><a href="index_testpaper?courseid=<s:property value="allCourse.coid"/>">模拟试题</a></li>
<li><a href="index_dayi?courseid=<s:property value="allCourse.coid"/>">在线
			<li><a href="index_taskList?courseid=<s:property value="allCourse.coid"/>">作业</a></li>
			</ul>
		</div>
	</div>
	<!-- 副导航end -->
	<div class="container myspacing">
		<ol class="breadcrumb bgwrite myborder ">
			当前位置：
			<li class=""><s:property value="allCourse.coname"/></li>
		</ol>
	</div>
	
		<div class="container  ">
			<div class="col-lg-9 ">
				<div class="bgwrite  ">
					<div class="widthFull borderbottom ">
						<span class="vl-classname"> <s:property value="allCourse.coname"/></span>
					</div>
					<div class="widthFull vl-listbody" id="accordion">

						<div class="vl-chapter borderbottom">
							<a class="vl-block" data-toggle="collapse" data-parent="#accordion" href="#collapse1">
								课程目录：<span class=" vl-addico ">+</span>
							</a>
							<div id="collapse1" class="vl-section collapse in">
								<ul class="list-unstyled vl-ul">
									<li class="">	
								<s:iterator value="allCourse.voideoList">
									</li>
										<a href="index_video?courseid=<s:property value="allCourse.coid"/>&videoid=<s:property value="id"/>"><span class="glyphicon glyphicon-facetime-video vl-icon"></span><%=i++ %><s:property value="name"/><span class="glyphicon glyphicon-play-circle floatright"></span></a>
								
									</s:iterator>

								</ul>
							</div>
						</div>
						

					</div>
				</div>

			</div>
			<!--
				
			-->
			<div class="col-lg-3 ">
				<div class="bgwrite vl-padding">

					<div class="down">
						<div class="commentBody  ">
							<h4>推荐课程</h4>
						</div>
						<s:iterator value="allCourse.hot">
						<div class="">
							<a href="index_courseHome?courseid=<s:property value="coid"/>" style="float: none;">

								<img width="230px" src="<s:property value="coimg"/>" />
								<span class="xgkcnr"><s:property value="coname"/></span>

							</a>
						</div>
					</s:iterator>
						

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
