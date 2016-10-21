package com.jingpinke.indexAction;

import java.util.Map;

import com.jingpinke.indexService.JingpinIIndexService;
import com.opensymphony.xwork2.ActionSupport;

public class IndexAction extends ActionSupport {
    private JingpinIIndexService jingpinIndexService;
    private Map allCourse;
    public void setJingpinIndexService(JingpinIIndexService jingpinIndexService) {
        this.jingpinIndexService = jingpinIndexService;
	}

    @Override
	public String execute() throws Exception {
		allCourse=jingpinIndexService.JingpinHomeService();
		System.out.println(allCourse);
		return SUCCESS;
	}

	public Map getAllCourse() {
		return allCourse;
	}

	public void setAllCourse(Map allCourse) {
		this.allCourse = allCourse;
	}
}
