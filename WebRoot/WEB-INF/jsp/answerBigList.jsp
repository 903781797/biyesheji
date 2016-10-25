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
		<link rel="stylesheet" href="bootstrap-3.3.5-dist/css/bootstrap.min.css" type="text/css" />
		<link rel="stylesheet" href="css/index.css" />
		<script src="js/jquery.min.js"></script>
		<script src="bootstrap-3.3.5-dist/js/bootstrap.min.js"></script>
		<link rel="stylesheet" href="css/video-js.css" />
		<link rel="stylesheet" href="css/videolist.css" />
		<link rel="stylesheet" href="css/userCenter.css" />
		<link rel="stylesheet" href="css/answer.css" />
		<script src="js/validate.js"></script>
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
	<div class="container margin">
			<div class="col-lg-12 ">
				<div class="bgwrite" style="overflow: hidden;">
					<div class="col-lg-7" id="goanser">
						<h1 class="title">学贵知疑，学习疑难问老师</h1>
						<h3 class="title2">帮您找到优秀的线上教师，解决个性化学习难题</h3>
						<a href="#">
							<div class="ans_btn">
								<p class="title">课程问题快速解答</p>
								<p class="context">向老师提问</p>
							</div>
						</a>

					</div>
					<div class="col-lg-5 ans_bigimg "><img src="img/answer_img.jpg"></div>
				</div>
			</div>

			<!--
            	作者：zhaoqingchun163@163.com
            	时间：2016-10-09
            	描述：热门阿萨德发
            -->
			<div class="col-lg-9 margin">
				<div class="bgwrite" id="remen">
					<div class=" borderbottom">
						<span class="vl-classname"> 热门问题</span>
						<span class="gengduo">
							<a href="#" >更多</a>
						</span>
					</div>
					<ul class="list-unstyled">
						<li>
							<a href="#" class="type">[数据库系统]</a>
							<a href="#">请问如何在linux下部署oracle</a><span class="ans-time">2016年12月24日</span>
						</li>
						<li>
							<a href="#" class="type">[数据库系统]</a>
							<a href="#">请问如何在linux下部署oracle</a><span class="ans-time">2016年12月24日</span>
						</li>
						<li>
							<a href="#" class="type">[数据库系统]</a>
							<a href="#">请问如何在linux下部署oracle</a><span class="ans-time">2016年12月24日</span>
						</li>
						<li>
							<a href="#" class="type">[数据库系统]</a>
							<a href="#">请问如何在linux下部署oracle</a><span class="ans-time">2016年12月24日</span>
						</li>
						<li>
							<a href="#" class="type">[数据库系统]</a>
							<a href="#">请问如何在linux下部署oracle</a><span class="ans-time">2016年12月24日</span>
						</li>
						<li>
							<a href="#" class="type">[数据库系统]</a>
							<a href="#">请问如何在linux下部署oracle</a><span class="ans-time">2016年12月24日</span>
						</li>
						<li>
							<a href="#" class="type">[数据库系统]</a>
							<a href="#">请问如何在linux下部署oracle</a><span class="ans-time">2016年12月24日</span>
						</li>
						<li>
							<a href="#" class="type">[数据库系统]</a>
							<a href="#">请问如何在linux下部署oracle</a><span class="ans-time">2016年12月24日</span>
						</li>
						<li>
							<a href="#" class="type">[数据库系统]</a>
							<a href="#">请问如何在linux下部署oracle</a><span class="ans-time">2016年12月24日</span>
						</li>
						<li>
							<a href="#" class="type">[数据库系统]</a>
							<a href="#">请问如何在linux下部署oracle</a><span class="ans-time">2016年12月24日</span>
						</li>
						<li>
							<a href="#" class="type">[数据库系统]</a>
							<a href="#">请问如何在linux下部署oracle</a><span class="ans-time">2016年12月24日</span>
						</li>
						
					</ul>
				</div>
			</div>
			<!--
            	作者：zhaoqingchun163@163.com
            	时间：2016-10-09
            	描述：名师
            -->
			<div class="col-lg-3">
				<div class="bgwrite margin">
					<div class=" borderbottom">
						<span class="vl-classname"> 锦囊名师</span>
						<span class="gengduo">
							<a href="#" >更多</a>
						</span>
					</div>

					<div class="teindex te_list">
						<div class="fl-left">
							<img class="img-circle" src="img/touxiang.png" width="45px" height="45px" />
						</div>
						<div class="fl-left">
							<a href="#">
								<p class="com-content">
									<span class="glyphicon glyphicon-user userico"></span>阿萨德发生
								</p>
								<p class="help-block">回答：100</p>
							</a>
						</div>

					</div>
					
					<div class="teindex te_list">
						<div class="fl-left">
							<img class="img-circle" src="img/touxiang.png" width="45px" height="45px" />
						</div>
						<div class="fl-left">
							<a href="#">
								<p class="com-content">
									<span class="glyphicon glyphicon-user userico"></span>阿萨德发生
								</p>
								<p class="help-block">回答：100</p>
							</a>
						</div>

					</div>
					<div class="teindex te_list">
						<div class="fl-left">
							<img class="img-circle" src="img/touxiang.png" width="45px" height="45px" />
						</div>
						<div class="fl-left">
							<a href="#">
								<p class="com-content">
									<span class="glyphicon glyphicon-user userico"></span>阿萨德发生
								</p>
								<p class="help-block">回答：100</p>
							</a>
						</div>

					</div>
					<div class="teindex te_list">
						<div class="fl-left">
							<img class="img-circle" src="img/touxiang.png" width="45px" height="45px" />
						</div>
						<div class="fl-left">
							<a href="#">
								<p class="com-content">
									<span class="glyphicon glyphicon-user userico"></span>阿萨德发生
								</p>
								<p class="help-block">回答：100</p>
							</a>
						</div>

					</div>
					<div class="teindex te_list">
						<div class="fl-left">
							<img class="img-circle" src="img/touxiang.png" width="45px" height="45px" />
						</div>
						<div class="fl-left">
							<a href="#">
								<p class="com-content">
									<span class="glyphicon glyphicon-user userico"></span>阿萨德发生
								</p>
								<p class="help-block">回答：100</p>
							</a>
						</div>

					</div>

				</div>
			</div>
			<!--
            	作者：zhaoqingchun163@163.com
            	时间：2016-10-09
            	描述：论坛分类
            -->
			<div class="col-lg-12">
				<div class="bgwrite ">
					<div class=" borderbottom">
						<span class="vl-classname"> 答疑交流区</span>
					</div>
					<div class="clearfl " id="an_type">
						<div class="borderxx">
							<div class="col-lg-6">
								<div class="fl-left"><img src="img/touxiang.png" width="70px" height="70px"></div>
								<div class="fl-left">
								<p class="typename">这个是题目</p>
								<p class="typehelp">帖数:11111</p>
								</div>
							</div>
							<div class="col-lg-6">
								<div class="fl-left"><img src="img/touxiang.png" width="70px" height="70px"></div>
								<div class="fl-left">
								<p class="typename">这个是题目</p>
								<p class="typehelp">帖数:11111</p>
								</div>
							</div>
						</div>
					</div>
					
					<div class="clearfl " id="an_type">
						<div class="borderxx">
							<div class="col-lg-6">
								<div class="fl-left"><img src="img/touxiang.png" width="70px" height="70px"></div>
								<div class="fl-left">
								<p class="typename">这个是题目</p>
								<p class="typehelp">帖数:11111</p>
								</div>
							</div>
							<div class="col-lg-6">
								<div class="fl-left"><img src="img/touxiang.png" width="70px" height="70px"></div>
								<div class="fl-left">
								<p class="typename">这个是题目</p>
								<p class="typehelp">帖数:11111</p>
								</div>
							</div>
						</div>
					</div><div class="clearfl " id="an_type">
						<div class="borderxx">
							<div class="col-lg-6">
								<div class="fl-left"><img src="img/touxiang.png" width="70px" height="70px"></div>
								<div class="fl-left">
								<p class="typename">这个是题目</p>
								<p class="typehelp">帖数:11111</p>
								</div>
							</div>
							<div class="col-lg-6">
								<div class="fl-left"><img src="img/touxiang.png" width="70px" height="70px"></div>
								<div class="fl-left">
								<p class="typename">这个是题目</p>
								<p class="typehelp">帖数:11111</p>
								</div>
							</div>
						</div>
					</div><div class="clearfl " id="an_type">
						<div class="borderxx">
							<div class="col-lg-6">
								<div class="fl-left"><img src="img/touxiang.png" width="70px" height="70px"></div>
								<div class="fl-left">
								<p class="typename">这个是题目</p>
								<p class="typehelp">帖数:11111</p>
								</div>
							</div>
							<div class="col-lg-6">
								<div class="fl-left"><img src="img/touxiang.png" width="70px" height="70px"></div>
								<div class="fl-left">
								<p class="typename">这个是题目</p>
								<p class="typehelp">帖数:11111</p>
								</div>
							</div>
						</div>
					</div><div class="clearfl " id="an_type">
						<div class="borderxx">
							<div class="col-lg-6">
								<div class="fl-left"><img src="img/touxiang.png" width="70px" height="70px"></div>
								<div class="fl-left">
								<p class="typename">这个是题目</p>
								<p class="typehelp">帖数:11111</p>
								</div>
							</div>
							<div class="col-lg-6">
								<div class="fl-left"><img src="img/touxiang.png" width="70px" height="70px"></div>
								<div class="fl-left">
								<p class="typename">这个是题目</p>
								<p class="typehelp">帖数:11111</p>
								</div>
							</div>
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