package com.yashveer.hospitalManagement;

import com.yashveer.hospitalManagement.entity.Patient;
import com.yashveer.hospitalManagement.repository.PatientRepository;
import com.yashveer.hospitalManagement.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PatientTests {
    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private PatientService patientService;
    @Test
    public void testPatientRepository(){
        List<Patient> patientList = patientRepository.findAll();
        System.out.println(patientList);
    }

    @Test
    public void testTransactionMethods(){
        Patient patient  = patientService.getPatientById(1L);
        System.out.println(patient);
    }
}
