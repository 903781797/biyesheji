package com.jingpinke.entity;

/**
 * Imgpaly entity. @author MyEclipse Persistence Tools
 */

public class Imgpaly implements java.io.Serializable {

	// Fields

	private Integer ipId;
	private String ipSrc;
	private String ipImg;
	private String ipDesc;

	// Constructors

	/** default constructor */
	public Imgpaly() {
	}

	/** full constructor */
	public Imgpaly(String ipSrc, String ipImg, String ipDesc) {
		this.ipSrc = ipSrc;
		this.ipImg = ipImg;
		this.ipDesc = ipDesc;
	}

	// Property accessors

	public Integer getIpId() {
		return this.ipId;
	}

	public void setIpId(Integer ipId) {
		this.ipId = ipId;
	}

	public String getIpSrc() {
		return this.ipSrc;
	}

	public void setIpSrc(String ipSrc) {
		this.ipSrc = ipSrc;
	}

	public String getIpImg() {
		return this.ipImg;
	}

	public void setIpImg(String ipImg) {
		this.ipImg = ipImg;
	}

	public String getIpDesc() {
		return this.ipDesc;
	}

	public void setIpDesc(String ipDesc) {
		this.ipDesc = ipDesc;
	}

}