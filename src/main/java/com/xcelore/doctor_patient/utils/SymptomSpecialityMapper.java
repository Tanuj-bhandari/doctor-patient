package com.xcelore.doctor_patient.utils;

import com.xcelore.doctor_patient.enums.Speciality;
import com.xcelore.doctor_patient.enums.Symptom;

public class SymptomSpecialityMapper {

    public static Speciality getSpecialityFromSymptom(Symptom symptom) {
        return switch (symptom) {
            case ARTHRITIS, BACK_PAIN, TISSUE_INJURIES -> Speciality.ORTHOPAEDIC;
            case DYSMENORRHEA -> Speciality.GYNECOLOGY;
            case SKIN_INFECTION, SKIN_BURN -> Speciality.DERMATOLOGY;
            case EAR_PAIN -> Speciality.ENT;
        };
    }
}
