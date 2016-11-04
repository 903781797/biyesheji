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
		<link rel="stylesheet" href="css/userCenter.css" />
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
			<div class="col-lg-12 ">
				<div class="bgwrite  ">
					<div class="widthFull borderbottom ">
						<span class="vl-classname"> 作业浏览</span>
					</div>
					<div class="widthFull vl-listbody" id="accordion">

						<div class="info-title ">
							<div class="info-row">
								<div class="col-lg-1 info-bar"> ID</div>
								<div class="col-lg-7 info-bar"> 作业题目</div>
								<div class="col-lg-2 info-barend"> 状态</div>
								<div class="col-lg-2 info-barend"> 操作</div>
							</div>

						</div>
						<s:iterator value="allCourse.ta">
						<div class=" info-row2 ">
							<div class="col-lg-1 "> <%=i++ %></div>
							<div class="col-lg-7 ">
								<a href="index_task?courseid=<s:property value="coid"/>&videoid=<s:property value="taid"/>"><s:property value="taname"/></a>
							</div>
							<div class="col-lg-2 "><s:if test="tayes==1"><span style="color: #92AC00;">已提交</span></s:if>
							<s:else><span>未提交</span></s:else>
							</div>
							<div class="col-lg-2 ">
								<a href="index_task?courseid=<s:property value="taid"/>&videoid=<s:property value="taid"/>">提交作业</a>
							</div>
						</div>
						</s:iterator>
						
					</div>
				</div>

			</div>
			<!--
				
			-->
			
		</div>
		<!--
        	作者：zhaoqingchun163@163.com
        	时间：2016-08-01
        	描述：底部
        -->
	<%@ include file="commen/footer.jsp"%>
	
</body>
</html>
