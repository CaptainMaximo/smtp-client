package solutions.rieder.smtpclient;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.Authenticator;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import java.util.Objects;
import java.util.Properties;

/**
 *
 * SmtpClient
 *
 * @author CaptainMaximo
 *
 */
public class SmtpClient {

    private final Session session;

    public SmtpClient(SmtpClientProperties configProperties) {
        Properties props = new Properties();
        props.setProperty("mail.smtp.user", configProperties.getUsername());
        props.setProperty("mail.smtp.host", configProperties.getHost());
        props.setProperty("mail.smtp.port", Integer.toString(configProperties.getPort()));
        props.setProperty("mail.smtp.socketFactory.port", Integer.toString(configProperties.getSocketFactoryPort()));
        props.setProperty("mail.smtp.socketFactory.class", configProperties.getSocketFactoryClass());
        props.setProperty("mail.smtp.auth", Boolean.toString(configProperties.isAuth()));
        props.setProperty("mail.smtp.starttls.enable", Boolean.toString(configProperties.isStarttls()));
        props.setProperty("mail.smtp.debug", Boolean.toString(configProperties.isDebug()));
        session = Session.getInstance(props,
            new Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(configProperties.getUsername(), configProperties.getPassword());
                }
            });
    }

    public void send(Email email) {
        try {

            Objects.requireNonNull(email, "email must not be null");
            Objects.requireNonNull(email.getText(), "email.text must not be null");
            Objects.requireNonNull(email.getSubject(), "email.subject must not be null");

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(email.getFrom()));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(String.join(",", email.getTo())));
            message.setRecipients(Message.RecipientType.CC,
                    InternetAddress.parse(String.join(",", email.getCc())));
            message.setRecipients(Message.RecipientType.BCC,
                    InternetAddress.parse(String.join(",", email.getBcc())));
            message.setSubject(email.getSubject());
            message.setText(email.getText());

            Transport.send(message);

        } catch (MessagingException e) {
            throw new SmtpClientException(e);
        }
    }

}
