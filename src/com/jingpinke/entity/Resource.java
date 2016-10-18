package com.jingpinke.entity;

/**
 * Resource entity. @author MyEclipse Persistence Tools
 */

public class Resource implements java.io.Serializable {

	// Fields

	private Integer reId;
	private Resourcetype resourcetype;
	private Course course;
	private String reName;
	private String reSrc;
	private Integer reIsnative;
	private String reDesc;
	private String reFormat;

	// Constructors

	/** default constructor */
	public Resource() {
	}

	/** full constructor */
	public Resource(Resourcetype resourcetype, Course course, String reName,
			String reSrc, Integer reIsnative, String reDesc, String reFormat) {
		this.resourcetype = resourcetype;
		this.course = course;
		this.reName = reName;
		this.reSrc = reSrc;
		this.reIsnative = reIsnative;
		this.reDesc = reDesc;
		this.reFormat = reFormat;
	}

	// Property accessors

	public Integer getReId() {
		return this.reId;
	}

	public void setReId(Integer reId) {
		this.reId = reId;
	}

	public Resourcetype getResourcetype() {
		return this.resourcetype;
	}

	public void setResourcetype(Resourcetype resourcetype) {
		this.resourcetype = resourcetype;
	}

	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public String getReName() {
		return this.reName;
	}

	public void setReName(String reName) {
		this.reName = reName;
	}

	public String getReSrc() {
		return this.reSrc;
	}

	public void setReSrc(String reSrc) {
		this.reSrc = reSrc;
	}

	public Integer getReIsnative() {
		return this.reIsnative;
	}

	public void setReIsnative(Integer reIsnative) {
		this.reIsnative = reIsnative;
	}

	public String getReDesc() {
		return this.reDesc;
	}

	public void setReDesc(String reDesc) {
		this.reDesc = reDesc;
	}

	public String getReFormat() {
		return this.reFormat;
	}

	public void setReFormat(String reFormat) {
		this.reFormat = reFormat;
	}

}