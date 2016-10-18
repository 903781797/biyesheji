package com.jingpinke.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Role entity. @author MyEclipse Persistence Tools
 */

public class Role implements java.io.Serializable {

	// Fields

	private Integer roId;
	private String roName;
	private String roMenus;
	private Set managers = new HashSet(0);

	// Constructors

	/** default constructor */
	public Role() {
	}

	/** full constructor */
	public Role(String roName, String roMenus, Set managers) {
		this.roName = roName;
		this.roMenus = roMenus;
		this.managers = managers;
	}

	// Property accessors

	public Integer getRoId() {
		return this.roId;
	}

	public void setRoId(Integer roId) {
		this.roId = roId;
	}

	public String getRoName() {
		return this.roName;
	}

	public void setRoName(String roName) {
		this.roName = roName;
	}

	public String getRoMenus() {
		return this.roMenus;
	}

	public void setRoMenus(String roMenus) {
		this.roMenus = roMenus;
	}

	public Set getManagers() {
		return this.managers;
	}

	public void setManagers(Set managers) {
		this.managers = managers;
	}

}