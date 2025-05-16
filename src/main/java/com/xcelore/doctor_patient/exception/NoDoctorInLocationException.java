package com.xcelore.doctor_patient.exception;

public class NoDoctorInLocationException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoDoctorInLocationException(String message) {
        super(message);
    }
}
