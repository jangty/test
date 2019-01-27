package com.jangty.edu.student;

import java.util.List;

import com.jangty.edu.common.ResponseVo;

public interface StudentService {
	
	public List<StudentVo> getStudentList() throws Exception;
	public ResponseVo getStudentListTest() throws Exception;
}
