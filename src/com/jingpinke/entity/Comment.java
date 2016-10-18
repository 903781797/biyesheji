package com.jingpinke.entity;

import java.sql.Timestamp;

/**
 * Comment entity. @author MyEclipse Persistence Tools
 */

public class Comment implements java.io.Serializable {

	// Fields

	private Integer comId;
	private User user;
	private Course course;
	private String comContent;
	private Timestamp comDate;

	// Constructors

	/** default constructor */
	public Comment() {
	}

	/** full constructor */
	public Comment(User user, Course course, String comContent,
			Timestamp comDate) {
		this.user = user;
		this.course = course;
		this.comContent = comContent;
		this.comDate = comDate;
	}

	// Property accessors

	public Integer getComId() {
		return this.comId;
	}

	public void setComId(Integer comId) {
		this.comId = comId;
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

	public String getComContent() {
		return this.comContent;
	}

	public void setComContent(String comContent) {
		this.comContent = comContent;
	}

	public Timestamp getComDate() {
		return this.comDate;
	}

	public void setComDate(Timestamp comDate) {
		this.comDate = comDate;
	}

}