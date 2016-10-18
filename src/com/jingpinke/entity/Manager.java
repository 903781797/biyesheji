package com.jingpinke.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Manager entity. @author MyEclipse Persistence Tools
 */

public class Manager implements java.io.Serializable {

	// Fields

	private String maId;
	private Role role;
	private String maPassword;
	private String maName;
	private String maTitle;
	private String maIco;
	private Integer maSex;
	private Set bbsreplies = new HashSet(0);
	private Set teachings = new HashSet(0);
	private Set bbscards = new HashSet(0);

	// Constructors

	/** default constructor */
	public Manager() {
	}

	/** minimal constructor */
	public Manager(String maId) {
		this.maId = maId;
	}

	/** full constructor */
	public Manager(String maId, Role role, String maPassword, String maName,
			String maTitle, String maIco, Integer maSex, Set bbsreplies,
			Set teachings, Set bbscards) {
		this.maId = maId;
		this.role = role;
		this.maPassword = maPassword;
		this.maName = maName;
		this.maTitle = maTitle;
		this.maIco = maIco;
		this.maSex = maSex;
		this.bbsreplies = bbsreplies;
		this.teachings = teachings;
		this.bbscards = bbscards;
	}

	// Property accessors

	public String getMaId() {
		return this.maId;
	}

	public void setMaId(String maId) {
		this.maId = maId;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getMaPassword() {
		return this.maPassword;
	}

	public void setMaPassword(String maPassword) {
		this.maPassword = maPassword;
	}

	public String getMaName() {
		return this.maName;
	}

	public void setMaName(String maName) {
		this.maName = maName;
	}

	public String getMaTitle() {
		return this.maTitle;
	}

	public void setMaTitle(String maTitle) {
		this.maTitle = maTitle;
	}

	public String getMaIco() {
		return this.maIco;
	}

	public void setMaIco(String maIco) {
		this.maIco = maIco;
	}

	public Integer getMaSex() {
		return this.maSex;
	}

	public void setMaSex(Integer maSex) {
		this.maSex = maSex;
	}

	public Set getBbsreplies() {
		return this.bbsreplies;
	}

	public void setBbsreplies(Set bbsreplies) {
		this.bbsreplies = bbsreplies;
	}

	public Set getTeachings() {
		return this.teachings;
	}

	public void setTeachings(Set teachings) {
		this.teachings = teachings;
	}

	public Set getBbscards() {
		return this.bbscards;
	}

	public void setBbscards(Set bbscards) {
		this.bbscards = bbscards;
	}

}