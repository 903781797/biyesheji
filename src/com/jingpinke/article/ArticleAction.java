package com.jingpinke.article;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.struts2.interceptor.ServletResponseAware;

import com.jingpinke.acticleService.JingpinIArticleService;
import com.jingpinke.constant.Constant;
import com.jingpinke.model.Page;
import com.jingpinke.util.ResponseUtil;

public class ArticleAction implements ServletResponseAware {
private JingpinIArticleService articleService;
private String articleId;
public JSONObject getO() {
	return o;
}
public void setO(JSONObject o) {
	this.o = o;
}
public String getPage() {
	return page;
}
public void setPage(String page) {
	this.page = page;
}
private Map map;
private JSONObject o;
private String page;
public void next(){
	int p = Integer.parseInt(page);
	System.out.println("p"+p);
	Page page=new Page(Constant.pageSize,0,p);
	o= articleService.getList(articleId, page);
	try {
		ResponseUtil.ResponseWrite(response, o);
	} catch (IOException e) {
		e.printStackTrace();
	}
}
public String getArticle(){
	map = articleService.getArtice(articleId);
	System.out.println(map);
	return "article";
}
public String getList(){
	Page page=new Page(Constant.pageSize,0,1);
	o= articleService.getList(articleId, page);
	System.out.println(o);
	return "articleList";
}

public Map getMap() {
	return map;
}

public void setMap(Map map) {
	this.map = map;
}

public String getArticleId() {
	return articleId;
}

public void setArticleId(String articleId) {
	this.articleId = articleId;
}

public JingpinIArticleService getArticleService() {
	return articleService;
}

public void setArticleService(JingpinIArticleService articleService) {
	this.articleService = articleService;
}
HttpServletResponse response ;
@Override
public void setServletResponse(HttpServletResponse arg0) {
	response=arg0;
	
}
}
