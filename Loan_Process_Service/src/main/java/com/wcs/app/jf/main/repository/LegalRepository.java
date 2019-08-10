package com.wcs.app.jf.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.wcs.app.jf.main.dto.LegalProcessDto;
import com.wcs.app.jf.main.model.LegalProcess;

@Repository
public interface LegalRepository  extends PagingAndSortingRepository<LegalProcess, Integer>{

	@Query("SELECT new com.wcs.app.jf.main.dto.LegalProcessDto(e.legalId,e.EMI,e.count_Bucket,e.customerName,e.emiPaidDate,e.loanAmount,e.emailId,e.firstNoticeSend)" + "from LegalProcess e")
	public  List<LegalProcessDto> fetchdata();
	
	public LegalProcess findById(int legalId);

	

	
	
}
