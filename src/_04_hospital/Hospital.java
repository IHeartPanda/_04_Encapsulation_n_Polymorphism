package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	ArrayList<Doctor> doctorList= new ArrayList<Doctor>(); 
	ArrayList<Patient> patientList = new ArrayList<Patient>();
	public void addDoctor(GeneralPractitioner generalPractitioner) {
		// TODO Auto-generated method stub
		doctorList.add(generalPractitioner);
	}

	public void addDoctor(Surgeon generalPractitioner) {
		// TODO Auto-generated method stub
		doctorList.add(generalPractitioner);
	}

	public List<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		return doctorList;
	}

	public void addPatient(Patient patient) {
		// TODO Auto-generated method stub
		patientList.add(patient);
	}

	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patientList;
	}

	public void assignPatientsToDoctors() {
		// TODO Auto-generated method stub
		
	}

	


}
