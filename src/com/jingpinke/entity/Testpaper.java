package com.jingpinke.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Testpaper entity. @author MyEclipse Persistence Tools
 */

public class Testpaper implements java.io.Serializable {

	// Fields

	private Integer tpId;
	private Course course;
	private String tpName;
	private String tpDesc;
	private Integer tpTimelimit;
	private Set questions = new HashSet(0);
	private Set scores = new HashSet(0);

	// Constructors

	/** default constructor */
	public Testpaper() {
	}

	/** full constructor */
	public Testpaper(Course course, String tpName, String tpDesc,
			Integer tpTimelimit, Set questions, Set scores) {
		this.course = course;
		this.tpName = tpName;
		this.tpDesc = tpDesc;
		this.tpTimelimit = tpTimelimit;
		this.questions = questions;
		this.scores = scores;
	}

	// Property accessors

	public Integer getTpId() {
		return this.tpId;
	}

	public void setTpId(Integer tpId) {
		this.tpId = tpId;
	}

	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public String getTpName() {
		return this.tpName;
	}

	public void setTpName(String tpName) {
		this.tpName = tpName;
	}

	public String getTpDesc() {
		return this.tpDesc;
	}

	public void setTpDesc(String tpDesc) {
		this.tpDesc = tpDesc;
	}

	public Integer getTpTimelimit() {
		return this.tpTimelimit;
	}

	public void setTpTimelimit(Integer tpTimelimit) {
		this.tpTimelimit = tpTimelimit;
	}

	public Set getQuestions() {
		return this.questions;
	}

	public void setQuestions(Set questions) {
		this.questions = questions;
	}

	public Set getScores() {
		return this.scores;
	}

	public void setScores(Set scores) {
		this.scores = scores;
	}

}