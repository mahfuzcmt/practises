package me.mahfuz.practises;

import me.mahfuz.practises.helper.Gmail;
import me.mahfuz.practises.helper.Office365;
import me.mahfuz.practises.helper.Sendgrid;
import me.mahfuz.practises.util.ServiceProvider;

public class MailFactory {

    public static MailSender getMailSender(ServiceProvider serviceProvider) {

        MailSender mailSender = null;
        switch (serviceProvider) {
            case GMAIL:
                mailSender = new Gmail();
                break;
            case SENDGRID:
                mailSender = new Sendgrid();
                break;
            case OFFICE365:
                mailSender = new Office365();
                break;
        }
        return mailSender;
    }
}
