package com.yashveer.hospitalManagement.repository;

import com.yashveer.hospitalManagement.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface PatientRepository extends JpaRepository<Patient,Long> {
}
