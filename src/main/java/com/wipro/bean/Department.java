package com.wipro.bean;
import javax.persistence.*;

public class Department {
	private int deptno;
	private String deptName;
	private String location;
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Department(int deptno, String deptName, String location) {
		super();
		this.deptno = deptno;
		this.deptName = deptName;
		this.location = location;
	}
	public Department() {
		super();
	}
	@Override
	public String toString() {
		return "Department [deptno=" + deptno + ", deptName=" + deptName + ", location=" + location + "]";
	}
 
}
