package com.jingpinke.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private String usId;
	private String usPassword;
	private String usName;
	private String usIco;
	private String usSchool;
	private String usMajor;
	private Integer usSex;
	private String usPhone;
	private Set bbscards = new HashSet(0);
	private Set taskfiles = new HashSet(0);
	private Set bbsreplies = new HashSet(0);
	private Set scores = new HashSet(0);
	private Set studies = new HashSet(0);

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String usId) {
		this.usId = usId;
	}

	/** full constructor */
	public User(String usId, String usPassword, String usName, String usIco,
			String usSchool, String usMajor, Integer usSex, String usPhone,
			Set bbscards, Set taskfiles, Set bbsreplies, Set scores, Set studies) {
		this.usId = usId;
		this.usPassword = usPassword;
		this.usName = usName;
		this.usIco = usIco;
		this.usSchool = usSchool;
		this.usMajor = usMajor;
		this.usSex = usSex;
		this.usPhone = usPhone;
		this.bbscards = bbscards;
		this.taskfiles = taskfiles;
		this.bbsreplies = bbsreplies;
		this.scores = scores;
		this.studies = studies;
	}

	// Property accessors

	public String getUsId() {
		return this.usId;
	}

	public void setUsId(String usId) {
		this.usId = usId;
	}

	public String getUsPassword() {
		return this.usPassword;
	}

	public void setUsPassword(String usPassword) {
		this.usPassword = usPassword;
	}

	public String getUsName() {
		return this.usName;
	}

	public void setUsName(String usName) {
		this.usName = usName;
	}

	public String getUsIco() {
		return this.usIco;
	}

	public void setUsIco(String usIco) {
		this.usIco = usIco;
	}

	public String getUsSchool() {
		return this.usSchool;
	}

	public void setUsSchool(String usSchool) {
		this.usSchool = usSchool;
	}

	public String getUsMajor() {
		return this.usMajor;
	}

	public void setUsMajor(String usMajor) {
		this.usMajor = usMajor;
	}

	public Integer getUsSex() {
		return this.usSex;
	}

	public void setUsSex(Integer usSex) {
		this.usSex = usSex;
	}

	public String getUsPhone() {
		return this.usPhone;
	}

	public void setUsPhone(String usPhone) {
		this.usPhone = usPhone;
	}

	public Set getBbscards() {
		return this.bbscards;
	}

	public void setBbscards(Set bbscards) {
		this.bbscards = bbscards;
	}

	public Set getTaskfiles() {
		return this.taskfiles;
	}

	public void setTaskfiles(Set taskfiles) {
		this.taskfiles = taskfiles;
	}

	public Set getBbsreplies() {
		return this.bbsreplies;
	}

	public void setBbsreplies(Set bbsreplies) {
		this.bbsreplies = bbsreplies;
	}

	public Set getScores() {
		return this.scores;
	}

	public void setScores(Set scores) {
		this.scores = scores;
	}

	public Set getStudies() {
		return this.studies;
	}

	public void setStudies(Set studies) {
		this.studies = studies;
	}

}