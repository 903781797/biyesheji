package com.jingpinke.article;

import java.util.Map;

import com.jingpinke.acticleService.JingpinIArticleService;

public class ArticleAction {
private JingpinIArticleService articleService;
private String articleId;
private Map map;


public String getArticle(){
	map = articleService.getArtice(articleId);
	System.out.println(map);
	return "article";
}
public String getList(){
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
}
