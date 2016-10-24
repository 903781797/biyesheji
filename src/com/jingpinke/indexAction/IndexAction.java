package com.jingpinke.indexAction;

import java.util.List;
import java.util.Map;

import com.jingpinke.indexService.JingpinIIndexService;
import com.opensymphony.xwork2.ActionSupport;

public class IndexAction extends ActionSupport {
    private JingpinIIndexService jingpinIndexService;
    private Map allCourse;
    private String courseid;
    private String videoid;
    private List list ;
	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

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
    public String resource(){
    	allCourse = jingpinIndexService.JingpinResouce(courseid);
    	return "resource";
    }
    public String testpaper(){
    	allCourse = jingpinIndexService.JingpinTestPaper(courseid);
    	return "testpaperList";
    }
    public String taskList(){
    	allCourse = jingpinIndexService.JingpinTaskList(courseid);
    	return "taskList";
    }
    public String task(){
    	allCourse = jingpinIndexService.JingpinTask(courseid, videoid);
    	return "task";
    }
	public Map getAllCourse() {
		return allCourse;
	}

	public void setAllCourse(Map allCourse) {
		this.allCourse = allCourse;
	}
	
}
