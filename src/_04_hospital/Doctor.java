package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
	ArrayList<Patient> patientList = new ArrayList<Patient>();
	Boolean medicine = false;
	public Object performsSurgery() {
		
		// TODO Auto-generated method stub
		
		return false;
	}

	public Object makesHouseCalls() {
		// TODO Auto-generated method stub
		return false;
	}

	public void assignPatient(Patient max) throws DoctorFullException{
		// TODO Auto-generated method stub
		if(patientList.size()<3) {
		patientList.add(max);
		}
		else {
			throw new DoctorFullException();
		}
	}

	public void doMedicine() {
		// TODO Auto-generated method stub
		for (int i = 0; i < patientList.size(); i++) {
			patientList.get(i).setCaredFor(true);
		}
	}

	public ArrayList<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patientList;
	}

}
