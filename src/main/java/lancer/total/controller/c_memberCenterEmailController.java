package lancer.total.controller;

import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/c_membercenter/*")
public class c_memberCenterEmailController {

	@Autowired
	private JavaMailSender mailSender;
	
	@RequestMapping(value="/member_centerMain", method=RequestMethod.GET)
	public void getMailSending(){
		System.out.println("^^");
	}
	
	@RequestMapping(value="/member_centerMain", method=RequestMethod.POST)
	public String mailSending(HttpServletRequest request){
		
		System.out.println("T.T");
		String setForm = "skidrow0725@gmail.com";
		String tomail = request.getParameter("tomail");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		try {
			System.out.println("try");
			MimeMessage message = mailSender.createMimeMessage();
			MimeMessageHelper messageHelper = new MimeMessageHelper(message, true, "UTF-8");
			
			messageHelper.setFrom(setForm);
			messageHelper.setTo(tomail);
			messageHelper.setSubject(title);
			messageHelper.setText(content);
 		} catch (Exception e) {
 			System.out.println("?.?");
			e.printStackTrace();
		}
		System.out.println("메일보내기 성공");
		return "redirect:/c_membercenter/member_centerMain";
	}
	
}
