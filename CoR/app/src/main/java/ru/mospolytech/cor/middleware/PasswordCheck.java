package ru.mospolytech.cor.middleware;

import ru.mospolytech.cor.server.Server;

public class PasswordCheck extends Middleware {
    private Server server;

    public PasswordCheck(Server server) {
        this.server = server;
    }

    public boolean check(String login, String password) {

        return checkNext(login, password);
    }
}
