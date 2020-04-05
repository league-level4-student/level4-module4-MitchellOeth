package _04_hospital;

import java.util.ArrayList;

public class GeneralPractitioner extends Doctor{
	ArrayList<Patient> generalPractitionersPatients;
	
	GeneralPractitioner() {
		generalPractitionersPatients = new ArrayList<Patient>(3);
	}
	public boolean performsSurgery() {
		return false;	
	}
	
	public boolean makesHouseCalls() {
		return true;
	}
	
	public void assignPatient(Patient patient) {
		generalPractitionersPatients.add(patient);
	}
	
	public ArrayList<Patient> getPatients() {
		return generalPractitionersPatients;
	}
	
	public void doMedicine() {
		for(int i = 0; i < generalPractitionersPatients.size(); i++) {
			generalPractitionersPatients.get(i).checkPulse();
		}	
	}
}
