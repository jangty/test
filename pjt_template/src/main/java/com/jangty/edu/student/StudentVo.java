package com.jangty.edu.student;

import java.io.Serializable;

/**
 * @author JangTY
 * @desc 테스트용임.
 */
public class StudentVo implements Serializable {
	private int studentId;
	private int academyId;
	private String StudentName       = "";
	private String regDate   = "";
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getAcademyId() {
		return academyId;
	}
	public void setAcademyId(int academyId) {
		this.academyId = academyId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	
	
}