package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.bean.ScheduledSessions;
import com.cg.services.ITrainingService;

@Controller
public class TrainingController {
	@Autowired(required = true)
	ITrainingService service;

	@RequestMapping("/")             //calling the getdetails page
	public ModelAndView getIndexPage() {

		List<ScheduledSessions> clist = service.getdetails();
		ModelAndView modelAndView = new ModelAndView("schedulersessions", "courses", clist);
		return modelAndView;
	}

	@RequestMapping("/update")     //returning to successpage
	public String getPage() {
		return "Success";
	}

	/*
	 * @RequestMapping(value="/update") public ModelAndView
	 * getUpdate(@ModelAttribute("course") ScheduledSessions course) { course
	 * =service.updatedetails(course); ModelAndView modelAndView = new
	 * ModelAndView("Success", "course", course); return modelAndView;
	 * 
	 * }
	 */

	@ModelAttribute("courses")
	public ScheduledSessions getCourse() {
		return new ScheduledSessions();
	}

}
