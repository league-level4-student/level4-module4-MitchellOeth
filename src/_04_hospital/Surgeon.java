package _04_hospital;

import java.util.ArrayList;

public class Surgeon extends Doctor{
	
	ArrayList<Patient> surgeonsPatients;
	
	Surgeon(){
		surgeonsPatients = new ArrayList<Patient>(3);
	}
	public boolean performsSurgery() {
		return true;
	}
	public boolean makesHouseCalls() {
		return false;
	}
	
	public void assignPatient(Patient patient) {
		surgeonsPatients.add(patient);
	}
	
	public ArrayList<Patient> getPatients() {
		return surgeonsPatients;
	}
	
	public void doMedicine() {
		
	}
}
