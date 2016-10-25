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
		String sql = "select * from user where us_id="+user+" and us_password="+password+"";
		List<Object[]> list = jingpinDao.JinpinSqlDao(sql);
		if(list.size()==0)
		return null;
		Map m = new HashMap();
		m.put("usname", Util.isNull(list.get(0)[2]));
		m.put("usico", Util.isNull(list.get(0)[3]));
		m.put("usschool", Util.isNull(list.get(0)[4]));
		m.put("usmajor", Util.isNull(list.get(0)[5]));
		m.put("ussex", Util.isNull(list.get(0)[6]));
		m.put("usphone", Util.isNull(list.get(0)[7]));
		return m;
	}
	

	@Override
	public Map teacher_login(String user, String password) {
		// TODO Auto-generated method stub
		return null;
	}
}
