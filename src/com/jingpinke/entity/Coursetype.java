package com.jingpinke.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Coursetype entity. @author MyEclipse Persistence Tools
 */

public class Coursetype implements java.io.Serializable {

	// Fields

	private Integer ctId;
	private String ctDesc;
	private String ctName;
	private Set courses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Coursetype() {
	}

	/** full constructor */
	public Coursetype(String ctDesc, String ctName, Set courses) {
		this.ctDesc = ctDesc;
		this.ctName = ctName;
		this.courses = courses;
	}

	// Property accessors

	public Integer getCtId() {
		return this.ctId;
	}

	public void setCtId(Integer ctId) {
		this.ctId = ctId;
	}

	public String getCtDesc() {
		return this.ctDesc;
	}

	public void setCtDesc(String ctDesc) {
		this.ctDesc = ctDesc;
	}

	public String getCtName() {
		return this.ctName;
	}

	public void setCtName(String ctName) {
		this.ctName = ctName;
	}

	public Set getCourses() {
		return this.courses;
	}

	public void setCourses(Set courses) {
		this.courses = courses;
	}

}