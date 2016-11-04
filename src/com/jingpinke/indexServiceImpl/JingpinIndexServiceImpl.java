package com.jingpinke.indexServiceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jingpinke.Dao.JingpinIDao;
import com.jingpinke.DaoImpl.JingpinDaoImpl;
import com.jingpinke.entity.Chapter;
import com.jingpinke.entity.Course;
import com.jingpinke.entity.Coursetype;
import com.jingpinke.entity.Resource;
import com.jingpinke.indexService.JingpinIIndexService;
import com.jingpinke.util.Util;

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

	@Override
	public Map JingpinResouce(String id) {
		String sql = "from Resource where  course.coId="+id+"";
		List<Resource> list = jingpinDao.JinpinHqlDao(sql);
		List l = new ArrayList();
		for(Resource r:list){
			Map m = new HashMap();
			m.put("reid", r.getReId());
			m.put("rename", r.getReName());
			m.put("reisnative", r.getReIsnative());
			m.put("resrc", r.getReSrc());
			m.put("redesc", r.getReDesc());
			l.add(m);
		}
		Map m2= new HashMap();
		m2.put("re", l);
		m2.put("coname", coursename(id));
		m2.put("coid", id);
		return m2;
	}

	@Override
	public Map JingpinTestPaper(String id) {
		String sql = "SELECT * from testpaper where CO_ID="+id+"";
		List<Object[]> list = jingpinDao.JinpinSqlDao(sql);
		List array = new ArrayList();
		for (Object[] obj : list) {
			Map hotMap = new HashMap();
			hotMap.put("tpid", obj[0]);
			hotMap.put("coid", obj[1]);
			hotMap.put("tpname", obj[2]);
			hotMap.put("tpdesc", obj[3]);
			hotMap.put("tptime", obj[4]);
			array.add(hotMap);
		}
		Map m = new HashMap();
		m.put("tp", array);
		m.put("coname", coursename(id));
		m.put("coid", id);
		return m;
	}

	@Override
	public Map JingpinTaskList(String id) {
	String sql = "select * from task";
	List<Object[]> list = jingpinDao.JinpinSqlDao(sql);
	List array = new ArrayList();
	for(Object[] o :list){
		Map m = new HashMap();
		String sql2 = "select * from taskfile where ta_id ="+o[1]+"";
		List list2 = jingpinDao.JinpinSqlDao(sql2);
		if(list2.size()>0){
			m.put("tayes", "1");
		}else{
			m.put("tayes", "0");
		}
		m.put("taid", o[0]);
		m.put("taname", o[2]);
		m.put("tadesc", o[3]);
		array.add(m);
	}
	Map m = new HashMap();
	m.put("ta", array);
	m.put("coname", coursename(id));
	m.put("coid", id);
		return m;
	}

	@Override
	public Map JingpinTask(String course, String task) {
		String sql = "select * from task where ta_id="+task+"";
		List<Object[]> list = jingpinDao.JinpinSqlDao(sql);
		Map m = new HashMap();
		m.put("taid", list.get(0)[0]);
		m.put("taname", list.get(0)[2]);
		m.put("tadesc", list.get(0)[3]);
		m.put("coid", course);
		m.put("coname", coursename(course));
		return m;
	}

	@Override
	public Map JingpinAnswerAll() {
		String remen ="SELECT a1.BC_ID, a1.BC_TITLE, a1.BC_DATE, a1.BT_ID, a2.coun, a3.bt_name FROM  `bbstype` a3,  `bbscard` a1"
				+ " LEFT JOIN ( SELECT br_id, bc_id, COUNT( * ) coun FROM  `bbsreply` GROUP BY bc_id )a2 "
				+ "ON a1.bc_id = a2.bc_id WHERE a3.bt_id = a1.bt_id AND a1.bc_istrue =1 ORDER BY a1.BC_DATE desc "
				+ "LIMIT 0 , 11";                    //查询热门答疑前11条
		Map map = new HashMap();
		List<Object[]> remenlist = jingpinDao.JinpinSqlDao(remen);
		List list = new ArrayList();
		for(Object[] o:remenlist){
			Map m = new HashMap();
			m.put("bcid", Util.isNull(o[0]));
			m.put("bctitle", Util.isNull(o[1]));
			m.put("bcdate", Util.isNull(o[2]));
			m.put("btid", Util.isNull(o[3]));
			m.put("coun", Util.isNull(o[4]));
			m.put("btname", Util.isNull(o[5]));
			list.add(m);
		}
		map.put("remen",list);
		String fenlei="SELECT a1.bt_id, a1.co_id, a1.bt_name, a1.bt_ico, a2.coun FROM  `bbstype` a1 "
				+ "LEFT JOIN ( SELECT bt_id, bc_id, COUNT( bc_id ) coun FROM bbscard "
				+ "GROUP BY bt_id )a2 ON a1.bt_id = a2.bt_id";        //查询分类
		remenlist = jingpinDao.JinpinSqlDao(fenlei);
		List list2 = new ArrayList();
		for(Object[] o:remenlist){
			Map m = new HashMap();
			m.put("btid", Util.isNull(o[0]));
			m.put("coid", Util.isNull(o[1]));
			m.put("btname", Util.isNull(o[2]));
			m.put("btico", Util.isNull(o[3]));
			m.put("coun", Util.isNull(o[4]));
			list2.add(m);
		}
		map.put("fenlei", list2);
		String teacher ="select a1.ma_name,a1.ma_id,a1.ma_ico,a2.coun from manager a1 left join"
				+ " (select ma_id, count(br_id) coun from bbsreply group by ma_id) a2 on a1.ma_id = a2.ma_id "
				+ "order by a2.coun desc";    //查询热门教师  
		remenlist = jingpinDao.JinpinSqlDao(teacher);
		List list3 = new ArrayList();
		for(Object[] o:remenlist){
			Map m = new HashMap();
			m.put("maname", Util.isNull(o[0]));
			m.put("maid", Util.isNull(o[1]));
			m.put("maico", Util.isNull(o[2]));
			m.put("coun", Util.isNull(o[3]));
			list3.add(m);
		}
		map.put("teacher", list3);
		return map;
	}
}
