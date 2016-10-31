package com.jingpinke.model;

public class Page {
private  int totalPage;
private int pageSize;//
private int totalRecord;//
private int currentPage;//
private int startIndex;
private int endIndex;
/**
 * 每页条数，总记录，当前页
 * */
public Page(int pageSize, int totalRecord, int currentPage) {
	super();
	
	this.pageSize = pageSize;
	this.totalRecord = totalRecord;
	this.currentPage=currentPage;

}
@Override
public String toString() {
	return "Page [totalPage=" + totalPage + ", pageSize=" + pageSize
			+ ", totalRecord=" + totalRecord + ", currentPage=" + currentPage
			+ ", startIndex=" + startIndex + ", endIndex=" + endIndex + "]";
}
public int getTotalPage() {
	return totalPage;
}
public void setTotalPage(int totalPage) {

	this.totalPage = totalPage;
}
public int getPageSize() {
	return pageSize;
}
public void setPageSize(int pageSize) {
	this.pageSize = pageSize;
}
public int getTotalRecord() {

	return totalRecord;
}
public void setTotalRecord(int totalRecord) {
	if(totalRecord%pageSize==0){
		this.totalPage=totalRecord/pageSize;
	}else{
		this.totalPage=(totalRecord/pageSize)+1;
	}
	this.totalRecord = totalRecord;
}
public int getCurrentPage() {
	this.currentPage = currentPage>this.totalPage?this.totalPage:currentPage;
	return currentPage;
}
public void setCurrentPage(int currentPage) {
	this.currentPage = currentPage;
}
public int getStartIndex() {
	this.startIndex=((this.currentPage-1)*pageSize);
	if(startIndex>totalRecord){
		startIndex=totalRecord;
	}
	if(startIndex<0){
		startIndex=0;
	}
	return startIndex;
}
public void setStartIndex(int startIndex) {
	this.startIndex = startIndex;
}
public int getEndIndex() {
	this.endIndex=(this.currentPage*pageSize)>this.totalRecord?this.totalRecord:(this.currentPage*pageSize);
	return endIndex;
}
public void setEndIndex(int endIndex) {
	this.endIndex = endIndex;
}
}
