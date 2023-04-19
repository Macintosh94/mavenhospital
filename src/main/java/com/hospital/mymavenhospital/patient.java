package com.hospital.mymavenhospital;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class patient {
	
	@Id
	private int patientid;
	
	private String patientName;
	
	public patient(int patientid, String patientName) {
		this.patientid=patientid;
		this.patientName=patientName;
		
	}

	@SuppressWarnings("unused")
	private patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPatientid() {
		return patientid;
	}

	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	
}
