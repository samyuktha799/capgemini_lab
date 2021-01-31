package com.cg.hsm.dao;

import java.util.List;

import com.cg.hsm.domain.PatientCase;
/**
 * This class perform CRUD operations on database
 * @author  samyuktha
 *
 */

public interface PatientCaseDao {
	/**
	 * 
	 * @param patient
	 */
	public void addPatientCase(PatientCase patientcase);
	/**
	 * 
	 * @param patient
	 */
	public void updatePatientCase(PatientCase patientcase);
	/**
	 * 
	 * @param patient
	 */
	public void deletePatientCase(PatientCase patientcase);
	/**
	 *
	 * @return
	 */
	List<PatientCase> findAll();
}





