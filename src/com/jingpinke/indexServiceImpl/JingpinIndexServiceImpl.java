package com.jingpinke.indexServiceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jingpinke.Dao.JingpinIDao;
import com.jingpinke.entity.Chapter;
import com.jingpinke.entity.Course;
import com.jingpinke.entity.Coursetype;
import com.jingpinke.indexService.JingpinIIndexService;

public class JingpinIndexServiceImpl implements JingpinIIndexService {
	private JingpinIDao jingpinDao;


	public JingpinIDao getJingpinDao() {
		return jingpinDao;
	}

	public void setJingpinDao(JingpinIDao jingpinDao) {
		this.jingpinDao = jingpinDao;
	}

	@Override
	public Map JingpinHomeService() {
		Map map = new HashMap();
		map.put("hot", JingpinHost());
		map.put("course", JingpinCourse(JingpinCourseType()));
		return map;
	}
	@Override
	public List JingpinHost() {
		String m_strhot = "select course.co_id,course.co_name,course.co_Desc, course.co_img, COUNT(study.ST_ID) co_count  from course "
				+ " LEFT JOIN study on study.CO_ID=course.CO_ID  GROUP BY course.co_id order by course.rank desc ,course.co_id LIMIT 0 , 4";
		List<Object[]> hot = jingpinDao.JinpinSqlDao(m_strhot);
		List hotArray = courseIterator(hot);
		return hotArray;
	}
	public List courseIterator(List<Object[]> list){
		List array = new ArrayList();
		for (Object[] obj : list) {
			Map hotMap = new HashMap();
			hotMap.put("coid", obj[0]);
			hotMap.put("coname", obj[1]);
			hotMap.put("codesc", obj[2]);
			hotMap.put("coimg", obj[3]);
			hotMap.put("count", obj[4]);
			array.add(hotMap);
		}
		return array;
	}
	@Override
	public List JingpinCourseType() {
		String m_courseTypeHql = " from Coursetype";
		List<Coursetype> ct = jingpinDao.JinpinHqlDao(m_courseTypeHql);
		return ct;
	}
	@Override
	public List JingpinCourse(List<Coursetype> ct) {
        List courseAll = new ArrayList();                                                                      //按照类别封装好的课程数据
		for (Coursetype type : ct) {
			Map<String, Object> typeMap = new HashMap<String, Object>();
			typeMap.put("ctid", type.getCtId());
			typeMap.put("ctname", type.getCtName());
			typeMap.put("ctdesc", type.getCtDesc());
			String sql = "SELECT course.co_id, course.co_name, course.co_Desc  ,course.co_img, COUNT( study.ST_ID ) "
					+ "FROM course "
					+ "LEFT JOIN study ON study.CO_ID = course.CO_ID "
					+ "WHERE course.ct_id ="+type.getCtId()+" "
					+ "GROUP BY course.co_id order by course.co_date desc , course.co_id "
					+ "LIMIT 0 , 8";
			List<Object[]> course = jingpinDao.JinpinSqlDao(sql);
			course = courseIterator(course);
			typeMap.put("value", course);
			courseAll.add(typeMap);
		}
		return courseAll;
	}
	@Override
	public Map JingpinCourseHomeService(String id) {
		String courseHql = "from Course where coId="+id+"";

		List<Course> course = jingpinDao.JinpinHqlDao(courseHql);
		List object = new ArrayList();
		Map m = new HashMap();
		m.put("coid", course.get(0).getCoId());
		m.put("coname", course.get(0).getCoName());
		m.put("codesc",course.get(0).getCoDesc());
		m.put("coi",course.get(0).getCoIntroduct());
		m.put("coimg",course.get(0).getCoImg());
		m.put("coknow",course.get(0).getCoKnown());
		Map map = new HashMap();
		map.put("course", m);
		map.put("chapter", videolist(id));
		String teachersql= "select m.MA_NAME,m.MA_ICO,m.MA_TITLE from teaching t,manager m"
				+ " WHERE t.MA_ID=m.MA_ID and t.CO_ID="+id+" ";
		List<Object[]> tea  =jingpinDao.JinpinSqlDao(teachersql);
		List teacher = new ArrayList();
		for(Object[] obj :tea){
			Map hotMap = new HashMap();
			hotMap.put("tname", obj[0]);
			hotMap.put("tico", obj[1]);
			hotMap.put("ttitle", obj[2]);
			teacher.add(hotMap);
		}
		map.put("teacher", teacher);
		return map;
	}
	public List videolist(String id){
		String chapterHq = "from Chapter where course.coId="+id+" order by chId ";
		List<Chapter> chapter = jingpinDao.JinpinHqlDao(chapterHq);
		List <Map> listmap = new ArrayList();
		for(int i =0;i<chapter.size();i++){
			Map m2 = new HashMap();
			m2.put("name", chapter.get(i).getChName());
			m2.put("src", chapter.get(i).getChSrc());
			m2.put("id", chapter.get(i).getChId());
			listmap.add(m2);
		}
		return listmap;
	}
	@Override
	public Map JingpinVideoListService(String id){
		Map map = new HashMap();
		map.put("voideoList", videolist(id));
		map.put("hot", JingpinHost());
		map.put("coid", id);
		map.put("coname", coursename(id));
		return map;
	}
	public String coursename(String id){
		String sql = "select co_name from course where co_id="+id+"";
		List list= jingpinDao.JinpinSqlDao(sql);
		return (String) list.get(0);
	}

	@Override
	public Map JingpinVideoService(String id,String video) {
		Map m = new HashMap();
		m.put("coname", coursename(id));
		m.put("coid", id);
		m.put("videoList", videolist(id));
		String sql = "select ch_id,ch_name,ch_src from chapter where ch_id ="+video+" ";
		List<Object[]> chapter = jingpinDao.JinpinSqlDao(sql);
		m.put("name", chapter.get(0)[1].toString());
		m.put("src", chapter.get(0)[2].toString());
		m.put("id", chapter.get(0)[0].toString());
		m.put("hot",JingpinHost() );
		return m;
	}
}
