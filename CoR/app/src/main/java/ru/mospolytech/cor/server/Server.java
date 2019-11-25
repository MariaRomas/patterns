package ru.mospolytech.cor.server;

import java.util.HashMap;
import java.util.Map;

import ru.mospolytech.cor.middleware.Middleware;

public class Server {
    private Map<String, String> users = new HashMap<>();
    private Middleware middleware;


    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }

    public boolean logIn(String login, String password) {
        if (middleware.check(login, password)) {
            System.out.println("Authorization have been successful!");


            return true;
        }
        return false;
    }

    public void register(String login, String password) {
        users.put(login, password);
    }

    public boolean hasLogin(String login) {
        return users.containsKey(login);
    }

    public boolean isValidPassword(String login, String password) {
        return users.get(login).equals(password);
    }
}