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
<link rel="stylesheet" href="bootstrap-3.3.5-dist/css/bootstrap.min.css"
	type="text/css" />
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
<style type="text/css">
#an_type a {
	color: #222222;
}

#tm:hover {
	text-decoration: underline;
}
</style>
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
					${sessionScope.user.shenfen}
					<s:if test="sessionScope.user.shenfen!='teacher'"><a href="javascritp:void(0)" data-toggle="modal" data-target="#myModal"></s:if>
					<s:else>
					<a  onclick="pleaselogin();" >
					</s:else>
						<div class="ans_btn">
							<p class="title">课程问题快速解答</p>
							<p class="context">向老师提问</p>
						</div>
					</a>

				</div>
				<div class="col-lg-5 ans_bigimg ">
					<img src="img/answer_img.jpg">
				</div>
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
					<span class="vl-classname"> 热门问题</span> <span class="gengduo">
						<a href="#">更多</a>
					</span>
				</div>
				<ul class="list-unstyled">
					<s:iterator value="allCourse.remen">
						<li><a href="<s:property value="btid"/>" class="type">[<s:property
									value="btname" />]
						</a> <a href="article_getArticle?articleId=<s:property value="bcid"/>"><s:property
									value="bctitle" /></a><span class="ans-time"><s:property
									value="bcdate.substring(0,10)" /></span></li>
					</s:iterator>
				


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
					<span class="vl-classname"> 锦囊名师</span> <span class="gengduo">
						<a href="#">更多</a>
					</span>
				</div>
				<s:iterator value="allCourse.teacher">
					<div class="teindex te_list">
						<div class="fl-left">
							<img class="img-circle" src="<s:property value="maico"/>"
								width="45px" height="45px" />
						</div>
						<div class="fl-left">
							<a href="<s:property value="maid"/>">
								<p class="com-content">
									<span class="glyphicon glyphicon-user userico"></span>
									<s:property value="maname" />
								</p>
								<p class="help-block">
									回答：
									<s:property value="coun" />
								</p>
							</a>
						</div>

					</div>
				</s:iterator>
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

					<s:iterator value="allCourse.fenlei">
						<a href="article_getList?articleId=<s:property value="btid"/>">
							<div class="col-lg-6" style="overflow:hidden; margin-bottom:20px">
								<div class="fl-left">
									<img src="<s:property value="btico"/>" width="70px"
										height="70px">
								</div>
								<div class="fl-left">
									<p class="typename" id="tm">
										<s:property value="btname" />
									</p>
									<p class="typehelp">
										帖数:
										<s:property value="coun" />
									</p>
								</div>
								</div>
						</a>
					</s:iterator>
				</div>
			</div>
		</div>
	</div>
	
	<!-- 模态框（Modal） -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog" style="width:80%">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
					&times;
				</button>
				<h4 class="modal-title" id="myModalLabel">
					向老师提问
				</h4>
			</div>
            <form action="article_addarticle" method="post" id="from" onSubmit="return form_yz()">
			<div class="modal-body form-group" id="form_bd">
				  <p> <label >输入问题：</label ><input type="text"  name="title" id="wenti" class="form-control"></p>
                  <p> <label >详细描述：</label ><textarea name="content" class="form-control" id="xxms"></textarea></p>
                  <p> 
                  	<label >选择板块：</label >
                 	 <select name="maid" class="form-control" id="bkxz">
                     	<s:iterator value="allCourse.fenlei">
                        <option value="<s:property value="btid"/>"><s:property value="btname" /></option>
						</s:iterator>
                     </select>
                  </p>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">关闭
				</button>
				<button type="sumbit" class="btn btn-primary">
					提 交
				</button>
			</div>
            </form>
		</div><!-- /.modal-content -->
	</div><!-- /.modal -->
 <script>
    function form_yz(){
		var boolean;
		
		if($("#wenti").val()==""){
		$("#wenti").after("<span style='color:red;'>不能为空<span>");
		boolean = false;
		}else{
			$("#wenti").next().remove();
		}
		if($("#xxms").val()==""){
		$("#xxms").after("<span style='color:red;'>不能为空<span>");
		boolean = false;
		}else{
			$("#xxms").next().remove();
		}
		alert($("#bkxz").val());
		if($("#bkxz").val()=""){
		$("#bkxz").after("<span style='color:red;'>不能为空<span>");
		boolean = false;
		}else{
		$("#bkxz").next().remove();
		}
		return boolean;
	}
    function pleaselogin(){
    	alert("请登录")
    }
    </script>

	<!--
        	作者：zhaoqingchun163@163.com
        	时间：2016-08-01
        	描述：底部
        -->
	<%@ include file="commen/footer.jsp"%>
</body>

</html>