package com.github.captainmaximo.smtpclient;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Email
 *
 * @author CaptainMaximo
 *
 */
public class Email {

    private String from;
    private List<String> to = new ArrayList<>();
    private List<String> cc = new ArrayList<>();
    private List<String> bcc = new ArrayList<>();
    private String subject;
    private String text;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public List<String> getTo() {
        return to;
    }

    public void setTo(List<String> to) {
        this.to = to;
    }

    public List<String> getCc() {
        return cc;
    }

    public void setCc(List<String> cc) {
        this.cc = cc;
    }

    public List<String> getBcc() {
        return bcc;
    }

    public void setBcc(List<String> bcc) {
        this.bcc = bcc;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void addTo(String recipient) {
        to.add(recipient);
    }

    public void addCc(String recipient) {
        cc.add(recipient);
    }

    public void addBcc(String recipient) {
        bcc.add(recipient);
    }

}
