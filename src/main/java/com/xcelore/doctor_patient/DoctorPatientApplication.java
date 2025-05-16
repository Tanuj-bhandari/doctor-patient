package com.xcelore.doctor_patient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.xcelore.doctor_patient")
public class DoctorPatientApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoctorPatientApplication.class, args);
	}
}