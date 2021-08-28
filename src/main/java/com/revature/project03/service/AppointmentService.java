package com.revature.project03.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.project03.model.Appointment;
import com.revature.project03.repository.AppointmentRepo;
import java.util.*;
@Service
public class AppointmentService {
	
	@Autowired
	private AppointmentRepo repo;
	
	public List<Appointment> findRecordsBydate(Date date)
	{
		return  repo.findAllByApplicationDate(date);
		
	}
	
	

}
