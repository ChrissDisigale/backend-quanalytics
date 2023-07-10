package com.chrissdeveloper.patient_visit.repository;

import com.chrissdeveloper.patient_visit.model.Visits;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VisitsRepository extends JpaRepository<Visits, Long>{

    List<Visits> findByPatientId(int patientId);
}
