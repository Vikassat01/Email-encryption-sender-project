package com.satvik.email.services;

import java.io.File;

public interface EmailService {
    //Send email to single persion
    void sendEmail(String to,String subject,String message);
    //send email to multiple person
    void sendEmail(String []to,String subject,String message);
    //void sendemailwithhtml
    void sendEmailWithHtml(String to,String subject,String htmlContent);
    //void email send with file
    void sendEmailWithFile(String to,String subject, File file);
}
