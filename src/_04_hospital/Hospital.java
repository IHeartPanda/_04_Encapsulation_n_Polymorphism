package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	ArrayList<Doctor> doctorList = new ArrayList<Doctor>();
	ArrayList<Patient> patientList = new ArrayList<Patient>();

	public void addDoctor(GeneralPractitioner generalPractitioner) {
		// TODO Auto-generated method stub
		doctorList.add(generalPractitioner);
	}

	public void addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		doctorList.add(doctor);
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
		System.out.println("Hi");
		int whichDoctor = 0;
		int numOfPatients = 0;
		// TODO Auto-generated method stub
		for (int i = 0; i < doctorList.size(); i++) {
			try {
				for (int j = numOfPatients; j < patientList.size(); j++) {
					doctorList.get(whichDoctor).assignPatient(patientList.get(i));
					numOfPatients++;
				}
			} catch (Exception e) {
				whichDoctor++;
			}
		}

		System.out.println(doctorList.get(0).getPatients().size());
	}

}
