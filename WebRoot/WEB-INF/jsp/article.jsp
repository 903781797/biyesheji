<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width,initial-scale=1" />
		<title></title>
		<link rel="stylesheet" href="bootstrap-3.3.5-dist/css/bootstrap.min.css">
		<link rel="stylesheet" href="css/article.css">
		<link href="umeditor/themes/default/css/umeditor.css" type="text/css" rel="stylesheet">
		<script type="text/javascript" src="umeditor/third-party/jquery.min.js"></script>
		<script type="text/javascript" charset="utf-8" src="umeditor/umeditor.config.js"></script>
		<script type="text/javascript" charset="utf-8" src="umeditor/umeditor.min.js"></script>
		<script type="text/javascript" src="umeditor/lang/zh-cn/zh-cn.js"></script>
	</head>

	<body style="background-color: #EBEBEB;">
	<%@ include file="commen/head.jsp"%>
		<div class="container">
			<div style="background-color: #FFFFFF;" class="yuanjiao">
				<div class="col-lg-12 bgblack">
					<div class="col-lg-2"> <span class="huifu">回复：<s:if test="map.pl!=''null"><s:property value="map.pl.size()"/></s:if></span></div>
					<div class="col-lg-10">
						<h1 style="color: #FFFFFF; font-size: 25px; margin: 5px 0px;"><s:property value="map.bctitle"/></h1></div>
				</div>
				<div class="col-lg-12" style="background: #FFFFFF; margin-bottom: 15px;">
					<div class="col-lg-2 bianju" style=" margin: 0; ">
						<div style="padding-left: 5px; padding-top: 50px;">
							<img src="<s:property value=" map.usico "/>" class="media-object  img-circle" style="" /></div>
						<br />
						<p style="text-align: center;"><s:property value="map.usname" /></p>
						<p style="text-align: center;">楼主</p>
					</div>

					<div class="col-lg-10 aborder" style="padding-top: 30px ; font-size: 16px;">
						<div class="col-lg-12 apadding">
							<h2 style="text-align: center;"><s:property value="map.bctitle"/></h2></div>
						<div class="col-lg-12 apadding2" style="text-align: center;">日期：<s:property value="map.bcdate.substring(0,10)"/></div>
						<div class="col-lg-12 apadding2"><s:property value="map.bccontent"/></div>
						
					</div>
				</div>

			</div>

		</div>
		<%int i=0; %>
		<s:iterator value="map.pl">
			<div class="container">
				<div style="background-color: #FFFFFF;" class="yuanjiao">

					<div class="col-lg-12" style="background: #FFFFFF; margin-bottom: 15px;">
						<div class="col-lg-2 bianju" style=" margin: 0; ">
							<div style="padding-left: 5px; padding-top: 50px;">
								<img src="<s:property value=" maico "/>" class="media-object  img-circle" style="" /></div>
							<br />
							<p style="text-align: center;"><s:property value="maname" /></p>
							<p style="text-align: center;">
								<%=++i %>楼</p>
						</div>

						<div class="col-lg-10 aborder" style=" font-size: 16px; ">
							<div class="col-lg-12 apadding " style="border-bottom: 1px dashed #ddd"><s:property value="cd" /><span style="float: right; color: #9AC200;">#<%=i %></span></div>
							<div class="col-lg-12 apadding2" style="text-align: center;">
								<s:property value="brcontent" />
							</div>

						</div>
					</div>

				</div>

			</div>
		</s:iterator>
		<s:if test="#session.user.shenfen!='teacher'">
			<div class="container">
				<div style="background-color: #FFFFFF; margin: 20; text-align: center; line-height: 100px;border: 1px dashed #ddd">
					登陆后可以发表评论</div>

			</div>
		</s:if>
		<s:else>

			<div class="container">
				<div style="background-color: #FFFFFF;" class="yuanjiao">

					<div class="col-lg-12" style="background: #FFFFFF; margin-bottom: 15px;">
						<div class="col-lg-2 bianju" style=" margin: 0; ">
							<div style="padding-left: 5px; padding-top: 50px;">
								<img src="<s:property value=" #session.user.ico "/>" class="media-object  img-circle" style="" /></div>

						</div>

						<div class="col-lg-10 aborder" style=" font-size: 16px; ">
							<div class="col-lg-12 apadding " style="border-bottom: 1px dashed #ddd">发表回复：</div>
							<div class="col-lg-12 apadding2" style="text-align: center;">
								<script type="text/plain" id="myEditor" style="width:100%;height:240px;">
								</script>

							</div>
							<div style="padding-bottom: 20px; "><a href="javascript:getContentTxt()" class="btn btn-info">发表回复</a></div>

						</div>
					</div>

				</div>

			</div>

		</s:else>

	</body>
	<script>
		var um2 = document.getElementById('myEditor');
		var um = UM.getEditor('myEditor');

		function getContentTxt() {
			if (!UM.getEditor('myEditor').hasContents()) {
				
				alert("请输入评论内容");
			} else {
				var nr = UM.getEditor('myEditor').getContentTxt();
				$.post('comment',{"id":'${o.id}',"nr":nr},function(){
					window.location.reload();
				})
			}

			
		}
	</script>

</html>