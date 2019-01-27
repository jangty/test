package com.jangty.edu.student;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.jangty.edu.common.ResponseVo;

@Service("StudentService")
public class StudentServiceImpl implements StudentService {
	
	private static final Logger logger = LoggerFactory.getLogger(StudentService.class);
	
	@Autowired
	protected StudentDao dao;
	
	@Override
	public List<StudentVo> getStudentList() throws Exception {
//		ResponseVo responseVo =  new ResponseVo();
//		try{
//			responseVo =  new ResponseVo("0", "student.INFO_SUCCESE");
//			List<StudentVo> list = mapper.getStudentList();
//			responseVo.setResList(list);
//		} catch (Exception e){
//			responseVo =  new ResponseVo("1", "student.INFO_ERROR");
//		}
		return dao.getStudentList();
	}
	
	@Override
	public ResponseVo getStudentListTest() {
		ResponseVo responseVo = new ResponseVo();
//		List<StudentVo> list = dao.getStudentList();
		
		return responseVo;
	}
	
}
