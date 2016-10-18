package com.jingpinke.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Question entity. @author MyEclipse Persistence Tools
 */

public class Question implements java.io.Serializable {

	// Fields

	private Integer quId;
	private Testpaper testpaper;
	private String quName;
	private Integer quScore;
	private Integer quType;
	private String quAnswer;
	private Set questionoptions = new HashSet(0);

	// Constructors

	/** default constructor */
	public Question() {
	}

	/** minimal constructor */
	public Question(String quAnswer) {
		this.quAnswer = quAnswer;
	}

	/** full constructor */
	public Question(Testpaper testpaper, String quName, Integer quScore,
			Integer quType, String quAnswer, Set questionoptions) {
		this.testpaper = testpaper;
		this.quName = quName;
		this.quScore = quScore;
		this.quType = quType;
		this.quAnswer = quAnswer;
		this.questionoptions = questionoptions;
	}

	// Property accessors

	public Integer getQuId() {
		return this.quId;
	}

	public void setQuId(Integer quId) {
		this.quId = quId;
	}

	public Testpaper getTestpaper() {
		return this.testpaper;
	}

	public void setTestpaper(Testpaper testpaper) {
		this.testpaper = testpaper;
	}

	public String getQuName() {
		return this.quName;
	}

	public void setQuName(String quName) {
		this.quName = quName;
	}

	public Integer getQuScore() {
		return this.quScore;
	}

	public void setQuScore(Integer quScore) {
		this.quScore = quScore;
	}

	public Integer getQuType() {
		return this.quType;
	}

	public void setQuType(Integer quType) {
		this.quType = quType;
	}

	public String getQuAnswer() {
		return this.quAnswer;
	}

	public void setQuAnswer(String quAnswer) {
		this.quAnswer = quAnswer;
	}

	public Set getQuestionoptions() {
		return this.questionoptions;
	}

	public void setQuestionoptions(Set questionoptions) {
		this.questionoptions = questionoptions;
	}

}