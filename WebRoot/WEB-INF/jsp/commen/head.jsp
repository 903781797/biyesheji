<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
							<a href="#">
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
