package com.kh.onairstudy.scheduler.model.dao;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import com.kh.onairstudy.scheduler.model.vo.Scheduler;

public interface SchedulerDAO {

	List<Scheduler> mainScheduler(Map<String, Object> map);

	int insertSchedule(Scheduler sch);

	int deleteSchedule(int no);

	Scheduler selectOne(int no);

	int updateSchedule(Scheduler sch);

	int insertTodo(Scheduler sch);

	int deleteTodo(Map<String, Object> map);

	List<Scheduler> selectToDoList(String memberId);
	
	Scheduler dDaySearch(Map<String, Object> map);



}
