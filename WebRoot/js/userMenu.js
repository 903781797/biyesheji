function userPanel() {
	var model = "<div class='backoff '>" +
		"<a href='#' class=' backoff-a glyphicon glyphicon-envelope '>" +
		"<span class='badge' style='position: absolute; left: 45px;top: 10px; background-color: red;'>42</span>" +
		"</a>" +
		"</div>" +
		"<div class='backoff' onmouseover='displaySubMenu()' onmouseout='hideSubMenu()'>" +
		"<a href='#'  class='dropdown backoff-a' >" +
		"<img src='img/touxiang.png' width='40px' height='40px' class=' img-circle' />" +
		"</a>"

	+"<div class='  mymenudown ' id='downmenu'>" +
	"<div class='myarrow'></div>" +
	"<div class='downusername'>欢迎您：小流氓0123</div>" +
	"<div class='Setup'><a href='userCenter.html' >个人设置</a><a href='javascript:loginOut();' style='float: right;' >退出</a></div>" +
	"</div>" +
	"</div>";
	return model;
}
function userBtnModel(){
	var model="<div id='loginbtn'>"
                      +" 	<a href='javascript:loginIn();' class='mybtn'>登录</a>|"
						+"<a href='#' class='mybtn '>注册</a>"
                     +"   </div>";
                     return model;
}
function displaySubMenu() {
	var subMenu = document.getElementById('downmenu');
	$("#downmenu").stop().slideToggle();
	//subMenu.style.display = "block";
}

function hideSubMenu() {
	var subMenu = document.getElementById('downmenu');
	//subMenu.style.display = "none";
	$("#downmenu").stop().slideToggle();
}
function loginIn(){
	$("#loginmenu").html(userPanel());
}
function loginOut(){
	$("#loginmenu").html(userBtnModel());	
}
function getLoading(){
	return "<div class='spinner'><div class='bounce1'></div><div class='bounce2'></div><div class='bounce3'></div></div>";
}
