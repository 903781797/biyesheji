package com.jingpinke.entity;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Bbscard entity. @author MyEclipse Persistence Tools
 */

public class Bbscard implements java.io.Serializable {

	// Fields

	private Integer bcId;
	private User user;
	private Manager manager;
	private Bbstype bbstype;
	private String bcTitle;
	private String bcContent;
	private Timestamp bcDate;
	private Integer bcIstrue;
	private Set bbsreplies = new HashSet(0);

	// Constructors

	/** default constructor */
	public Bbscard() {
	}

	/** minimal constructor */
	public Bbscard(Timestamp bcDate, Integer bcIstrue) {
		this.bcDate = bcDate;
		this.bcIstrue = bcIstrue;
	}

	/** full constructor */
	public Bbscard(User user, Manager manager, Bbstype bbstype, String bcTitle,
			String bcContent, Timestamp bcDate, Integer bcIstrue, Set bbsreplies) {
		this.user = user;
		this.manager = manager;
		this.bbstype = bbstype;
		this.bcTitle = bcTitle;
		this.bcContent = bcContent;
		this.bcDate = bcDate;
		this.bcIstrue = bcIstrue;
		this.bbsreplies = bbsreplies;
	}

	// Property accessors

	public Integer getBcId() {
		return this.bcId;
	}

	public void setBcId(Integer bcId) {
		this.bcId = bcId;
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

	public Bbstype getBbstype() {
		return this.bbstype;
	}

	public void setBbstype(Bbstype bbstype) {
		this.bbstype = bbstype;
	}

	public String getBcTitle() {
		return this.bcTitle;
	}

	public void setBcTitle(String bcTitle) {
		this.bcTitle = bcTitle;
	}

	public String getBcContent() {
		return this.bcContent;
	}

	public void setBcContent(String bcContent) {
		this.bcContent = bcContent;
	}

	public Timestamp getBcDate() {
		return this.bcDate;
	}

	public void setBcDate(Timestamp bcDate) {
		this.bcDate = bcDate;
	}

	public Integer getBcIstrue() {
		return this.bcIstrue;
	}

	public void setBcIstrue(Integer bcIstrue) {
		this.bcIstrue = bcIstrue;
	}

	public Set getBbsreplies() {
		return this.bbsreplies;
	}

	public void setBbsreplies(Set bbsreplies) {
		this.bbsreplies = bbsreplies;
	}

}