package com.jingpinke.entity;

/**
 * Teaching entity. @author MyEclipse Persistence Tools
 */

public class Teaching implements java.io.Serializable {

	// Fields

	private Integer teId;
	private Manager manager;
	private Course course;

	// Constructors

	/** default constructor */
	public Teaching() {
	}

	/** full constructor */
	public Teaching(Manager manager, Course course) {
		this.manager = manager;
		this.course = course;
	}

	// Property accessors

	public Integer getTeId() {
		return this.teId;
	}

	public void setTeId(Integer teId) {
		this.teId = teId;
	}

	public Manager getManager() {
		return this.manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

}