package com.jingpinke.acticleServiceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jingpinke.Dao.JingpinIDao;
import com.jingpinke.acticleService.JingpinIArticleService;
import com.jingpinke.util.Util;

public class JingpinArticleServiceImpl implements JingpinIArticleService {
	private JingpinIDao jingpinDao;

	public JingpinIDao getJingpinDao() {
		return jingpinDao;
	}

	public void setJingpinDao(JingpinIDao jingpinDao) {
		this.jingpinDao = jingpinDao;
	}

	@Override
	public Map getArtice(String articleId) {
		String sql = "select c.BC_ID,c.US_ID,c.bt_id,c.bc_title,c.BC_CONTENT,c.BC_DATE,u.US_ICO,u.US_NAME "
				+ "from bbscard c,`user` u where bc_id = "+articleId+" and BC_ISTRUE = 1 and c.US_ID=u.US_ID;";		//查找文章
		String sql2 = "select r.BR_ID,r.MA_ID,r.BC_ID,r.BR_CONTENT,r.BR_DATE,m.MA_ICO,m.MA_NAME "
				+ "from bbsreply r,manager m where bc_id =  "+articleId+" and BR_ISTRUE = 1 and r.MA_ID=m.MA_ID";	//查找回复
		List<Object[]> wenzhang = jingpinDao.JinpinSqlDao(sql);
		Map wen = new HashMap();
		wen.put("bcid", wenzhang.get(0)[0]);
		wen.put("usid", wenzhang.get(0)[1]);
		wen.put("btid", wenzhang.get(0)[2]);
		wen.put("bctitle", wenzhang.get(0)[3]);
		wen.put("bccontent", wenzhang.get(0)[4]);
		wen.put("bcdate", wenzhang.get(0)[5]);
		wen.put("usico", wenzhang.get(0)[6]);
		wen.put("usname", wenzhang.get(0)[7]);
		List<Object[]> wenzhang1 = jingpinDao.JinpinSqlDao(sql2);
		if(wenzhang1.isEmpty()){
			wen.put("pl","null" );
		}else{
			int size = wenzhang1.size();
			List list = new ArrayList();
			for (int i = 0; i<size; i++) {
				Map m = new HashMap();
				m.put("brid", wenzhang1.get(i)[0]);
				m.put("maid", wenzhang1.get(i)[1]);
				m.put("bcid", wenzhang1.get(i)[2]);
				m.put("brcontent", wenzhang1.get(i)[3]);
				m.put("maico", wenzhang1.get(i)[4]);
				m.put("ma_name", Util.isNull(wenzhang1.get(i)[5]));
				list.add(m);
			}
			wen.put("pl", list);
		}
		return wen;
	}
}
