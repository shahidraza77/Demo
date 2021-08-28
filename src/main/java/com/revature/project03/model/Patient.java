package com.revature.project03.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "Patient")
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int p_id;
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private int age;
	private String gender;
	private String mobileNo;
	private String address;
	private String email_id;
	private Date date;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy = "patient")
	private List<Appointment>appointments =new ArrayList<>();

	
	
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy = "patient")
	private List<Family> members=new ArrayList<>();


	
}