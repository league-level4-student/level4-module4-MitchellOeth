package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	
	ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	ArrayList<Patient> patients = new ArrayList<Patient>();
	
	public void addDoctor(Doctor doctor) {
		doctors.add(doctor);
	}

	public void addPatient(Patient patient) {
		patients.add(patient);
	}

	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}

	public ArrayList<Patient> getPatients() {
		return patients;
	}

	public void assignPatientsToDoctors() {
		for(int i = 0; i < patients.size(); i++) {
			if (doctors.get(i%3).doctorsPatients.size() < 2) {
				doctors.get(i%3).addPatient(patients.get(i));
			}
		}
	}
}
