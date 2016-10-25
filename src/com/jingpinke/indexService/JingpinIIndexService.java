package com.jingpinke.indexService;

import java.util.List;
import java.util.Map;

import com.jingpinke.entity.Coursetype;

public interface JingpinIIndexService {
    /**
     * Writer��zhaoqingchun
     * Create Date :2016-10-20
     * Description: ���пγ���ҳService
     */
public Map JingpinHomeService();
/**
 * Writer��zhaoqingchun
 * Create Date :2016-10-20
 * Description: ��ȡ�Ƽ��γ�
 */
public List JingpinHost();
/**
 * Writer��zhaoqingchun
 * Create Date :2016-10-20
 * Description: ��ȡ�γ̷���
 */
public List JingpinCourseType();
/**
 * Writer��zhaoqingchun
 * Create Date :2016-10-20
 * Description: ���пγ�
 */
public List JingpinCourse(List<Coursetype> ct);
/**
 * Writer��zhaoqingchun
 * Create Date :2016-10-21
 * Description: ָ���γ���ҳ
 */
public Map JingpinCourseHomeService(String id);
/**
 * Writer��zhaoqingchun
 * Create Date :2016-10-23
 * Description: ��Ƶ�б�
 */
public Map JingpinVideoListService(String id);
/**
 * Writer��zhaoqingchun
 * Create Date :2016-10-23
 * Description: ��Ƶ
 */
public Map JingpinVideoService(String id,String video);
/**
 * Writer��zhaoqingchun
 * Create Date :2016-10-24
 * Description: �ļ�����
 */
public Map JingpinResouce(String id);
public Map JingpinTestPaper(String id);
public Map JingpinTaskList(String id);
public Map JingpinTask(String course,String task);
public Map JingpinAnswerAll();
}
