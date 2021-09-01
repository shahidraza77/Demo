package com.revature.project03.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.project03.model.Appointment;
import com.revature.project03.repository.AppointmentRepo;
import java.util.List;
import java.sql.Date;
@Service
public class AppointmentService {
	
	@Autowired
	private AppointmentRepo repo;
	
	public List<Appointment> findRecordsBydate(Date date)
	{
		return  repo.findAllByApplicationDate(date);

		
	}
	public Appointment saveAppointment(Appointment appointment)
	{
		return repo.save(appointment);
	}
	
	

}
