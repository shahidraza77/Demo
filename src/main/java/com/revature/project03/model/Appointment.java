package com.revature.project03.model;



import static javax.persistence.GenerationType.IDENTITY;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Appointment_table")
public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int applicationId;
	//@OneToMany(cascade= CascadeType.ALL,mappedBy="patient")
	
	@ManyToOne
	@JoinColumn(name="p_Id")
	//@Column(name="patient")
	private Patient patient;
	
//	@OneToMany(cascade= CascadeType.ALL,mappedBy="doctor")
	
	@ManyToOne
	@JoinColumn(name="doctorId")
	//@Column(name="doctor")
	private Doctor doctor;
	
	//@Column(name="applicationDate")
	private Date applicationDate;
	
	//@Column(name="purpose")
	private String purpose;
	
	//@Column(name="availability")
	private String availability;
	
//	@ManyToMany
//	@Column(name="family")
//	private List<Family> family=new ArrayList<Family>();
	
	@ManyToOne
	@JoinColumn(name = "rId")
	private Receptionist receptionist;
	
	
}
