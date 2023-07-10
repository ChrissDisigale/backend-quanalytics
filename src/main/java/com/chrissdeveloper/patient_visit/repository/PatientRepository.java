package com.chrissdeveloper.patient_visit.repository;

import com.chrissdeveloper.patient_visit.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long>{

}
