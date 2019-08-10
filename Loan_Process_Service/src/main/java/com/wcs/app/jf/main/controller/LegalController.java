package com.wcs.app.jf.main.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.wcs.app.jf.main.model.LegalProcess;
import com.wcs.app.jf.main.service.IlegalProcess;
import com.wcs.app.jf.main.util.NotificationService;

@RestController
@CrossOrigin("*")
public class LegalController {

	private static final Logger log = (Logger) LoggerFactory.getLogger(LegalController.class);
	@Autowired
	IlegalProcess ip;
	@Autowired
	NotificationService notificationService;

	@GetMapping("/getdata")
	public List<LegalProcess> getdata() {

		List<LegalProcess> list = ip.getdata();

		return list;
	}

	@PutMapping("/sendnoticedata/{legalId}")

	public LegalProcess updateNotice(@PathVariable(name = "legalId") int legalId, @RequestBody LegalProcess legal) {
		LegalProcess legalProcess = ip.updateNotice(legal);
		try {
			notificationService.sendNotification(legal);
		} catch (MailException e) {
			log.info("Error message......." + e.getMessage());
		}
		return legalProcess;
	}

	@GetMapping("/getalldata")
	public List<LegalProcess> get() {
		List<LegalProcess> list = ip.get();
		return list;
	}
}
