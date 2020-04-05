package _04_hospital;

public class Patient extends Hospital{

	boolean feelsCaredFor = false;
	
	public Object feelsCaredFor() {
		return feelsCaredFor;
	}

	public void checkPulse() {
		feelsCaredFor = true;
	}
	
}
