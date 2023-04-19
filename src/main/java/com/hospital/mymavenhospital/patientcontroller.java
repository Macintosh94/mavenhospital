package com.hospital.mymavenhospital;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class patientcontroller {

	@Autowired
	PatientRepository patRepository;
		    
	@PostMapping ("/registerPatient")
	public patient registerPatient (@RequestBody patient pat) {
		return patRepository.save(pat);	
		
	}

   @GetMapping ("/getPatientDetails/{patientid}")
  public patient getPatientDetails(@PathVariable(value="patientid")int patientid) {
	  return patRepository.findById(patientid).get(); 
  
  }
   
   @GetMapping ("/getAllPatientList")
   public patient getAllPatientList() {   
	   List<patient> Patient = new ArrayList<patient>();
	   patRepository.findAll().forEach(patient -> Patient.add(patient));
	   return (patient) Patient;
   }
   
}
	
