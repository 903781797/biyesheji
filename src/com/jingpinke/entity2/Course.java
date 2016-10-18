package com.jingpinke.entity2;

import java.sql.Timestamp;

public class Course {
private int co_id;
private String co_name;
private String co_desc;
private String co_known;
private String co_introduct;
private String co_img;
private int co_isplay;
private int  co_recommend;//是否推荐
private Timestamp co_date;
private int rank;//推荐等级
private CourseType courseType ;

public int getCo_id() {
	return co_id;
}
public void setCo_id(int co_id) {
	this.co_id = co_id;
}
public void setCo_Id(int co_Id) {
	this.co_id = co_Id;
}
public String getCo_name() {
	return co_name;
}
public void setCo_name(String co_name) {
	this.co_name = co_name;
}
public String getCo_desc() {
	return co_desc;
}
public void setCo_desc(String co_desc) {
	this.co_desc = co_desc;
}
public String getCo_known() {
	return co_known;
}
public void setCo_known(String co_known) {
	this.co_known = co_known;
}
public String getCo_introduct() {
	return co_introduct;
}
public void setCo_introduct(String co_introduct) {
	this.co_introduct = co_introduct;
}
public String getCo_img() {
	return co_img;
}
public void setCo_img(String co_img) {
	this.co_img = co_img;
}
public int getCo_isplay() {
	return co_isplay;
}
public void setCo_isplay(int co_isplay) {
	this.co_isplay = co_isplay;
}
public int getCo_recommend() {
	return co_recommend;
}
public void setCo_recommend(int co_recommend) {
	this.co_recommend = co_recommend;
}
public Timestamp getCo_date() {
	return co_date;
}
public void setCo_date(Timestamp co_date) {
	this.co_date = co_date;
}
public int getRank() {
	return rank;
}
public void setRank(int rank) {
	this.rank = rank;
}
public CourseType getCourseType() {
	return courseType;
}
public void setCourseType(CourseType courseType) {
	this.courseType = courseType;
}
}
