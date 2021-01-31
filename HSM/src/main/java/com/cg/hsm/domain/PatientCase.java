package com.cg.hsm.domain;

public class PatientCase {
	/**
	 * DoctorName how to assigned to that patient
	 */
	private String associatedDoctorName;
	/**
	 * medicine for patient
	 */
	private String medicine;
	/**
	 * Reports of patients
	 */
	private String reports;
	/**
	 * currenttreatment given to patient
	 */
	private String currentTreatment;
	/**
	 * Detail description of disease
	 */
	private String diseaseDescription;
	
	//getters and setters
	public String getDiseaseDescription() {
		return diseaseDescription;
	}
	public void setDiseaseDescription(String diseaseDescription) {
		this.diseaseDescription = diseaseDescription;
	}
	public String getassociatedDoctorName() {
		return associatedDoctorName;
	}
	public void setassociatedDoctorId(String associatedDoctorName) {
		this.associatedDoctorName = associatedDoctorName;
	}
	public String getMedicine() {
		return medicine;
	}
	public void setMedicine(String medicine) {
		this.medicine = medicine;
	}
	public String getReports() {
		return reports;
	}
	public void setReports(String reports) {
		this.reports = reports;
	}
	public String getCurrentTreatment() {
		return currentTreatment;
	}
	public void setCurrentTreatment(String currentTreatment) {
		this.currentTreatment = currentTreatment;
	}
	//Parameterized Constructor
		public PatientCase(String associatedDoctorId,String reports, String currentTreatment,String medicine,String diseaseDescription) {
			super();
			this.associatedDoctorName = associatedDoctorName;
			this.reports = reports;
			this.currentTreatment = currentTreatment;
			this.medicine = medicine;
			this.diseaseDescription=diseaseDescription;
		}
		//Default Constructor
				public PatientCase() {
					super();
					
				}
				@Override
				public String toString() {
					return "PatientCase [associatedDoctorName=" + associatedDoctorName + ", medicine=" + medicine + ", reports="
							+ reports + ", currentTreatment=" + currentTreatment + ", diseaseDescription=" + diseaseDescription
							+ "]";
				}
				
				

}
