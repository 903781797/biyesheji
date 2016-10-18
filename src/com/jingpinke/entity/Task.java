package com.jingpinke.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Task entity. @author MyEclipse Persistence Tools
 */

public class Task implements java.io.Serializable {

	// Fields

	private Integer taId;
	private Course course;
	private String taName;
	private String taDesc;
	private Set taskfiles = new HashSet(0);

	// Constructors

	/** default constructor */
	public Task() {
	}

	/** full constructor */
	public Task(Course course, String taName, String taDesc, Set taskfiles) {
		this.course = course;
		this.taName = taName;
		this.taDesc = taDesc;
		this.taskfiles = taskfiles;
	}

	// Property accessors

	public Integer getTaId() {
		return this.taId;
	}

	public void setTaId(Integer taId) {
		this.taId = taId;
	}

	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public String getTaName() {
		return this.taName;
	}

	public void setTaName(String taName) {
		this.taName = taName;
	}

	public String getTaDesc() {
		return this.taDesc;
	}

	public void setTaDesc(String taDesc) {
		this.taDesc = taDesc;
	}

	public Set getTaskfiles() {
		return this.taskfiles;
	}

	public void setTaskfiles(Set taskfiles) {
		this.taskfiles = taskfiles;
	}

}