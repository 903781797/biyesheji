package com.jingpinke.indexServiceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.jingpinke.entity.Coursetype;
import com.jingpinke.homeDao.JingpinIIndexDao;
import com.jingpinke.indexService.JingpinIIndexService;

public class JingpinIndexServiceImpl implements JingpinIIndexService {
	private JingpinIIndexDao jingpinIndexDao;

	public JingpinIIndexDao getJingpinIndexDao() {
		return jingpinIndexDao;
	}

	public void setJingpinIndexDao(JingpinIIndexDao jingpinIndexDao) {
		this.jingpinIndexDao = jingpinIndexDao;
	}

	@Override
	public List JingpinHomeService() {
		// String
		// sql="select coursetype.CT_ID,coursetype.CT_NAME,coursetype.CT_DESC, course.co_id,course.co_name,course.co_Desc,"
		// + "COUNT(study.ST_ID) from coursetype,course "
		// +
		// "LEFT JOIN study on study.CO_ID=course.CO_ID WHERE coursetype.CT_ID=course.ct_id GROUP BY "
		// + "course.CO_ID";
		
		return null;
	}

	@Override
	public List JingpinHost() {
		String m_strhot = "select course.co_id,course.co_name,course.co_Desc,COUNT(study.ST_ID) from course"
				+ " LEFT JOIN study on study.CO_ID=course.CO_ID  GROUP BY course.rank desc ,course.co_id LIMIT 0 , 5";
		List<Object[]> hot = jingpinIndexDao.JinpinHomeDao(m_strhot);
		List hotArray = new ArrayList();
		for (Object[] obj : hot) {
			Map hotMap = new HashMap();
			hotMap.put("coid", obj[0]);
			hotMap.put("coname", obj[1]);
			hotMap.put("codesc", obj[2]);
			hotMap.put("count", obj[3]);
			hotArray.add(hotMap);
		}
		return hotArray;
	}

	@Override
	public List JingpinCourseType() {
		String m_courseTypeHql = " from Coursetype";
		List<Coursetype> ct = jingpinIndexDao.JinpinHomeDao(m_courseTypeHql);
		return ct;
	}

	@Override
	public List JIngpinCourse(List<Coursetype> ct) {
        List courseAll = new ArrayList();                                                                      //按照类别封装好的课程数据
		for (Coursetype type : ct) {
			Map<String, Object> typeMap = new HashMap<String, Object>();
			typeMap.put("ctid", type.getCtId());
			typeMap.put("ctname", type.getCtName());
			String sql = "SELECT course.co_id, course.co_name, course.co_Desc, COUNT( study.ST_ID ) "
					+ "FROM course"
					+ "LEFT JOIN study ON study.CO_ID = course.CO_ID"
					+ "WHERE course.ct_id ="+type.getCtId()+""
					+ "GROUP BY course.rank DESC , course.co_id"
					+ "LIMIT 0 , 8";
			List course = jingpinIndexDao.JinpinHomeDao(sql);
			typeMap.put("value", course);
			courseAll.add(typeMap);
		}
		return courseAll;
	}
}
