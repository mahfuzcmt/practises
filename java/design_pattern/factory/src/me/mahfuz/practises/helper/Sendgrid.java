package me.mahfuz.practises.helper;

import me.mahfuz.practises.MailSender;

public class Sendgrid extends MailSender {
    @Override
    public String sendMail() {
        return "Mail has been successfully sent by Sendgrid!";
    }
}
