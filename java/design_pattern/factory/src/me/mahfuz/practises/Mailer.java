package me.mahfuz.practises;

import me.mahfuz.practises.constants.ServiceProvider;

public class Mailer {

    public static void main(String[] args) {

        MailSender mailSender = MailFactory.getMailSender(ServiceProvider.GMAIL);
        System.out.println("Mail Subject: " + mailSender.getSubject());
        System.out.println(mailSender.sendMail());

        mailSender = MailFactory.getMailSender(ServiceProvider.SENDGRID);
        System.out.println("Mail Subject: " + mailSender.getSubject());
        System.out.println(mailSender.sendMail());

        mailSender = MailFactory.getMailSender(ServiceProvider.OFFICE365);
        System.out.println("Mail Subject: " + mailSender.getSubject()); // office365 is overridden the subject
        System.out.println(mailSender.sendMail());

    }


   /*
    output
    ==================================
    Mail Subject: This is a test mail
    Mail has been successfully sent by Gmail!
    Mail Subject: This is a test mail
    Mail has been successfully sent by Sendgrid!
    Mail Subject: This is a test mail by Office365
    Mail has been successfully sent by Office365

    */
}
