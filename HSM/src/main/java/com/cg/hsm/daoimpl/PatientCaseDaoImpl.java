package com.cg.hsm.daoimpl;
import java.util.List;
import com.cg.hsm.dao.PatientCaseDao;
import com.cg.hsm.dao.PatientDao;
import com.cg.hsm.domain.PatientCase;
import com.cg.hsm.util.DbUtil;

public class PatientCaseDaoImpl extends DbUtil implements PatientCaseDao {
	/**
	 * 
	 */
	@Override
	public void addPatientCase(PatientCase patientcase) {
		// TODO Auto-generated method stub
		entityManager.getTransaction().begin();
		entityManager.persist(patientcase);
		entityManager.getTransaction().commit();
		
		
	}
	/**
	 * 
	 */
	@Override
	public void updatePatientCase(PatientCase patientcase) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 
	 */
	@Override
	public void deletePatientCase(PatientCase patientcase) {
		// TODO Auto-generated method stub
		
	}
	/**
	 *  
	 */
	@Override
	public List<PatientCase> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
