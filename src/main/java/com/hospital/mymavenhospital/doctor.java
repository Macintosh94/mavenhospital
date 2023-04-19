package com.hospital.mymavenhospital;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class doctor {
 
	@Id
	private int doctorId;

	private String doctorName;
	
	public doctor(int doctorid, String doctorName) {
		this.doctorId=doctorid;
		this.doctorName=doctorName;
	}
	

	@SuppressWarnings("unused")
	private doctor() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
}
