package com.jangty.edu.attendance;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jangty.edu.common.ResponseVo;
/**
 * Handles requests for the application home page.
 */
@Controller
public class AttendanceController {
	
	private static final Logger logger = LoggerFactory.getLogger(AttendanceController.class);
	
//	@Autowired
//	private StudentService studentService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/attendance", method = RequestMethod.GET)
	public ModelAndView getAttendanceList(HttpServletRequest request, HttpServletResponse response) {
		logger.info("Log : AttendanceController.getAttendanceList");
		
		ResponseVo resVo = new ResponseVo();
//		List<StudentVo> list = ;
//		resVo.setResList();
//		return resVo;
//		mv.addObject("list", studentService.getStudentList());
//		mv.setViewName("home");
//		return mv;
//		ModelAndView mav = new ModelAndView("_publishing/index.html");
		ModelAndView mav = new ModelAndView("attendance/attendance");
		
//		mav.addAllObjects((HashMap)request.getAttribute("jsonModel"));
		
		return mav;
	}
	
}
