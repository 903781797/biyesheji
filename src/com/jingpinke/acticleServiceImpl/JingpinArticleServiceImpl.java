package com.jingpinke.acticleServiceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.jingpinke.Dao.JingpinIDao;
import com.jingpinke.acticleService.JingpinIArticleService;
import com.jingpinke.model.Page;
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
				m.put("madate", wenzhang1.get(i)[4]);
				m.put("maico", wenzhang1.get(i)[5]);
				m.put("maname", Util.isNull(wenzhang1.get(i)[6]));
				list.add(m);
			}
			wen.put("pl", list);
		}
		return wen;
	}

	@Override
	public JSONObject getList(String id , Page page) {
	   
	    String sizesql = "select * from bbscard  where BT_ID = "+id+"";
	    int size1 = jingpinDao.sizeSql(sizesql);
	    page.setTotalRecord(size1);
	    String sql = "SELECT c.BC_ID,c.US_ID,c.BC_TITLE,c.BC_DATE,u.US_ICO,u.US_NAME from bbscard c,`user` u"
	    		+ " where BT_ID = "+id+" and u.US_ID=c.US_ID limit "+page.getStartIndex()+", "+page.getEndIndex()+"";
	    List<Object[]> list = jingpinDao.JinpinSqlDao(sql);
	    int size = list.size();
	    JSONArray l = new JSONArray();
	    for(int i=0;i<size;i++ ) {
	    	JSONObject m = new JSONObject();
	    	m.put("bcid", list.get(i)[0]);
	    	m.put("usid", list.get(i)[1]);
	    	m.put("bctitle", list.get(i)[2]);
	    	String s = list.get(i)[3].toString();
	    	m.put("bcdate", (s).substring(0, 10));
	    	m.put("usico", list.get(i)[4]);
	    	m.put("usname", list.get(i)[5]);
	    	l.add(m);
	    }
	    JSONObject m = new JSONObject();
	    m.put("page", page);
	    m.put("artice", l);
		return m;
	}

	@Override
	public JSONObject search(String name) {
		String sql = "SELECT course.co_id, course.co_name, course.co_Desc, course.co_img, COUNT( study.ST_ID ) "
				+ "FROM course LEFT JOIN study ON study.CO_ID = course.CO_ID WHERE course.co_name LIKE  "
				+ "'%"+name+"%' GROUP BY course.co_id ORDER BY course.co_date DESC , course.co_id  ";
		List<Object[]> jieguo = jingpinDao.JinpinSqlDao(sql);
		List array = new ArrayList();
		for (Object[] obj : jieguo) {
			Map hotMap = new HashMap();
			hotMap.put("coid", obj[0]);
			hotMap.put("coname", obj[1]);
			hotMap.put("codesc", obj[2]);
			hotMap.put("coimg", obj[3]);
			hotMap.put("count", obj[4]);
			array.add(hotMap);
		}
		JSONObject o = new JSONObject();
		o.put("course", array);
		o.put("search", name);
		return o;
	}

}
