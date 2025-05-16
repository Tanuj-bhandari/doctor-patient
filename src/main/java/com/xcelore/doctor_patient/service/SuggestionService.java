package com.xcelore.doctor_patient.service;

import com.xcelore.doctor_patient.entity.Doctor;
import com.xcelore.doctor_patient.entity.Patient;
import com.xcelore.doctor_patient.enums.Speciality;
import com.xcelore.doctor_patient.exception.NoDoctorForSymptomException;
import com.xcelore.doctor_patient.exception.NoDoctorInLocationException;
import com.xcelore.doctor_patient.repository.DoctorRepository;
import com.xcelore.doctor_patient.utils.SymptomSpecialityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuggestionService {

    @Autowired
    private PatientService patientService;

    @Autowired
    private DoctorRepository doctorRepository;

    public List<Doctor> suggestDoctors(Long patientId) {
        Patient patient = patientService.getPatientById(patientId);
        String city = patient.getCity();

        // Edge-case 1: Unsupported city
        if (!List.of("Delhi", "Noida", "Faridabad").contains(city)) {
            throw new NoDoctorInLocationException("We are still waiting to expand to your location");
        }

        Speciality speciality = SymptomSpecialityMapper.getSpecialityFromSymptom(patient.getSymptom());

        List<Doctor> doctors = doctorRepository.findByCityAndSpeciality(city, speciality);

        // Edge-case 2: No doctor for symptom in the city
        if (doctors.isEmpty()) {
            throw new NoDoctorForSymptomException("There isn’t any doctor present at your location for your symptom");
        }

        return doctors;
    }
}
