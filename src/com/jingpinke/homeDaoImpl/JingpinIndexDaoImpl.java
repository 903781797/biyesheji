package com.jingpinke.homeDaoImpl;

import java.text.SimpleDateFormat;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.jingpinke.homeDao.JingpinIIndexDao;
@Transactional
public class JingpinIndexDaoImpl implements JingpinIIndexDao {
	private SessionFactory sf;
	private SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	@Override
	public List JinpinHomeDao(String sql) {
		String hql = "select new map(ct.ctId as ctid,ct.ctName as ctname,ct.ctDesc as ctdesc, c.coName as coname,c.coDecs as codesc"
				+ " ,co.coId as coid,COUNT(sd.stId) as count )"
				+ " from Coursetype ct,Course as c LEFT JOIN study as sd on sd.course=c"
				+ " WHERE ct=co.coursetype GROUP BYc.coId";
		
//		Query q = sf.getCurrentSession().createQuery(sql);
		Query q = sf.getCurrentSession().createSQLQuery(sql);
		
		return q.list();
	}
}
