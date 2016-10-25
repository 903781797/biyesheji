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
/**
 * Writer：zhaoqingchun
 * Create Date :2016-10-21
 * Description: 指定课程首页
 */
public Map JingpinCourseHomeService(String id);
/**
 * Writer：zhaoqingchun
 * Create Date :2016-10-23
 * Description: 视频列表
 */
public Map JingpinVideoListService(String id);
/**
 * Writer：zhaoqingchun
 * Create Date :2016-10-23
 * Description: 视频
 */
public Map JingpinVideoService(String id,String video);
/**
 * Writer：zhaoqingchun
 * Create Date :2016-10-24
 * Description: 文件下载
 */
public Map JingpinResouce(String id);
public Map JingpinTestPaper(String id);
public Map JingpinTaskList(String id);
public Map JingpinTask(String course,String task);
public Map JingpinAnswerAll();
}
