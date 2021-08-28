package com.revature.project03.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.project03.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Integer> {

}