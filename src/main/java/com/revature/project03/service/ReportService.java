//package com.revature.project03.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.revature.project03.dto.ReportDto;
//import com.revature.project03.repository.ReportsRepository;
//
//@Service
//public class ReportService {
//	@Autowired
//	private ReportsRepository  repository;
//	//@Autowired
//	//private ReportDto report;
//	public long countPatient(ReportDto report) {
//		
//		
//		return repository.findByDoctorDate(report.getDate(),report.getDoctorId());
//	}
//
//}

//@Query("SELECT e from Employee e where e.employeeName =:name ")       // using @query
//List<Employee> findByName(@Param("name") String name);