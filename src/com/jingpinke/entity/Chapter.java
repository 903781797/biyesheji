package com.jingpinke.entity;

/**
 * Chapter entity. @author MyEclipse Persistence Tools
 */

public class Chapter implements java.io.Serializable {

	// Fields

	private Integer chId;
	private Course course;
	private Video video;
	private String chName;
	private Integer chParent;
	private Integer chIsparent;
	private Integer chIsintroduct;
	// Constructors

	/** default constructor */
	public Chapter() {
	}

	/** full constructor */
	public Chapter(Course course, Video video, String chName, Integer chParent,
			Integer chIsparent, Integer chIsintroduct) {
		this.course = course;
		this.video = video;
		this.chName = chName;
		this.chParent = chParent;
		this.chIsparent = chIsparent;
		this.chIsintroduct = chIsintroduct;
	}

	// Property accessors

	public Integer getChId() {
		return this.chId;
	}

	public void setChId(Integer chId) {
		this.chId = chId;
	}

	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Video getVideo() {
		return this.video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	public String getChName() {
		return this.chName;
	}

	public void setChName(String chName) {
		this.chName = chName;
	}

	public Integer getChParent() {
		return this.chParent;
	}

	public void setChParent(Integer chParent) {
		this.chParent = chParent;
	}

	public Integer getChIsparent() {
		return this.chIsparent;
	}

	public void setChIsparent(Integer chIsparent) {
		this.chIsparent = chIsparent;
	}

	public Integer getChIsintroduct() {
		return this.chIsintroduct;
	}

	public void setChIsintroduct(Integer chIsintroduct) {
		this.chIsintroduct = chIsintroduct;
	}

}