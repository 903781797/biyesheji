package com.jingpinke.acticleService;

import java.util.Map;

import net.sf.json.JSONObject;

import com.jingpinke.model.Page;

public interface JingpinIArticleService {
	/**
	 * ����id��ȡ����
	 * @param articleId
	 * @return
	 */
public Map getArtice(String articleId);
/**
 * ������̳����ȡ�����б�
 * @param id
 * @return
 */
public JSONObject getList(String id,Page page);
/**
 * ����
 * @param name
 * @return
 */
public JSONObject search(String name);
}
