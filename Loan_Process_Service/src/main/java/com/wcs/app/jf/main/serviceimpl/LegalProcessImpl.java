package com.wcs.app.jf.main.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wcs.app.jf.main.model.LegalProcess;
import com.wcs.app.jf.main.repository.LegalRepository;
import com.wcs.app.jf.main.service.IlegalProcess;

@Service
public class LegalProcessImpl implements IlegalProcess{

	@Autowired
	LegalRepository lr;
	
	@Override
	public List<LegalProcess> getdata() {
		List<LegalProcess>list=(List<LegalProcess>) lr.findAll();
		return  list; 
	}
	@Override
	public LegalProcess updateNotice( LegalProcess legal) {
		
		int flag=0;
		flag=legal.getFirstNoticeSend();
		flag=flag+1;
		System.out.println("--------------------------"+flag);
		legal.setFirstNoticeSend(flag);
		LegalProcess legalProcess=lr.save(legal);
		return legalProcess;
	}
	@Override
	public List<LegalProcess> get() {
		List<LegalProcess>list=(List<LegalProcess>) lr.findAll();
		return list;
	}

}
