package com.jingpinke.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Resourcetype entity. @author MyEclipse Persistence Tools
 */

public class Resourcetype implements java.io.Serializable {

	// Fields

	private Integer rtId;
	private String rtName;
	private Set resources = new HashSet(0);

	// Constructors

	/** default constructor */
	public Resourcetype() {
	}

	/** full constructor */
	public Resourcetype(String rtName, Set resources) {
		this.rtName = rtName;
		this.resources = resources;
	}

	// Property accessors

	public Integer getRtId() {
		return this.rtId;
	}

	public void setRtId(Integer rtId) {
		this.rtId = rtId;
	}

	public String getRtName() {
		return this.rtName;
	}

	public void setRtName(String rtName) {
		this.rtName = rtName;
	}

	public Set getResources() {
		return this.resources;
	}

	public void setResources(Set resources) {
		this.resources = resources;
	}

}