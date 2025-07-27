package com.yashveer.hospitalManagement.repository;

import com.yashveer.hospitalManagement.entity.Patient;
import com.yashveer.hospitalManagement.entity.type.BloodGroupType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface PatientRepository extends JpaRepository<Patient,Long> {
    Patient findByName(String name);


    List<Patient> findByNameContainingOrderByIdDesc(String query);

    @Query("select p from Patient p where p.bloodGroup = ?1")
    List<Patient> findByBloodGroup(@Param("bloodGroup") BloodGroupType bloodGroupType);
}
