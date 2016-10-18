package com.jingpinke.entity2;

import java.util.HashSet;
import java.util.Set;

public class CourseType {
private int ct_id;
private String  ct_name;
private String ct_desc;
private Set courses = new HashSet();
public int getCt_id() {
	return ct_id;
}
public void setCt_id(int ct_id) {
	this.ct_id = ct_id;
}
public String getCt_name() {
	return ct_name;
}
public void setCt_name(String ct_name) {
	this.ct_name = ct_name;
}
public String getCt_desc() {
	return ct_desc;
}
public void setCt_desc(String ct_desc) {
	this.ct_desc = ct_desc;
}
public Set getCourses() {
	return courses;
}
public void setCourses(Set courses) {
	this.courses = courses;
}
}
