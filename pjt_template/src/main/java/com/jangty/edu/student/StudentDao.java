package com.jangty.edu.student;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.dao.DataAccessException;

import com.jangty.edu.student.StudentVo;

/**
 * 로그인아웃 매퍼 인터페이스
 *
 */
@Repository
public class StudentDao {
	
	@Autowired
	protected SqlSessionTemplate sqlSession;
	
	@SuppressWarnings("unchecked")
	public List<StudentVo> getStudentList() throws Exception{
		return sqlSession.selectList("StudentMapper.getStudentList");
	}
	
	public List<StudentVo> getAllStudent() throws Exception{
		return sqlSession.selectList("StudentMapper.getStudentList");
	}
	
}
