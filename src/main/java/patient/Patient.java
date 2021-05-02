
package patient;

import java.util.ArrayList;
import java.util.HashMap;

public class Patient {
	public static HashMap<Integer, Patient> db = new HashMap<Integer, Patient>() {
		/**
		* 
		*/
		private static final long serialVersionUID = 2867676283276213971L;

		{
			put(1, new Patient(1, "Bob", 2));
			put(2, new Patient(2, "Alice", 5));
			put(5, new Patient(5, "Trevor", 1));
			put(10, new Patient(10, "Mary", 2));
			put(4, new Patient(4, "Chris", 2));
		}
	};

	private int id;
	private String name;
	private int riskLevel;
	private int bpm;

	// default object is created for the Patient class
	public Patient() {
	}

	// Parameterised Constructor
	public Patient(int id, String name, int riskLevel) {

		this.id = id;
		this.name = name;
		this.riskLevel = riskLevel;
	}

	// Getters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getRiskLevel() {
		return riskLevel;
	}

	public int getBpm() {
		return bpm;
	}

	public static Patient getPatient(int id) {
		return db.get(id);
	}

	public static void main(String[] args) throws Exception {
		for (Patient patient : db.values()) {
			System.out.println(patient.getName() + ", " + "patient id " + patient.getId() + " " + "Has a risk level of"
					+ " " + patient.getRiskLevel() + " " + patient.getBpm());
		}
	}

	public void setBpm(int bpm) {
		this.bpm = bpm;
	}
}
