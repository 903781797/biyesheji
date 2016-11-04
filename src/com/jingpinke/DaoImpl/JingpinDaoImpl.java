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
		Query q = sf.getCurrentSession().createSQLQuery(sql);
		return q.list();
	}

	@Override
	public List JinpinHqlDao(String hql) {
		Query q = sf.getCurrentSession().createQuery(hql);
		return q.list();
	}

	@Override
	public int sizeSql(String sql) {
		Query q = sf.getCurrentSession().createSQLQuery(sql);
		int size =q.list().size();
		return size;
	}

	@Override
	public int sizeHql(String hql) {
		Query q = sf.getCurrentSession().createQuery(hql);
		int size =q.list().size();
		return size;
	}

}
