package com.revature.project03.repository;

import java.util.*;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.revature.project03.model.Appointment;
import com.revature.project03.model.Patient;


@Repository
@Transactional


public interface ReportsRepository extends JpaRepository<Appointment,Integer>{
	
	@Query("select count(*) from Appointment a where a.applicationDate = ?1 and a.doctor in (?2)")
	long findByDoctorDate(Date dt,int id);	
	
//	@Query(
//			value=("select count(*) from appointment_table a where a.application_date = ?1 and a.doctor_id  ?2)",
//			
//            nativeQuery = true)
//    )
//	long findByDoctorDate(Date dt,int id);
}


//@Query("SELECT e from Employee e where e.employeeName =:name ")       // using @query
//List<Employee> findByName(@Param("name") String name);