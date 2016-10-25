package com.jingpinke.loginaction;

import java.sql.Driver;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.jingpinke.loginservice.LoginService;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {
private LoginService loginService;
private String username;
private String password;
private String juese;
private Map m;
public Map getM() {
	return m;
}
public void setM(Map m) {
	this.m = m;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getJuese() {
	return juese;
}
public void setJuese(String juese) {
	this.juese = juese;
}
public LoginService getLoginService() {
	return loginService;
}

public void setLoginService(LoginService loginService) {
	this.loginService = loginService;
}

public String login(){
	if(session.get("user")!=null){
		return "yes";
	}
	if(juese.equals("1")){
		Map m1= loginService.student_login(username, password);
		if(m1==null){
			m.put("info", "用户名或密码错误");
		}else{
			m=m1;
			return "yes";
		}
	}else{
		
	}
	
	return "success";
}
private Map session ;
@Override
public void setSession(Map<String, Object> arg0) {
	this.session=arg0;
}
}
