package com.xcelore.doctor_patient.entity;

import com.xcelore.doctor_patient.enums.Speciality;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is required")
    @Size(min = 3, message = "Name must be at least 3 characters")
    private String name;

    @NotBlank(message = "City is required")
    @Size(max = 20, message = "City must be no more than 20 characters")
    private String city;

    @Email(message = "Email must be valid")
    private String email;

    @NotBlank(message = "Phone number is required")
    @Size(min = 10, message = "Phone number must be at least 10 digits")
    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    private Speciality speciality;

    // ✅ Getters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    // ✅ Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }
}


