package ru.mospolytech.cor.middleware;

public class RoleCheck extends Middleware {

        public boolean check(String login, String password) {
            if (login.equals("admin")) {
                System.out.println("Hello, admin!");
                return true;
            }
            System.out.println("Hello, user!");
            return checkNext(login, password);
        }

}
