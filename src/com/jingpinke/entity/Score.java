package com.jingpinke.entity;

/**
 * Score entity. @author MyEclipse Persistence Tools
 */

public class Score implements java.io.Serializable {

	// Fields

	private Integer scId;
	private User user;
	private Testpaper testpaper;
	private Integer scNumber;

	// Constructors

	/** default constructor */
	public Score() {
	}

	/** full constructor */
	public Score(User user, Testpaper testpaper, Integer scNumber) {
		this.user = user;
		this.testpaper = testpaper;
		this.scNumber = scNumber;
	}

	// Property accessors

	public Integer getScId() {
		return this.scId;
	}

	public void setScId(Integer scId) {
		this.scId = scId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Testpaper getTestpaper() {
		return this.testpaper;
	}

	public void setTestpaper(Testpaper testpaper) {
		this.testpaper = testpaper;
	}

	public Integer getScNumber() {
		return this.scNumber;
	}

	public void setScNumber(Integer scNumber) {
		this.scNumber = scNumber;
	}

}