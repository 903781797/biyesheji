package com.jingpinke.entity;

/**
 * Taskfile entity. @author MyEclipse Persistence Tools
 */

public class Taskfile implements java.io.Serializable {

	// Fields

	private Integer tfId;
	private User user;
	private Task task;
	private String tfSrc;

	// Constructors

	/** default constructor */
	public Taskfile() {
	}

	/** full constructor */
	public Taskfile(User user, Task task, String tfSrc) {
		this.user = user;
		this.task = task;
		this.tfSrc = tfSrc;
	}

	// Property accessors

	public Integer getTfId() {
		return this.tfId;
	}

	public void setTfId(Integer tfId) {
		this.tfId = tfId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Task getTask() {
		return this.task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	public String getTfSrc() {
		return this.tfSrc;
	}

	public void setTfSrc(String tfSrc) {
		this.tfSrc = tfSrc;
	}

}