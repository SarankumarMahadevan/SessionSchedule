package com.cg.services;

import java.util.List;

import com.cg.bean.ScheduledSessions;

public interface ITrainingService {
	public List<ScheduledSessions> getdetails();
	public ScheduledSessions updatedetails(ScheduledSessions course);
}
