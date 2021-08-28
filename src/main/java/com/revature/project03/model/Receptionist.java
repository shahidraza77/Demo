package com.revature.project03.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Receptionist_table")
public class Receptionist {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int rId;
	//@Column(name="rName")
	//@NotBlank(message = "name should not be null")
	private String rName;
	//@Column(name="rPassword")
	//@NotBlank(message = "Password should not be null")
	private String rPassword;
	//@Column(name="rPhnNo")
	//@NotBlank(message = "PhoneNo should not be null")
	private long rPhnNo;
	//@Column(name="rEmail")
	//@NotBlank(message = "Email should not be null")
	private String rEmail;
	
	@OneToMany(cascade= CascadeType.ALL,mappedBy="recep")
	private List<Reports> report= new ArrayList<>(); 
	
	@OneToMany(cascade= CascadeType.ALL,mappedBy="receptionist")
	private List<Appointment>appointments=new ArrayList<>();
	
//	@OneToMany(cascade= CascadeType.ALL)
//	private List<Doctor>doctors=new ArrayList<>();
		
}
