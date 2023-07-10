package com.chrissdeveloper.patient_visit.model;

import jakarta.persistence.*;

@Entity
@Table(name = "patients")
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "firstName")
	private String firstName;

	@Column(name = "lastName")
	private String lastName;
	
	@Column(name = "dob")
	private String dob;

	@Column(name = "gender")
	private String gender;
	
	public Patient() {
		
	}
	
	public Patient(String firstName, String lastName, String dob, String gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.gender = gender;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
