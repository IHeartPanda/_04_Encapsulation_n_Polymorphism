package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class GeneralPractitioner extends Doctor{

	public Object makesHouseCalls() {
		// TODO Auto-generated method stub
		return true;
	}

	public void assignPatient(Patient patient) {
		patientList.add(patient);		
	}

	public ArrayList<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patientList;
	}

}
