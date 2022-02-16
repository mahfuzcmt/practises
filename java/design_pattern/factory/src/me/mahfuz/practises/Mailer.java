package me.mahfuz.practises;

import me.mahfuz.practises.util.ServiceProvider;

public class Mailer {

    public static void main(String[] args) {

        MailSender mailSender = MailFactory.getMailSender(ServiceProvider.GMAIL);
        System.out.println(mailSender.sendMail());

        mailSender = MailFactory.getMailSender(ServiceProvider.SENDGRID);
        System.out.println(mailSender.sendMail());

        mailSender = MailFactory.getMailSender(ServiceProvider.OFFICE365);
        System.out.println(mailSender.sendMail());

    }

    //output

   /*

    Mail has been successfully sent by Gmail!
    Mail has been successfully sent by Sendgrid!
    Mail has been successfully sent by Office365

    */
}
