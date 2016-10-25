package com.jingpinke.loginservice;

import java.util.Map;

public interface LoginService {
	public Map student_login(String user,String password );
	public Map teacher_login(String user,String password );
}
