package com.revature.project03.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.project03.model.Appointment;

import java.util.*;

public interface AppointmentRepo extends JpaRepository<Appointment, Integer> {
	
	List<Appointment> findAllByApplicationDate(Date date);

}
