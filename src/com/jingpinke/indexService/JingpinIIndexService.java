package com.jingpinke.indexService;

import java.util.List;
import java.util.Map;

import com.jingpinke.entity.Coursetype;

public interface JingpinIIndexService {
    /**
     * Writer：zhaoqingchun
     * Create Date :2016-10-20
     * Description: 所有课程首页Service
     */
public Map JingpinHomeService();
/**
 * Writer：zhaoqingchun
 * Create Date :2016-10-20
 * Description: 获取推荐课程
 */
public List JingpinHost();
/**
 * Writer：zhaoqingchun
 * Create Date :2016-10-20
 * Description: 获取课程分类
 */
public List JingpinCourseType();
/**
 * Writer：zhaoqingchun
 * Create Date :2016-10-20
 * Description: 所有课程
 */
public List JingpinCourse(List<Coursetype> ct);
}
