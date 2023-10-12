package ru.shishkov.groupmeeting.controllers.models;

import org.springframework.stereotype.Component;

@Component
public class User {

    private Integer id;
    private String name;
    private String login;
    private String password;
    private static int uniqId = 0;

    public User() {}

    public User(String login, String password, String name) {
        this.id = uniqId++;
        this.login = login;
        this.password = password;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
