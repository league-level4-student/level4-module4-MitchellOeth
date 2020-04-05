package _04_hospital;

import java.util.ArrayList;

public class Doctor extends Hospital{
	
	ArrayList<GeneralPractitioner> generalPractitioners;
	ArrayList<Surgeon> surgeons;
	ArrayList<Patient> doctorsPatients;
	
	Doctor() {
		generalPractitioners = new ArrayList<GeneralPractitioner>();
		surgeons = new ArrayList<Surgeon>();
		doctorsPatients = new ArrayList<Patient>(3);
	}
	
	public boolean performsSurgery() {
		return false;
	}

	public boolean makesHouseCalls() {
		return false;
	}

	public void assignPatient(Patient patient) {
		doctorsPatients.add(patient);
	}
	
	public ArrayList<Patient> getPatients() {
		return doctorsPatients;
	}

	public void doMedicine() {
			
	}
}
