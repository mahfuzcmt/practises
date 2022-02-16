package me.mahfuz.practises;

/**
 * The MailSender will return a suitable mail provider instance based on the input mail service provider type (GMAIL, SENDGRID, OFFCIE365).
 *
 * @author  Mahfuz
 * @version 1.0
 * @since   2022-02-16
 */

public abstract class MailSender {


    public abstract String sendMail();

}
