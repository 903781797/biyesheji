package com.jingpinke.indexAction;

import java.util.Map;

import com.jingpinke.indexService.JingpinIIndexService;
import com.opensymphony.xwork2.ActionSupport;

public class IndexAction extends ActionSupport {
    private JingpinIIndexService jingpinIndexService;
    private Map allCourse;
    private String courseid;
    private String videoid;

	public String getVideoid() {
		return videoid;
	}

	public void setVideoid(String videoid) {
		this.videoid = videoid;
	}

	public String getCourseid() {
		return courseid;
	}

	public void setCourseid(String courseid) {
		this.courseid = courseid;
	}

	public void setJingpinIndexService(JingpinIIndexService jingpinIndexService) {
        this.jingpinIndexService = jingpinIndexService;
	}

    @Override
	public String execute() throws Exception {
		allCourse=jingpinIndexService.JingpinHomeService();
		return SUCCESS;
	}
    public String courseHome(){
    	allCourse = jingpinIndexService.JingpinCourseHomeService(courseid);
    	System.out.println(allCourse);
    	return "courseHome";
    }
    public String videoList(){
    	allCourse = jingpinIndexService.JingpinVideoListService(courseid);
    	return "videoList";
    }
    public String video(){
    	allCourse=jingpinIndexService.JingpinVideoService(courseid,videoid);
    	return "video";
    }
	public Map getAllCourse() {
		return allCourse;
	}

	public void setAllCourse(Map allCourse) {
		this.allCourse = allCourse;
	}
}
