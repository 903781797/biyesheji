<%@ page language="java" import="java.util.*,com.jingpinke.entity.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	int i=1;
%>

<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width,initial-scale=1" />
		<title></title>
		<link rel="stylesheet" href="bootstrap-3.3.5-dist/css/bootstrap.min.css" type="text/css" />
		<link rel="stylesheet" href="css/index.css" />
		<link href="css/video-js.css" rel="stylesheet" type="text/css" />
		<script src="js/jquery.min.js"></script>
		<script src="bootstrap-3.3.5-dist/js/bootstrap.min.js"></script>
		<script src="js/video.js"></script>
		<script src="js/userMenu.js"></script>
		<script src="js/validate.js"></script>
		<script>
			videojs.options.flash.swf = "js/video-js.swf";
		</script>

	</head>

	<body class="bgwrite">

		<!--head-->
		<div class="navbar navbar-inverse myvideohead" style="border-radius: 0px;margin-bottom: 0px;">
			<div class="myvideotitle">
				<div class="floatleft">
					<a href="index_videoList?courseid=<s:property value="allCourse.coid"/>" class="backoff-a">
						<</a>
				</div>
				<div class="classname"><s:property value="allCourse.coname"/> <span class="classname2"> <s:property value="allCourse.name"/></span></div>
			</div>
			<div class="fl-left">
				<div class="floatleft ">
					<a href="1"  class="backoff-a  glyphicon glyphicon-envelope ">
						<span class="badge" style="position: absolute; left: 45px;top: 10px; background-color: red;">42</span>
					</a>

				</div>
				<div class="backoff2"  onmouseover="displaySubMenu()" onmouseout="hideSubMenu()">
					<a href="#" class="backoff-a">
						<img src="img/touxiang.png" width="40px" height="40px" class=" img-circle" />
					</a>
					<div class="  mymenudown " id="downmenu">
						<div class="myarrow"></div>
						<div class="downusername">欢迎您：小流氓0123</div>
						<div class="Setup">
							<a href="#">个人设置</a>
							<a href="#" style="float: right;">退出</a>
						</div>
					</div>
				</div>

			</div>
		</div>
		<!--
        	作者：zhaoqingchun163@163.com
        	时间：2016-08-07
        	描述：视频
        -->
		<div class="play-body">
			<!---->
			<div class="myvideojs ">
				<video id="my-video" height="450px" class=" video-js vjs-big-play-centered myvideowidth " controls preload="auto" data-setup="">
					<source src='<s:property value="allCourse.src"/>' type='video/mp4' />
				</video>
				
			</div>
			<div class="videomenu" id="menu">
<div class="pull glyphicon glyphicon-list" onclick="pull();"><br>
					<span style="">章节</span>
					</div>
				<div class="mymenu-body" id="entitymenu">
					
					<ul class="list-unstyled ">
						<li class="mymenu-title"><s:property value="allCourse.coname"/> </li>
						<li class="mymeny-chapter">课程目录：</li>
						<s:iterator value="allCourse.videoList">
						<li class="mymeny-section ">
							<a href='index_video?courseid=<s:property value="allCourse.coid"/>&videoid=<s:property value="id"/>' <s:if test="id==%{callCourse.id}">style="color: #92ac00;"</s:if>><span class="glyphicon glyphicon-play mymenuico"></span>
							<%=i++ %><s:property value="name"/> <span class="menutime">59分钟</span></a>
						</li>
					</s:iterator >					
					</ul>
				</div>
			</div>
			</video>

		</div>

		<!--play-body end-->
		<script>
			videojs("my-video").ready(function() {
				$("#entitymenu a").click(function(){
					pull();
				});
$('#my-video').bind('contextmenu',function() { return false; }); 
			});

			function pull() {

				var menu = $("#menu").css('width');

				var myvideojs = $(".myvideojs").css('width');
				var playbody = document.body.clientWidth;
				if($("#menu").css('width') == '0px') {
					$("#menu").animate({
						width: 360
					}, "slow");	
				} else {
					$("#menu").animate({
						width: 0
					}, "slow");
				}
			}
		</script>
		<div class="container bgwrite">

			<div class="col-lg-9" style="padding-right:40px">
				<form action="#" method="post">

					<div class="commentBody glyphicon-education glyphicon "><span class=" ">评论</span></div>
					<textarea class="comment form-control" style="height: 130px;" id="comment" oninput="funcomment()"></textarea>
					<span class=" wordnum text-right" id="textNum">100字内</span>
					<input type="submit" value="发表评论" class="commentBtn" />

				</form>
				<div class="comment-body">
					<div class="comimpl row">
						<div class="col-lg-1" style="padding-left: 0px;">
							<img class="img-circle" src="img/touxiang.png" width="45px" height="45px" />
						</div>
						<div class="col-lg-11" style="padding-left: 0px;">
							<p class="com-username">姓名</p>
							<p class="com-content">这是评论内容</p>
							<p class="comment-time">2016年12月24日</p>
						</div>
					</div>

				
					
					<div class="pagebody text-right">
						<ul class="pagination pagination-sm">
							<li>
								<a href="#">&laquo;</a>
							</li>
							<li class="active">
								<a href="#">1</a>
							</li>
							<li>
								<a href="#">2</a>
							</li>
							<li>
								<a href="#">3</a>
							</li>
							<li>
								<a href="#">4</a>
							</li>
							<li>
								<a href="#">5</a>
							</li>
							<li>
								<a href="#">&raquo;</a>
							</li>
						</ul>
					</div>
				</div>
			</div>

			<div class="col-lg-3">
				<div class="down">
					<div class="commentBody  ">
						<h4>资料下载</h4></div>
					<div class="down">
						<ul class="list-unstyled">

							<li class="glyphicon glyphicon-save"> <span>文件名</span>
								<a href="#">下载</a>
							</li>
							<li class="glyphicon glyphicon-save"> <span>文件名</span>
								<a href="#">下载</a>
							</li>
							<li class="glyphicon glyphicon-save"> <span>文件名</span>
								<a href="#">下载</a>
							</li>
							<li class="glyphicon glyphicon-save"> <span>文件名</span>
								<a href="#">下载</a>
							</li>
							<li class="glyphicon glyphicon-save"> <span>文件名</span>
								<a href="#">下载</a>
							</li>
							<li class="glyphicon glyphicon-save"> <span>文件名</span>
								<a href="#">下载</a>
							</li>

						</ul>
					</div>
				</div>

				<div class="down">
					<div class="commentBody  ">
						<h4>猜你喜欢的课程</h4></div>
				
					<s:iterator value="allCourse.hot">
					<div class="">
						<a href="index_courseHome?courseid=<s:property value="coid"/>" style="float: none;">
							<p class="xgkc">
								<img width="250px" src="<s:property value="coimg"/>" />
								<span class="xgkcnr"><s:property value="coname"/></span>
							</p>
						</a>
					</div>
					</s:iterator>
			

				</div>

			</div>

		</div>
		

	</body>

</html>
