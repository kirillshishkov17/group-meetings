package ru.shishkov.groupmeeting.controllers.models;

public class User {

    private Integer id;
    private String login;
    private String password;
    private static int uniqId = 0;

    public User() {}

    public User(String login, String password) {
        this.id = uniqId++;
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }
}
