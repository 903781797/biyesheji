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
		<nav class="menuShadow navbar navbar-inverse" style="border-radius: 0px;margin-bottom: 0px;">
			<div class="container mybignav" >
				<div class="col-lg-3" style="padding-left: 0px;">
					<a href="#">
						<!--<h1 class="bigmenuh1">哈尔滨华德精品课</h1>-->
						<img src="img/logo.png" style="padding-top: 10px;" />
					</a>
				</div>
				<div class="col-lg-4">
					<ul class="mybigmenuli list-unstyled">
						<li>
							<a href="index2.html">
								<h4>所有课程</h4></a>
						</li>
						<li>
							<a href="#">
								<h4>答疑</h4></a>
						</li>
						<li>
							<a href="#">
								<h4>资料</h4></a>
						</li>

					</ul>
				</div>

				<div class="col-lg-3">
					<div class="serchbody ">
						<input type="text" id="serch" class=" myserch mytext" placeholder="按课程名搜索" />
						<input type="button" class=" myserch btntext" value="搜" />
					</div>
				</div>
				<div class="col-lg-2 ">
					<div class="myloginbtn " id="loginmenu">
						<div id="loginbtn">
							<a href="javascript:loginIn();" class="mybtn">登录</a>|
							<a href="javascript:loginOut();" class="mybtn ">注册</a>
						</div>
					</div>
				</div>
			</div>
		</nav>
		
		<div class="container mypadding">
			
			
			
			<div class="col-lg-12 ">
					<div style="margin: 50px auto;padding: auto; width: 100%;overflow:hidden;">
						<input id="serch" style="float:left;padding-left: 15px;border: none;height:40px;width: 70%;margin-left: 10%;border-bottom-left-radius: 5px;
border-top-left-radius: 5px;" placeholder="按课程名搜索" type="text">
<input style="float:left;color: #ffffff;background-color:#4cae4c;border: none;height:40px;width: 10%;margin: 0px;border-bottom-right-radius: 5px;
border-top-right-radius: 5px;margin-right: 10%;" value="搜索" type="button">
			</div>

						<div class="bgwrite uc-classMapping">
							<div class="col-lg-3"><img src="" width="174" height="119"></div>
							<div class="col-lg-7 uc-class">
								<p class="uc-className">
									<span class="glyphicon glyphicon-list-alt uc-classIco"></span> 这是一门课程
								</p>
								<p><span>课程时长：</span>99小时99分</p>
								<p><span>授课老师：</span>
									<a href="#">张老师</a>
									<a href="#">张老师</a>
									<a href="#">张老师</a>
									<a href="#">张老师</a>
									<a href="#">张老师</a>
									<a href="#">张老师</a>
								</p>
							</div>
							<div class="col-lg-2" style="line-height: 119px;">
								<a href="#" class="btn btn-success">继续学习</a>
							</div>
						</div>
						<div class="bgwrite uc-classMapping">
							<div class="col-lg-3"><img src="" width="174" height="119"></div>
							<div class="col-lg-7 uc-class">
								<p class="uc-className">
									<span class="glyphicon glyphicon-list-alt uc-classIco"></span> 这是一门课程
								</p>
								<p><span>课程时长：</span>99小时99分</p>
								<p><span>授课老师：</span>
									<a href="#">张老师</a>
									<a href="#">张老师</a>
									<a href="#">张老师</a>
									<a href="#">张老师</a>
									<a href="#">张老师</a>
									<a href="#">张老师</a>
								</p>
							</div>
							<div class="col-lg-2" style="line-height: 119px;">
								<a href="#" class="btn btn-success">继续学习</a>
							</div>
						</div>
						<div class="bgwrite uc-classMapping">
							<div class="col-lg-3"><img src="" width="174" height="119"></div>
							<div class="col-lg-7 uc-class">
								<p class="uc-className">
									<span class="glyphicon glyphicon-list-alt uc-classIco"></span> 这是一门课程
								</p>
								<p><span>课程时长：</span>99小时99分</p>
								<p><span>授课老师：</span>
									<a href="#">张老师</a>
									<a href="#">张老师</a>
									<a href="#">张老师</a>
									<a href="#">张老师</a>
									<a href="#">张老师</a>
									<a href="#">张老师</a>
								</p>
							</div>
							<div class="col-lg-2" style="line-height: 119px;">
								<a href="#" class="btn btn-success">继续学习</a>
							</div>
						</div>
						<div class=" text-center">
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
	</body>
</html>
