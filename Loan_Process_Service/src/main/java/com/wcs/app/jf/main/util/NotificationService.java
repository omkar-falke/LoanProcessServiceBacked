package com.wcs.app.jf.main.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.wcs.app.jf.main.model.LegalProcess;

@Service
public class NotificationService {

	private JavaMailSender javaMailSender;
	@Autowired
	public NotificationService(JavaMailSender javaMailSender) {
		
		this.javaMailSender=javaMailSender;
	}
	
	public void sendNotification(LegalProcess legal)throws MailException
	{
		System.out.println("mail send------------------------");
		SimpleMailMessage mail=new SimpleMailMessage();
		mail.setTo(legal.getEmailId());
		mail.setFrom("omkar.falke95@gmail.com");
		mail.setSubject(" EMI Notice Notification");
		mail.setText("Hello!"+legal.getCustomerName()+" "+"Please Paid Your EMI"+"\n"+"Your EMI:&"+legal.getEMI()+" ");
		javaMailSender.send(mail);
	}
	
}
