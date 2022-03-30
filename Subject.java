package com.collegevalidation;

public class Subject {
	int subId;
	String subName;
	int mark;
	String result;
	public int getSubId() {
		return subId;
	}
	public void setSubId(int subId) {
		this.subId = subId;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "Subject [subId=" + subId + ", subName=" + subName + ", mark=" + mark + ", result=" + result + "]";
	}
	

}
