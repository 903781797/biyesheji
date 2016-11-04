<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="/struts-tags" prefix="s"%>
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
    <link rel="stylesheet" href="css/videolist.css" />
    <link rel="stylesheet" href="css/userCenter.css" />
    <link rel="stylesheet" href="css/answer.css" />
    <script src="js/validate.js"></script>
    <script type="text/javascript" src="js/video.js"></script>
    <script src="js/userMenu.js"></script>
    		<script src="js/doT.js"></script>
</head>

<body>

	<%@ include file="commen/head.jsp"%>
<div class="container  mypadding">
    <div class="col-lg-12 ">
        <div class="bgwrite  ">
            <div class="widthFull borderbottom ">
                <span class="vl-classname"> 所有问题</span>
            </div>
            <div class="widthFull" style="padding: 40px;">
<s:iterator value="o.artice">
                <div class="vl-comimpl row" id="article">
                    <div class="col-lg-1" style="padding-left: 0px;">
                        <img class="img-circle" src='<s:property value="usico"/>' width="45px" height="45px" />
                    </div>
                    <div class="col-lg-8" style="padding-left: 0px;">

                        <p class="com-content">
                            <a href="article_getArticle?articleId=<s:property value="bcid"/>"><s:property value="bctitle"/></a>
                        </p>
                        <p class="com-username"><span class="glyphicon glyphicon-user userico"></span><s:property value="usname"/> <small>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;回答：100</small></p>
                    </div>

                    <div class="col-lg-3">
                        <p class="comment-time"><s:property value="bcdate"/></p>
                    </div>
                </div></s:iterator>
                <!--
                    作者：zhaoqingchun163@163.com
                    时间：2016-09-26
                    描述：分页
                -->
                <div class=" text-center" style="margin-top: 20px" id = "nextPage">
                   <a href="javascript:nextArticle()" style=" width: 100px;border-radius: 5px;display: block;border: 1px solid #CCCCCC;margin: auto;">加载更多</a>
                </div>
                <!--
                          作者：zhaoqingchun163@163.com
                          时间：2016-09-26
                          描述：发布问题表单
                      -->

            </div>

        </div>

    </div>
    <!--

    -->
<script type="text/template" charset="utf-8" id='template_1'>
		{{		for(var i =0;i<it.length;i++) { }}
<div class="vl-comimpl row">
                    <div class="col-lg-1" style="padding-left: 0px;">
                        <img class="img-circle" src='{{=it[i].usico}}"' width="45px" height="45px" />
                    </div>
                    <div class="col-lg-8" style="padding-left: 0px;">

                        <p class="com-content">
                            <a href="article_getArticle?articleId={{=it[i].bcid}}">{{=it[i].bctitle}}</a>
                        </p>
                        <p class="com-username"><span class="glyphicon glyphicon-user userico"></span>{{=it[i].usname}}<small>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;回答：100</small></p>
                    </div>

                    <div class="col-lg-3">
                        <p class="comment-time">{{=it[i].bcdate}}</p>
                    </div>
                </div>
			{{}}}
</script>
<script>
burl = "article_next";
function findArticle(){

	$.get(burl, {
		"page" : 1,
	}, function(result) {
		var re = eval("(" + result + ")");
		
		var template = document.getElementById("template_1").innerHTML;
		document.getElementById("article").innerHTML = doT.template(
				template)(re.array);
		nextPage(re.page.totalPage, re.page.currentPage);
	});
}
function nextArticle(page) {

	if (page == undefined) {
		page = 2;
	}
	if (burl == undefined) {
		burl = "article_next";
	}
	
	$.get(burl, {
		"page" : page
	}, function(result) {
		var re = eval("(" + result + ")");
		
		var template = document.getElementById("template_1").innerHTML;
		document.getElementById("article").innerHTML += doT.template(
				template)(re.artice);
		nextPage(re.page.totalPage, re.page.currentPage);
	});
}
	
	function nextPage(totalpage, currentpage) {
		
		var nextbody = document.getElementById("nextPage");
		if (totalpage == currentpage) {
			nextbody.innerHTML = "<center>没有了</center>";
		} else{
			currentpage++;
			nextbody.innerHTML = "<a href='javascript:nextArticle("
					+ currentpage + ")'  style=' width: 100px;border-radius: 5px;display: block;border: 1px solid #CCCCCC;margin: auto;'>加载更多...</a>";
		}
	}
</script>
</div>
	<%@ include file="commen/footer.jsp"%>
</body>

</html>
