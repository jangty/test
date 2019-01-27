package com.jangty.edu.student;

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
@RequestMapping(value = "/student")
public class StudentController {
	
	private static final Logger logger = LoggerFactory.getLogger(StudentController.class);
	
	@Autowired
	private StudentService studentService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView getStudent(HttpServletRequest request, HttpServletResponse response) {
		logger.info("Log : StudentController.getStudentList");
		
		ResponseVo resVo = new ResponseVo();
//		List<StudentVo> list = ;
//		resVo.setResList();
//		return resVo;
//		mv.addObject("list", studentService.getStudentList());
//		mv.setViewName("home");
//		return mv;
//		ModelAndView mav = new ModelAndView("_publishing/index.html");
		ModelAndView mav = new ModelAndView("student/student");
//		mav.addObject("list", (List)studentService.getStudentList());
//		mav.addAllObjects((HashMap)request.getAttribute("jsonModel"));
		
		return mav;
	}
	
	@RequestMapping(value = "/getList", method = RequestMethod.GET)
	public ResponseVo getStudentList(Model model) {
		logger.info("Log : StudentController.getStudentList");
		
		ResponseVo resVo = new ResponseVo();
//		List<StudentVo> list = ;
//		resVo.setResList();
//		return resVo;
//		mv.addObject("list", studentService.getStudentList());
//		mv.setViewName("home");
//		return mv;
//		ModelAndView mav = new ModelAndView("_publishing/index.html");
		ModelAndView mav = new ModelAndView("student/student");
//		mav.addObject("list", (List)studentService.getStudentList());
//		mav.addAllObjects((HashMap)request.getAttribute("jsonModel"));
//		List<StudentVo> list = studentService.getStudentList();
		
//		model.addAttribute("list", studentService.getStudentList());
		
//		ResponseVo resVo = studentService.getStudentListTest();
		
		return resVo;
	}
	
//	@RequestMapping(value = "/setup/getSetting")
//	public @ResponseBody Object getSettingProcess(Locale locale, Model model, HttpSession session, HttpServletRequest request) throws Exception {
//		//로그인 후 가능
//		if(!CommonUtil.checkSession(session)) return "redirect:/";
//		// String searchType    = ServletRequestUtils.getStringParameter(request, "searchType" , "");
//
//		ResponseVo responseVo = setupService.getSettingService();
//		return responseVo;
//	}
}
