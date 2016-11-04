package com.jingpinke.Dao;

import java.util.List;

public interface JingpinIDao {
    public List JinpinSqlDao(String sql);
    public List JinpinHqlDao(String hql);
    public int sizeSql(String sql);
    public int sizeHql(String hql);
}
