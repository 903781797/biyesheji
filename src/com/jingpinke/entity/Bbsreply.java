package com.jingpinke.entity;

import java.sql.Timestamp;

/**
 * Bbsreply entity. @author MyEclipse Persistence Tools
 */

public class Bbsreply implements java.io.Serializable {

	// Fields

	private Integer brId;
	private User user;
	private Manager manager;
	private Bbscard bbscard;
	private String brContent;
	private Timestamp brDate;
	private Integer brIstrue;
	private Integer brLike;

	// Constructors

	/** default constructor */
	public Bbsreply() {
	}

	/** minimal constructor */
	public Bbsreply(Integer brId) {
		this.brId = brId;
	}

	/** full constructor */
	public Bbsreply(Integer brId, User user, Manager manager, Bbscard bbscard,
			String brContent, Timestamp brDate, Integer brIstrue, Integer brLike) {
		this.brId = brId;
		this.user = user;
		this.manager = manager;
		this.bbscard = bbscard;
		this.brContent = brContent;
		this.brDate = brDate;
		this.brIstrue = brIstrue;
		this.brLike = brLike;
	}

	// Property accessors

	public Integer getBrId() {
		return this.brId;
	}

	public void setBrId(Integer brId) {
		this.brId = brId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Manager getManager() {
		return this.manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public Bbscard getBbscard() {
		return this.bbscard;
	}

	public void setBbscard(Bbscard bbscard) {
		this.bbscard = bbscard;
	}

	public String getBrContent() {
		return this.brContent;
	}

	public void setBrContent(String brContent) {
		this.brContent = brContent;
	}

	public Timestamp getBrDate() {
		return this.brDate;
	}

	public void setBrDate(Timestamp brDate) {
		this.brDate = brDate;
	}

	public Integer getBrIstrue() {
		return this.brIstrue;
	}

	public void setBrIstrue(Integer brIstrue) {
		this.brIstrue = brIstrue;
	}

	public Integer getBrLike() {
		return this.brLike;
	}

	public void setBrLike(Integer brLike) {
		this.brLike = brLike;
	}

}