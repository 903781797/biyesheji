<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
 <head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width,initial-scale=1" />
		<title></title>
		<link rel="stylesheet" href="<%=path %>/bootstrap-3.3.5-dist/css/bootstrap.min.css" type="text/css" />
		<link rel="stylesheet" href="<%=path %>/css/index.css" />
		<script src="<%=path %>/js/jquery.min.js"></script>
		<script src="<%=path %>/bootstrap-3.3.5-dist/js/bootstrap.min.js"></script>
		<link rel="stylesheet" href="<%=path %>/css/video-js.css" />
		<script type="text/javascript" src="<%=path %>/js/video.js"></script>
		<script src="<%=path %>/js/userMenu.js"></script>
		<link rel="stylesheet" href="<%=path %>/css/index2.css" />
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
		<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
			<!-- Indicators 点点-->
			<ol class="carousel-indicators">
				<li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
				<li data-target="#carousel-example-generic" data-slide-to="1"></li>

			</ol>
			<!-- Wrapper for slides -->
			<div class="carousel-inner" role="listbox">
				<div class="item active">
					<a href=""><img class="img-responsive" src="images/image.png" id="lunbo">
					</a>
					<div class="carousel-caption ">
					</div>
				</div>
				<div class="item">
					<a href=""> <img class="img-responsive" src="http://shp.qpic.cn/txdiscuz_pic/0/_bbs_qcloud_com_forum_201609_26_104638fq80y3myqxu743u7.jpg/0" id="lunbo">
					</a>
					<div class="carousel-caption">

					</div>
				</div>

			</div>
			<!-- Controls -->
			<a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
				<span class="glyphicon glyphicon-chevron-left"></span>
				<span class="sr-only"></span>
			</a>
			<a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
				<span class="glyphicon glyphicon-chevron-right"></span>
				<span class="sr-only"></span>
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

				<div class="col-lg-3">
					<a href="index.html">
						<div class="coursebox">
							<img src="img/touxiang.png" class="img-responsive" />
							<p>要想学习好，那得先补脑</p>
							<p class="help-block">
								前不久，乔任梁因抑郁症自杀的消息在网上爆炸开来。多么年轻的生命，就这么自陨了。近些年，越来越多的人因为抑
							</p>
							<span class="xue">110人在学习</span>
						</div>
					</a>
				</div>

				<div class="col-lg-3">
					<a href="#">
						<div class="coursebox">
							<img src="img/touxiang.png" class="img-responsive" />
							<p>要想学习好，那得先补脑</p>
							<p class="help-block">
								前不久，乔任梁因抑郁症自杀的消息在网上爆炸开来。多么年轻的生命，就这么自陨了。近些年，越来越多的人因为抑
							</p>
							<span class="xue">110人在学习</span>
						</div>
					</a>
				</div><div class="col-lg-3">
					<a href="#">
						<div class="coursebox">
							<img src="img/touxiang.png" class="img-responsive" />
							<p>要想学习好，那得先补脑</p>
							<p class="help-block">
								前不久，乔任梁因抑郁症自杀的消息在网上爆炸开来。多么年轻的生命，就这么自陨了。近些年，越来越多的人因为抑
							</p>
							<span class="xue">110人在学习</span>
						</div>
					</a>
				</div><div class="col-lg-3">
					<a href="#">
						<div class="coursebox">
							<img src="img/touxiang.png" class="img-responsive" />
							<p>要想学习好，那得先补脑</p>
							<p class="help-block">
								前不久，乔任梁因抑郁症自杀的消息在网上爆炸开来。多么年轻的生命，就这么自陨了。近些年，越来越多的人因为抑
							</p>
							<span class="xue">110人在学习</span>
						</div>
					</a>
				</div>

			</div>
		</div>

		<div class="container in_margin2">
			<div class="tj_head ">
				<span class="title">其他好课</span><span class="help">学习最好的课程！选择感兴趣的领域，加入课堂，开始学习吧</span><span class="right"><a href="#">更多></a> </span>
			</div>
			<div class="row">

				<div class="col-lg-3">
					<div class="coursebox">
						<img src="img/touxiang.png" class="img-responsive" />
						<p>要想学习好，那得先补脑</p>
						<span class="xue">110人在学习</span>
					</div>
				</div>
				<div class="col-lg-3">
					<div class="coursebox">
						<img src="img/touxiang.png" class="img-responsive" />
						<p>要想学习好，那得先补脑</p>
						<span class="xue">110人在学习</span>
					</div>
				</div>
				<div class="col-lg-3">
					<div class="coursebox">
						<img src="img/touxiang.png" class="img-responsive" />
						<p>要想学习好，那得先补脑</p>
						<span class="xue">110人在学习</span>
					</div>
				</div>

				<div class="col-lg-3">
					<div class="coursebox">
						<img src="img/touxiang.png" class="img-responsive" />
						<p>要想学习好，那得先补脑</p>
						<span class="xue">110人在学习</span>
					</div>
				</div>
				<div class="col-lg-3">
					<div class="coursebox">
						<img src="img/touxiang.png" class="img-responsive" />
						<p>要想学习好，那得先补脑</p>
						<span class="xue">110人在学习</span>
					</div>
				</div>
				<div class="col-lg-3">
					<div class="coursebox">
						<img src="img/touxiang.png" class="img-responsive" />
						<p>要想学习好，那得先补脑</p>
						<span class="xue">110人在学习</span>
					</div>
				</div>
				<div class="col-lg-3">
					<div class="coursebox">
						<img src="img/touxiang.png" class="img-responsive" />
						<p>要想学习好，那得先补脑</p>
						<span class="xue">110人在学习</span>
					</div>
				</div>
				<div class="col-lg-3">
					<div class="coursebox">
						<img src="img/touxiang.png" class="img-responsive" />
						<p>要想学习好，那得先补脑</p>
						<span class="xue">110人在学习</span>
					</div>
				</div>

			</div>
		</div>
		<!--
              	作者：zhaoqingchun163@163.com
              	时间：2016-09-12
              	描述：底部
              -->
		<div class="container-fluid bgfooter">
			<div class="container">
				<div class="col-lg-12">
					<p class="friend">

						友情连接：
						<a href="www.baidu.com">百度</a>
						<a href="www.baidu.com">百度</a>
						<a href="www.baidu.com">百度</a>
					</p>
				</div>

				<div class="col-lg-12">
					<p>
						<center class="host">

							主办单位：中国成人教育协会 工信部备案：京ICP备12020869号-3
						</center>
					</p>
				</div>

				<div class="col-lg-12">
					<p>
						<center class="host">

							© Copyright 2009-2016
						</center>
					</p>
				</div>
			</div>
		</div>
	</body>

</html>