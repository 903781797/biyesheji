package com.jingpinke.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Video entity. @author MyEclipse Persistence Tools
 */

public class Video implements java.io.Serializable {

	// Fields

	private Integer viId;
	private String viName;
	private String viSrc;
	private Set chapters = new HashSet(0);

	// Constructors

	/** default constructor */
	public Video() {
	}

	/** full constructor */
	public Video(String viName, String viSrc, Set chapters) {
		this.viName = viName;
		this.viSrc = viSrc;
		this.chapters = chapters;
	}

	// Property accessors

	public Integer getViId() {
		return this.viId;
	}

	public void setViId(Integer viId) {
		this.viId = viId;
	}

	public String getViName() {
		return this.viName;
	}

	public void setViName(String viName) {
		this.viName = viName;
	}

	public String getViSrc() {
		return this.viSrc;
	}

	public void setViSrc(String viSrc) {
		this.viSrc = viSrc;
	}

	public Set getChapters() {
		return this.chapters;
	}

	public void setChapters(Set chapters) {
		this.chapters = chapters;
	}

}