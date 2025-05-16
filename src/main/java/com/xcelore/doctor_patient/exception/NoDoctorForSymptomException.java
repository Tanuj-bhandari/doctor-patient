package com.xcelore.doctor_patient.exception;

public class NoDoctorForSymptomException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoDoctorForSymptomException(String message) {
        super(message);
    }
}
