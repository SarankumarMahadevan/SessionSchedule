package com.cg.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.bean.ScheduledSessions;
import com.cg.dao.ITrainingDAo;
;
@Component(value="ITrainingService")
public class TrainingServiceImpl implements ITrainingService{
	
	@Autowired
	private ITrainingDAo  daoServices;
	
	
	
	@Transactional
	@Override
	public List<ScheduledSessions> getdetails() {
	
		List<ScheduledSessions> clist= daoServices.findAll();  //fetching the details
		return clist;
	}
	@Transactional
	@Override
	public ScheduledSessions updatedetails(ScheduledSessions course) {
		
		course= daoServices.save(course);
		return course;
	}

	
}
