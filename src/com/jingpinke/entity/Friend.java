package com.jingpinke.entity;

/**
 * Friend entity. @author MyEclipse Persistence Tools
 */

public class Friend implements java.io.Serializable {

	// Fields

	private Integer frId;
	private String frName;
	private Integer frRank;

	// Constructors

	/** default constructor */
	public Friend() {
	}

	/** full constructor */
	public Friend(String frName, Integer frRank) {
		this.frName = frName;
		this.frRank = frRank;
	}

	// Property accessors

	public Integer getFrId() {
		return this.frId;
	}

	public void setFrId(Integer frId) {
		this.frId = frId;
	}

	public String getFrName() {
		return this.frName;
	}

	public void setFrName(String frName) {
		this.frName = frName;
	}

	public Integer getFrRank() {
		return this.frRank;
	}

	public void setFrRank(Integer frRank) {
		this.frRank = frRank;
	}

}