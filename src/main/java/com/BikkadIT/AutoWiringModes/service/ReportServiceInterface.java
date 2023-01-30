package com.BikkadIT.AutoWiringModes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.BikkadIT.AutoWiringModes.dao.ReportDao;


@Service
public class ReportServiceInterface {

//	@Autowired
//	private OracleReport oracleReport;
	
	@Autowired 
	private ReportDao reportDao; //same method implemented in 2 class so it gives ambiguity problem.
	
	
	public void report() {
		
		reportDao.generateReport();
	}
}
