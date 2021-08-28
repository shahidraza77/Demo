package com.revature.project03.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.project03.dto.ReceptionistDto;

import com.revature.project03.model.Receptionist;
import com.revature.project03.service.ReceptionistService;






@RestController
@CrossOrigin(origins = "*")
public class ReceptionistController {
	
	@Autowired
    private ReceptionistService service;
	
	
	 @PostMapping("/addReceptionist")
	    public Receptionist addReceptionist(@RequestBody Receptionist recep) {
		 	
	        return service.saveReceptionist(recep);
	    }
	 @PostMapping("/rlogin")
	 public Receptionist rLogin(@RequestBody ReceptionistDto recepLogin) {
		    	Receptionist curr_Recep = service.getReceptionistByEmail(recepLogin.getREmail());
		    	System.out.println(curr_Recep);
		    	String enteredPass = recepLogin.getRPassword();
		    	System.out.println(enteredPass);
		    	String recepPass = curr_Recep.getRPassword();
		    	System.out.println(recepPass);
		    	if(enteredPass.equals(recepPass)) {
		    		System.out.println("if loop entered");
		    		return service.getReceptionistByEmail(curr_Recep.getREmail());
		    	}
		    	else {
		    		return null;
		    	} 
		 
		 
	 }
}
