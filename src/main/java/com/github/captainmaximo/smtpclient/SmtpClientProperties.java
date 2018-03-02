package com.github.captainmaximo.smtpclient;

/**
 *
 * SmtpClientProperties
 *
 * @author CaptainMaximo
 *
 */
public class SmtpClientProperties {

    private String username;
    private String password;
    private String host;
    private int port = 465;
    private int socketFactoryPort = 465;
    private String socketFactoryClass = "javax.net.ssl.SSLSocketFactory";
    private boolean starttls = true;
    private boolean auth = true;
    private boolean debug = false;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public int getSocketFactoryPort() {
        return socketFactoryPort;
    }

    public void setSocketFactoryPort(int socketFactoryPort) {
        this.socketFactoryPort = socketFactoryPort;
    }

    public String getSocketFactoryClass() {
        return socketFactoryClass;
    }

    public void setSocketFactoryClass(String socketFactoryClass) {
        this.socketFactoryClass = socketFactoryClass;
    }

    public boolean isStarttls() {
        return starttls;
    }

    public void setStarttls(boolean starttls) {
        this.starttls = starttls;
    }

    public boolean isAuth() {
        return auth;
    }

    public void setAuth(boolean auth) {
        this.auth = auth;
    }

    public boolean isDebug() {
        return debug;
    }

    public void setDebug(boolean debug) {
        this.debug = debug;
    }

}
