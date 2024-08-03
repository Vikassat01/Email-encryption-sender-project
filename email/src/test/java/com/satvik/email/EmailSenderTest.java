package com.satvik.email;

import com.satvik.email.services.EmailService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmailSenderTest {
    @Autowired
    private EmailService emailService;

    @Test
    void emaiSenderTest() {
        System.out.println("sending email");
        emailService.sendEmail("vikassatvik19@gmail.com", "Email from spring boot", "This is the spring boot generated mail");
    }

    @Test
    void sendHtmlInEmail() {
        String html = "" +
                "<h1 style='color:red;border:1px solid red;'>Welcome to my Mail service website</h1>" +
                "";
        emailService.sendEmailWithHtml("vikassatvik94@gmail.com", "Email from sprin book html content", html);
    }
}