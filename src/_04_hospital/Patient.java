package _04_hospital;

public class Patient {
	Boolean careFor = false;
	public Object feelsCaredFor() {
		// TODO Auto-generated method stub
		return careFor;
	}

	public void checkPulse() {
		// TODO Auto-generated method stub
		careFor = true;
	}
	public void setCaredFor(Boolean b) {
		careFor = (b);
	}
}
