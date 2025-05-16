package com.xcelore.doctor_patient.controller;

import com.xcelore.doctor_patient.entity.Doctor;
import com.xcelore.doctor_patient.service.SuggestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/suggestions")
public class SuggestionController {

    @Autowired
    private SuggestionService suggestionService;

    @GetMapping("/{patientId}")
    public List<Doctor> suggestDoctors(@PathVariable Long patientId) {
        return suggestionService.suggestDoctors(patientId);
    }
}
