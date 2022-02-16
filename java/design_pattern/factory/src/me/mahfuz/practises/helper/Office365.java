package me.mahfuz.practises.helper;

import me.mahfuz.practises.MailSender;

public class Office365 extends MailSender {

    String subject = "by Office365";

    @Override
    public String sendMail() {
        return "Mail has been successfully sent by Office365";
    }

    @Override
    public String getSubject() {
        return super.getSubject() + " " + subject;
    }
}
