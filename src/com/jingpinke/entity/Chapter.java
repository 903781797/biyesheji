package com.jingpinke.entity;

/**
 * Chapter entity. @author MyEclipse Persistence Tools
 */

public class Chapter implements java.io.Serializable {

	// Fields

	private Integer chId;
	private Course course;
	private String chName;
	private String chSrc;

	// Constructors

	/** default constructor */
	public Chapter() {
	}

	public Integer getChId() {
		return chId;
	}

	public void setChId(Integer chId) {
		this.chId = chId;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public String getChName() {
		return chName;
	}

	public void setChName(String chName) {
		this.chName = chName;
	}

	public String getChSrc() {
		return chSrc;
	}

	public void setChSrc(String chSrc) {
		this.chSrc = chSrc;
	}

	

}