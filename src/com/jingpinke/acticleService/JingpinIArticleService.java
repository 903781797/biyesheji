package com.jingpinke.acticleService;

import java.util.Map;

import net.sf.json.JSONObject;

import com.jingpinke.model.Page;

public interface JingpinIArticleService {
	/**
	 * 根据id获取文章
	 * @param articleId
	 * @return
	 */
public Map getArtice(String articleId);
/**
 * 根据论坛类别获取帖子列表
 * @param id
 * @return
 */
public JSONObject getList(String id,Page page);
/**
 * 搜索
 * @param name
 * @return
 */
public JSONObject search(String name);
}
