package com.jingpinke.entity;

/**
 * Questionoption entity. @author MyEclipse Persistence Tools
 */

public class Questionoption implements java.io.Serializable {

	// Fields

	private Integer qoId;
	private Question question;
	private String qoName;

	// Constructors

	/** default constructor */
	public Questionoption() {
	}

	/** full constructor */
	public Questionoption(Question question, String qoName) {
		this.question = question;
		this.qoName = qoName;
	}

	// Property accessors

	public Integer getQoId() {
		return this.qoId;
	}

	public void setQoId(Integer qoId) {
		this.qoId = qoId;
	}

	public Question getQuestion() {
		return this.question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public String getQoName() {
		return this.qoName;
	}

	public void setQoName(String qoName) {
		this.qoName = qoName;
	}

}