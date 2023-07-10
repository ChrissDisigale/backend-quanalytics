package com.chrissdeveloper.patient_visit.controller;

import com.chrissdeveloper.patient_visit.exception.ResourceNotFoundException;
import com.chrissdeveloper.patient_visit.model.Patient;
import com.chrissdeveloper.patient_visit.model.Visits;
import com.chrissdeveloper.patient_visit.repository.PatientRepository;
import com.chrissdeveloper.patient_visit.repository.VisitsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class PatientController {

	@Autowired
	private PatientRepository patientRepository;

	@Autowired
	private VisitsRepository visitsRepository;
	
	// get all patients
	@GetMapping("/patients")
	public List<Patient> getAllpatients(){
		return patientRepository.findAll();
	}		
	
	// create patient rest api
	@PostMapping("/patients")
	public Patient createpatient(@RequestBody Patient patient) {
		return patientRepository.save(patient);
	}

	@PostMapping("/visits")
	public Visits createvisit(@RequestBody Visits visits) {
		return visitsRepository.save(visits);
	}
	
	// get patient by id rest api
	@GetMapping("/patients/{id}")
	public ResponseEntity<Patient> getpatientById(@PathVariable Long id) {
		Patient patient = patientRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("patient not exist with id :" + id));
		return ResponseEntity.ok(patient);
	}

	@GetMapping("/visits/{id}")
	public List<Visits> getvisitByPatientId(@PathVariable int id) {
		List<Visits> visits = visitsRepository.findByPatientId(id);
//				.orElseThrow(() -> new ResourceNotFoundException("patient not exist with id :" + id));
		return visits;
	}
	
	// update patient rest api
	
	@PutMapping("/patients/{id}")
	public ResponseEntity<Patient> updatepatient(@PathVariable Long id, @RequestBody Patient patientDetails){
		Patient patient = patientRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("patient not exist with id :" + id));
		
		patient.setFirstName(patientDetails.getFirstName());
		patient.setLastName(patientDetails.getLastName());
		patient.setDob(patientDetails.getDob());
		patient.setGender(patientDetails.getGender());

		Patient updatedpatient = patientRepository.save(patient);
		return ResponseEntity.ok(updatedpatient);
	}
	
	// delete patient rest api
	@DeleteMapping("/patients/{id}")
	public ResponseEntity<Map<String, Boolean>> deletepatient(@PathVariable Long id){
		Patient patient = patientRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("patient not exist with id :" + id));
		
		patientRepository.delete(patient);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	
	
}
