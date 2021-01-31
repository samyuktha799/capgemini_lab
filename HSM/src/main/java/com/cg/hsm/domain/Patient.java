package com.cg.hsm.domain;



	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;
	/**
	 * This class will create patient table in database and get all doctor details
	 * @author 
	 *
	 */
	@Entity
	@Table(name="patients")
	public class Patient {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		/**
		 * id of the patient
		 */
		private int patientId;
		/**
		 * id of the patient
		 */
		private String patientName;	
		/**
		 * age of the patient
		 */
		private int patientAge;
		/**
		 * contact of the patient
		 */
		private long patientContact;
		/**
		 * address of the patient
		 */
		private String address;
		/**
		 *  symptoms of the patient
		 */
		private String symptoms;
		/**
		 * fee for the patient admission fee
		 */
		private int admissionFee;
		
		//getters and setters
		
		
		public int getPatientId() {
			return patientId;
		}
		public void setPatientId(int patientId) {
			this.patientId = patientId;
		}
		public String getPatientName() {
			return patientName;
		}
		public void setPatientName(String patientName) {
			this.patientName = patientName;
		}
		public int getPatientAge() {
			return patientAge;
		}
		public void setPatientAge(int patientAge) {
			this.patientAge = patientAge;
		}
		public long getPatientContact() {
			return patientContact;
		}
		public void setPatientContact(long patientContact) {
			this.patientContact = patientContact;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getSymptoms() {
			return symptoms;
		}
		public void setSymptoms(String symptoms) {
			this.symptoms = symptoms;
		}
		public int getAdmissionFee() {
			return admissionFee;
		}
		public void setAdmissionFee(int admissionFee) {
			this.admissionFee = admissionFee;
		}
		
		//Parameterized Constructor
		public Patient(int id, String patientName, int patientAge, long patientContact, String address, String symptoms,
				int admissionFee) {
			super();
			this.patientId = id;
			this.patientName = patientName;
			this.patientAge = patientAge;
			this.patientContact = patientContact;
			this.address = address;
			this.symptoms = symptoms;
			this.admissionFee = admissionFee;
		}
		
		//Default Constructor
			public Patient() {
				super();
				
			}
			
			@Override
			public String toString() {
				return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", patientAge=" + patientAge
						+ ", patientContact=" + patientContact + ", address=" + address + ", symptoms=" + symptoms
						+ ", admissionFee=" + admissionFee + "]";
			}
			
		
		

		
		

	
}
