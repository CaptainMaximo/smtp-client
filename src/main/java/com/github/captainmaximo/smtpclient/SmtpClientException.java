package com.github.captainmaximo.smtpclient;

/**
 *
 * SmtpClientException
 *
 * @author CaptainMaximo
 *
 */
public class SmtpClientException extends RuntimeException {

    public SmtpClientException() {
        super();
    }

    public SmtpClientException(String message) {
        super(message);
    }

    public SmtpClientException(String message, Throwable cause) {
        super(message, cause);
    }

    public SmtpClientException(Throwable cause) {
        super(cause);
    }

    protected SmtpClientException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
