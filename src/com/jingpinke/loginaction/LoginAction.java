package com.jingpinke.loginaction;

import java.util.HashMap;
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

public String out(){
	session.remove("user");
	return "no";
}
public String forword(){
	if(session.get("user")!=null){
		return "yes";
	}
	return "no";
}
public String login(){

	if(juese.equals("1")){
		Map m1= loginService.student_login(username, password);
		if(m1==null){
			m=new HashMap();
			m.put("info", "用户名或密码错误");
			return "no";
		}else{
			
			m=m1;
			m.put("shenfen", "student");
			session.put("user", m);
			return "yes";
		}
	}else{
		Map m1= loginService.teacher_login(username, password);
		if(m1==null){
			m=new HashMap();
			m.put("info", "用户名或密码错误");
			return "no";
		}else{
			m=m1;
			m.put("shenfen", "teacher");
			session.put("user", m);
			return "manager";
		}
	}
	

}
private Map session ;
@Override
public void setSession(Map<String, Object> arg0) {
	this.session=arg0;
}
}
