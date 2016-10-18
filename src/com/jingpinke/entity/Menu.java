package com.jingpinke.entity;

/**
 * Menu entity. @author MyEclipse Persistence Tools
 */

public class Menu implements java.io.Serializable {

	// Fields

	private Integer meId;
	private String meName;
	private String meSrc;
	private Integer meParent;
	private Integer meIsparent;

	// Constructors

	/** default constructor */
	public Menu() {
	}

	/** full constructor */
	public Menu(String meName, String meSrc, Integer meParent,
			Integer meIsparent) {
		this.meName = meName;
		this.meSrc = meSrc;
		this.meParent = meParent;
		this.meIsparent = meIsparent;
	}

	// Property accessors

	public Integer getMeId() {
		return this.meId;
	}

	public void setMeId(Integer meId) {
		this.meId = meId;
	}

	public String getMeName() {
		return this.meName;
	}

	public void setMeName(String meName) {
		this.meName = meName;
	}

	public String getMeSrc() {
		return this.meSrc;
	}

	public void setMeSrc(String meSrc) {
		this.meSrc = meSrc;
	}

	public Integer getMeParent() {
		return this.meParent;
	}

	public void setMeParent(Integer meParent) {
		this.meParent = meParent;
	}

	public Integer getMeIsparent() {
		return this.meIsparent;
	}

	public void setMeIsparent(Integer meIsparent) {
		this.meIsparent = meIsparent;
	}

}