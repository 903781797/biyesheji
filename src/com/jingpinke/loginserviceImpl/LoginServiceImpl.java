package com.jingpinke.loginserviceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jingpinke.Dao.JingpinIDao;
import com.jingpinke.loginservice.LoginService;
import com.jingpinke.util.Util;

public class LoginServiceImpl implements LoginService {
	private JingpinIDao jingpinDao;


	public JingpinIDao getJingpinDao() {
		return jingpinDao;
	}

	public void setJingpinDao(JingpinIDao jingpinDao) {
		this.jingpinDao = jingpinDao;
	}

	@Override
	public Map student_login(String user, String password) {
		String sql = "select * from user where us_id='"+user+"' and us_password='"+password+"'";
		List<Object[]> list = jingpinDao.JinpinSqlDao(sql);
		if(list.size()==0)
		return null;
		Map m = new HashMap();
		m.put("id", Util.isNull(list.get(0)[0]));
		m.put("name", Util.isNull(list.get(0)[2]));
		m.put("ico", Util.isNull(list.get(0)[3]));
		m.put("school", Util.isNull(list.get(0)[4]));
		m.put("major", Util.isNull(list.get(0)[5]));
		m.put("sex", Util.isNull(list.get(0)[6]));
		m.put("phone", Util.isNull(list.get(0)[7]));
		return m;
	}
	

	@Override
	public Map teacher_login(String user, String password) {
		String sql = "select * from manager where ma_id='"+user+"' and ma_password='"+password+"'";
		List<Object[]> list = jingpinDao.JinpinSqlDao(sql);
		if(list.size()==0)
		return null;
		Map m = new HashMap();
		m.put("id", Util.isNull(list.get(0)[0]));
		m.put("name", Util.isNull(list.get(0)[3]));
		m.put("matitle", Util.isNull(list.get(0)[4]));
		m.put("ico", Util.isNull(list.get(0)[5]));
		m.put("sex", Util.isNull(list.get(0)[6]));
		return m;
	}
}
