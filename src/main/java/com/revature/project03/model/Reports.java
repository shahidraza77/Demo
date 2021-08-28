package com.revature.project03.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Reports_table")
public class Reports {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int reportId;
	//@Column(name="reportDate")
	private Date reportDate;
	//@Column(name="totalFees")
	private double totalFees;
	//@Column(name="totalPatient")
	private int totalPatient;
	@ManyToOne
	@JoinColumn(name = "rId")
	private Receptionist recep;
	
}
