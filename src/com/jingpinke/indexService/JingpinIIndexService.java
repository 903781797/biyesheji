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
}
