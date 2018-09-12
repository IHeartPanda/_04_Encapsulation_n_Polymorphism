package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Surgeon extends Doctor {
	public Object performsSurgery() {
		return true;
	}
	public Object makesHouseCalls() {
		// TODO Auto-generated method stub
		return false;
	}

	public void assignPatient(Patient max) throws DoctorFullException{
		// TODO Auto-generated method stub
		
	}

	public void doMedicine() {
		// TODO Auto-generated method stub
		
	}

	public ArrayList<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patientList;
	}
}
