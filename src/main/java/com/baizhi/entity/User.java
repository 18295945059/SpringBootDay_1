package com.baizhi.entity;

public class User {
    private String id;
    private String username;
    private String password;
    private String iphone;
    private String email;
    private String ip;
    private String position;
    private String source;
    private String status;

    public User(String id, String username, String password, String iphone, String email, String ip, String position, String source, String status) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.iphone = iphone;
        this.email = email;
        this.ip = ip;
        this.position = position;
        this.source = source;
        this.status = status;
    }

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getIphone() {
        return iphone;
    }

    public void setIphone(String iphone) {
        this.iphone = iphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", iphone='" + iphone + '\'' +
                ", email='" + email + '\'' +
                ", ip='" + ip + '\'' +
                ", position='" + position + '\'' +
                ", source='" + source + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public User(String username, String password, String iphone, String email, String ip, String position, String source, String status) {
        this.username = username;
        this.password = password;
        this.iphone = iphone;
        this.email = email;
        this.ip = ip;
        this.position = position;
        this.source = source;
        this.status = status;
    }
}
