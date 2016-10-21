package com.jingpinke.DaoImpl;

import java.text.SimpleDateFormat;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.jingpinke.Dao.JingpinIDao;
@Transactional
public class JingpinDaoImpl implements JingpinIDao {
	private SessionFactory sf;
	private SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	@Override
	public List JinpinSqlDao(String sql) {
		String hql = "select new map(ct.ctId as ctid,ct.ctName as ctname,ct.ctDesc as ctdesc, c.coName as coname,c.coDecs as codesc"
				+ " ,co.coId as coid,COUNT(sd.stId) as count )"
				+ " from Coursetype ct,Course as c LEFT JOIN study as sd on sd.course=c"
				+ " WHERE ct=co.coursetype GROUP BYc.coId";
		
//		Query q = sf.getCurrentSession().createQuery(sql);
		Query q = sf.getCurrentSession().createSQLQuery(sql);
		
		return q.list();
	}

	@Override
	public List JinpinHqlDao(String hql) {
		Query q = sf.getCurrentSession().createQuery(hql);
		return q.list();
	}
}
