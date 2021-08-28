package com.revature.project03.controller;

import org.springframework.beans.factory.annotation.Autowired;

import java.text.ParseException;
import java.text.SimpleDateFormat;  
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.revature.project03.model.Appointment;
import com.revature.project03.model.DateMain;
import com.revature.project03.model.Patient;
import com.revature.project03.model.Receptionist;
import com.revature.project03.service.AppointmentService;

import java.util.*;

@RestController
@CrossOrigin(origins = "*")
public class ReportsController {
//	@Autowired
//    private ReportService service;
//	@Autowired
//	private ReportDto report;
	
	@Autowired
    private AppointmentService appointmentService;
	
	//@GetMapping("/GeneratingReports")
	// public long totalPatients() {
		//report.getDate()
		//String sDate3 = "12 31, 1998";  
		//Date.parse(sDate3)
		//SimpleDateFormat formatter3=new SimpleDateFormat("MM dd, yyyy");  
		//Date date3=report.setDate(Date.parse(sDate3)); 
		//report.setDate(java.util.Date);
//		String sDate1="31/12/1998";
//		Date date1=null;
//	    try {
//			 date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}  
		
		//report.setDoctorId(1);
//		report.setDate(Date sDate3);
		
//		 long count= service.countPatient(report);
//		 System.out.println(count);
//		return count;
	//}
		@PostMapping("/recordsbydate")
		public List<Appointment> recordReport(@RequestBody DateMain date)
		{
			
			return appointmentService.findRecordsBydate(date.getDate());
		}
		
		

	

}


//@Query("SELECT e from Employee e where e.employeeName =:name ")       // using @query
//List<Employee> findByName(@Param("name") String name);