package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.bean.ScheduledSessions;

public interface ITrainingDAo extends JpaRepository<ScheduledSessions, Integer> {

}
