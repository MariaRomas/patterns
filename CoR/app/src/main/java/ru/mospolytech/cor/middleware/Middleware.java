package ru.mospolytech.cor.middleware;

public abstract class Middleware {
    private Middleware next;

    public Middleware linkWith(Middleware next) {
        this.next = next;
        return next;
    }

    public abstract boolean check(String login, String password);


    protected boolean checkNext(String login, String password) {
        if (next == null) {
            return true;
        }
        return next.check(login, password);
    }
}