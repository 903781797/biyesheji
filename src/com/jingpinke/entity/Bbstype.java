package com.jingpinke.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Bbstype entity. @author MyEclipse Persistence Tools
 */

public class Bbstype implements java.io.Serializable {

	// Fields

	private Integer btId;
	private Course course;
	private String btName;
	private String btIco;
	private Set bbscards = new HashSet(0);

	// Constructors

	/** default constructor */
	public Bbstype() {
	}

	/** full constructor */
	public Bbstype(Course course, String btName, String btIco, Set bbscards) {
		this.course = course;
		this.btName = btName;
		this.btIco = btIco;
		this.bbscards = bbscards;
	}

	// Property accessors

	public Integer getBtId() {
		return this.btId;
	}

	public void setBtId(Integer btId) {
		this.btId = btId;
	}

	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public String getBtName() {
		return this.btName;
	}

	public void setBtName(String btName) {
		this.btName = btName;
	}

	public String getBtIco() {
		return this.btIco;
	}

	public void setBtIco(String btIco) {
		this.btIco = btIco;
	}

	public Set getBbscards() {
		return this.bbscards;
	}

	public void setBbscards(Set bbscards) {
		this.bbscards = bbscards;
	}

}