<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%><%@ taglib prefix="s" uri="/struts-tags"%>
<!--
        	作者：zhaoqingchun163@163.com
        	时间：2016-08-01
        	描述：主导航
        -->
<nav class=" navbar navbar-inverse menuShadow" style="border-radius: 0px;margin-bottom: 0px;">
			<div class="container mybignav">
				<div class="col-lg-3" style="padding-left: 0px;">
					<a href="#">
						<!--<h1 class="bigmenuh1">哈尔滨华德精品课</h1>-->
						<img src="img/logo.png" style="padding-top: 10px;" />
					</a>
				</div>
				<div class="col-lg-4">
					<ul class="mybigmenuli list-unstyled">
						<li>
							<a href="index">
								<h4>所有课程</h4></a>
						</li>
						<li>
							<a href="answerBigList.html">
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
					
					
					
					
					
					<s:if test="#session.user!=null"><div class='backoff '>
		<a href='#' class=' backoff-a glyphicon glyphicon-envelope '>
		<span class='badge' style='position: absolute; left: 45px;top: 10px; background-color: red;'>42</span>
		</a>
		</div>
		<div class='backoff' onmouseover='displaySubMenu()' onmouseout='hideSubMenu()'>
		<a href='#'  class='dropdown backoff-a' >
		<img src='<s:property value="#session.user.ico"/>' width='40px' height='40px' class=' img-circle' />
		</a>

	<div class='  mymenudown ' id='downmenu'>
	<div class='myarrow'></div>
	<div class='downusername'>欢迎您：<s:property value="#session.user.name"/></div>
	<div class='Setup'><a href='login_center?id=<s:property value="#session.user.id"/>' >个人设置</a><a href='login_out?' style='float: right;' >退出</a></div>
	</div>
	</div></s:if><s:else>
						<div id="loginbtn">
							<a href="login" class="mybtn">登录</a>|
							<a href="#" class="mybtn ">注册</a>
						</div>
						</s:else>
					</div>
				</div>
			</div>
		</nav>
