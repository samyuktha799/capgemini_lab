package com.cg.hsm.domain;


	import javax.persistence.*;
	/**
	 * This class will create doctors table in database and get all doctor details
	 * @author Pranjali Chaudhari
	 *
	 */

	@Entity
	@Table(name="doctors")
	public class Doctor {
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		/**
		 * Id of the doctor.
		 */
		private int doctorId;
		/**
		 * Name of the doctor.
		 */
		private String doctorName;
		/**
		 * Contact of the doctor.
		 */
		private long contactNumber;
		/**
		 * No of hours the doctor is available.
		 */
		private int hoursOfAvailability;
		/**
		 * Specialization details of the doctor.
		 */
		private String specialization;
		/**
		 * Degree details of the doctor.
		 */
		private String degree;
		/**
		 * Years of experience of the doctor.
		 */
		private int yearsOfExperience;
		/**
		 * Fees of the doctor.
		 */
		private int fees;
		
		//Getters and Setters
		public int getDoctorId() {
			return doctorId;
		}
		public void setDoctorId(int doctorId) {
			this.doctorId = doctorId;
		}
		public String getDoctorName() {
			return doctorName;
		}
		public void setDoctorName(String doctorName) {
			this.doctorName = doctorName;
		}
		public long getContactNumber() {
			return contactNumber;
		}
		public void setContactNumber(long contactNumber) {
			this.contactNumber = contactNumber;
		}
		public int getHoursOfAvailability() {
			return hoursOfAvailability;
		}
		public void setHoursOfAvailability(int hoursOfAvailability) {
			this.hoursOfAvailability = hoursOfAvailability;
		}
		public String getSpecialization() {
			return specialization;
		}
		public void setSpecialization(String specialization) {
			this.specialization = specialization;
		}
		public String getDegree() {
			return degree;
		}
		public void setDegree(String degree) {
			this.degree = degree;
		}
		public int getYearsOfExperience() {
			return yearsOfExperience;
		}
		public void setYearsOfExperience(int yearsOfExperience) {
			this.yearsOfExperience = yearsOfExperience;
		}
		public int getFees() {
			return fees;
		}
		public void setFees(int fees) {
			this.fees = fees;
		}
		
		//Parameterized Constructor
		public Doctor(int doctorId, String doctorName, long contactNumber, int hoursOfAvailability, String specialization,
				String degree, int yearsOfExperience, int fees) {
			super();
			this.doctorId = doctorId;
			this.doctorName = doctorName;
			this.contactNumber = contactNumber;
			this.hoursOfAvailability = hoursOfAvailability;
			this.specialization = specialization;
			this.degree = degree;
			this.yearsOfExperience = yearsOfExperience;
			this.fees = fees;
		}
		
		//Default Constructor
		public Doctor() {
			super();
			
		}
		
		//Overridden toString method
		@Override
		public String toString() {
			return "Patient [doctorId=" + doctorId + ", doctorName=" + doctorName + ", contactNumber=" + contactNumber
					+ ", hoursOfAvailability=" + hoursOfAvailability + ", specialization=" + specialization + ", degree="
					+ degree + ", yearsOfExperience=" + yearsOfExperience + ", fees=" + fees + "]";
		}
		
		

	

}
