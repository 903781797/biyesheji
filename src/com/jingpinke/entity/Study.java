package com.jingpinke.entity;

/**
 * Study entity. @author MyEclipse Persistence Tools
 */

public class Study implements java.io.Serializable {

	// Fields

	private Integer stId;
	private User user;
	private Course course;

	// Constructors

	/** default constructor */
	public Study() {
	}

	/** full constructor */
	public Study(User user, Course course) {
		this.user = user;
		this.course = course;
	}

	// Property accessors

	public Integer getStId() {
		return this.stId;
	}

	public void setStId(Integer stId) {
		this.stId = stId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

}