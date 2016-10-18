package com.jingpinke.entity;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Course entity. @author MyEclipse Persistence Tools
 */

public class Course implements java.io.Serializable {


	private Integer coId;
	private Coursetype coursetype;
	private Timestamp coDate;
	private String coDesc;
	private String coImg;
	private String coIntroduct;
	private Integer coIsplay;
	private String coKnown;
	private String coName;
	private Integer coRecommend;
	private Integer rank;

	private Set resources = new HashSet(0);
	private Set teachings = new HashSet(0);
	private Set tasks = new HashSet(0);
	private Set bbstypes = new HashSet(0);
	private Set chapters = new HashSet(0);
	private Set testpapers = new HashSet(0);
	private Set studies = new HashSet(0);

	// Constructors

	/** default constructor */
	public Course() {
	}

	/** full constructor */
	public Course(Coursetype coursetype, Timestamp coDate, String coDesc,
			String coImg, String coIntroduct, Integer coIsplay, String coKnown,
			String coName, Integer coRecommend, Integer rank, Set resources,
			Set teachings, Set tasks, Set bbstypes, Set chapters,
			Set testpapers, Set studies) {
		this.coursetype = coursetype;
		this.coDate = coDate;
		this.coDesc = coDesc;
		this.coImg = coImg;
		this.coIntroduct = coIntroduct;
		this.coIsplay = coIsplay;
		this.coKnown = coKnown;
		this.coName = coName;
		this.coRecommend = coRecommend;
		this.rank = rank;
		this.resources = resources;
		this.teachings = teachings;
		this.tasks = tasks;
		this.bbstypes = bbstypes;
		this.chapters = chapters;
		this.testpapers = testpapers;
		this.studies = studies;
	}

	// Property accessors

	public Integer getCoId() {
		return this.coId;
	}

	public void setCoId(Integer coId) {
		this.coId = coId;
	}

	public Coursetype getCoursetype() {
		return this.coursetype;
	}

	public void setCoursetype(Coursetype coursetype) {
		this.coursetype = coursetype;
	}

	public Timestamp getCoDate() {
		return this.coDate;
	}

	public void setCoDate(Timestamp coDate) {
		this.coDate = coDate;
	}

	public String getCoDesc() {
		return this.coDesc;
	}

	public void setCoDesc(String coDesc) {
		this.coDesc = coDesc;
	}

	public String getCoImg() {
		return this.coImg;
	}

	public void setCoImg(String coImg) {
		this.coImg = coImg;
	}

	public String getCoIntroduct() {
		return this.coIntroduct;
	}

	public void setCoIntroduct(String coIntroduct) {
		this.coIntroduct = coIntroduct;
	}

	public Integer getCoIsplay() {
		return this.coIsplay;
	}

	public void setCoIsplay(Integer coIsplay) {
		this.coIsplay = coIsplay;
	}

	public String getCoKnown() {
		return this.coKnown;
	}

	public void setCoKnown(String coKnown) {
		this.coKnown = coKnown;
	}

	public String getCoName() {
		return this.coName;
	}

	public void setCoName(String coName) {
		this.coName = coName;
	}

	public Integer getCoRecommend() {
		return this.coRecommend;
	}

	public void setCoRecommend(Integer coRecommend) {
		this.coRecommend = coRecommend;
	}

	public Integer getRank() {
		return this.rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public Set getResources() {
		return this.resources;
	}

	public void setResources(Set resources) {
		this.resources = resources;
	}

	public Set getTeachings() {
		return this.teachings;
	}

	public void setTeachings(Set teachings) {
		this.teachings = teachings;
	}

	public Set getTasks() {
		return this.tasks;
	}

	public void setTasks(Set tasks) {
		this.tasks = tasks;
	}

	public Set getBbstypes() {
		return this.bbstypes;
	}

	public void setBbstypes(Set bbstypes) {
		this.bbstypes = bbstypes;
	}

	public Set getChapters() {
		return this.chapters;
	}

	public void setChapters(Set chapters) {
		this.chapters = chapters;
	}

	public Set getTestpapers() {
		return this.testpapers;
	}

	public void setTestpapers(Set testpapers) {
		this.testpapers = testpapers;
	}

	public Set getStudies() {
		return this.studies;
	}

	public void setStudies(Set studies) {
		this.studies = studies;
	}

}