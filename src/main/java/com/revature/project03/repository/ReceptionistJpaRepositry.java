package com.revature.project03.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.revature.project03.model.Receptionist;

@Repository
public interface ReceptionistJpaRepositry extends JpaRepository<Receptionist,Integer>{
	
	Receptionist findByrEmail(String rEmail);
}

