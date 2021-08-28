package com.revature.project03.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.revature.project03.model.Receptionist;
import com.revature.project03.repository.ReceptionistJpaRepositry;



@Service
public class ReceptionistService {
	@Autowired
    private ReceptionistJpaRepositry repository;
	@Autowired
	private EmailService emailService;

	public Receptionist saveReceptionist(Receptionist recep) {
		String message = "hi, your login details are, UserName:  "+recep.getREmail()+"  Password:  "+recep.getRPassword();
    	emailService.sendSimpleEmail(recep.getREmail(), message, "your login credentials");
		
		return repository.save(recep);
		
	}

	public Receptionist getReceptionistByEmail(String rEmail) {
		return repository.findByrEmail(rEmail);
	
	}
	
	
}




