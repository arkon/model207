package classes;

import java.util.ArrayList;
import java.util.List;

public class Patient {

	/** This Patient's first name, last name, and date of birth. */
	private String firstName, lastName, dob;

	/** This Patient's health card number. */
	private String healthCard;

	/** This Patient's arrival time. */
	private String arrivalTime;

	/** This Patient's prescriptions. */
	private List<Prescription> prescriptions;

	/** This Patient's symptoms records. */
	private List<Symptoms> symptoms;

	/** This Patient's vitals records. */
	private List<Vitals> vitals;

	/** This Patient's urgency. */
	private Byte urgency;

	/** The times that this Patient has been seen by a doctor. */
	private List<String> timeDoctor;

	/** True if this Patient is improving. */
	private Boolean isImproving;

	public Patient(String firstName, String lastName, String dob,
			String healthCard) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.healthCard = healthCard;

		this.arrivalTime = null;

		this.prescriptions = new ArrayList<Prescription>();
		this.symptoms = new ArrayList<Symptoms>();
		this.vitals = new ArrayList<Vitals>();

		this.urgency = 0;
		this.timeDoctor = new ArrayList<String>();

		this.isImproving = false;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getName() {
		return String.format("%s, %s", this.getLastName(), this.getFirstName());
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getHealthCard() {
		return healthCard;
	}

	public void setHealthCard(String healthCard) {
		this.healthCard = healthCard;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public List<Prescription> getPrescriptions() {
		return prescriptions;
	}

	public void setPrescriptions(List<Prescription> prescriptions) {
		this.prescriptions = prescriptions;
	}

	public void addPrescription(Prescription prescription) {
		this.prescriptions.add(prescription);
	}

	public List<Symptoms> getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(List<Symptoms> symptoms) {
		this.symptoms = symptoms;
	}

	public void addSymptoms(Symptoms symptoms) {
		this.symptoms.add(symptoms);
	}

	public List<Vitals> getVitals() {
		return vitals;
	}

	public void setVitals(List<Vitals> vitals) {
		this.vitals = vitals;
	}

	public void addVitals(Vitals vitals) {
		this.vitals.add(vitals);
	}

	public Byte getUrgency() {
		return urgency;
	}

	public void setUrgency(Byte urgency) {
		this.urgency = urgency;
	}

	public List<String> getTimeDoctor() {
		return timeDoctor;
	}

	public void setTimeDoctor(List<String> timeDoctor) {
		this.timeDoctor = timeDoctor;
	}

	public void addTimeDoctor(String timeDoctor) {
		this.timeDoctor.add(timeDoctor);
	}

	public Boolean getIsImproving() {
		return isImproving;
	}

	public void setIsImproving(Boolean isImproving) {
		this.isImproving = isImproving;
	}
}