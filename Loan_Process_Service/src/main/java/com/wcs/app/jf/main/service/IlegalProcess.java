package com.wcs.app.jf.main.service;

import java.util.List;

import com.wcs.app.jf.main.dto.LegalProcessDto;
import com.wcs.app.jf.main.model.LegalProcess;

public interface IlegalProcess {
	
	public List<LegalProcess>getdata();
	
	 public LegalProcess updateNotice(LegalProcess legal);
	 
	 public List<LegalProcess>get();
	 
	 
	
	

}
