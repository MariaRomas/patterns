package ru.mospolytech.cor.middleware;

public class OMiddleware extends Middleware {
        private int requestPerMinute;
        private int request;
        private long currentTime;

        public OMiddleware(int requestPerMinute) {
            this.requestPerMinute = requestPerMinute;
            this.currentTime = System.currentTimeMillis();
        }

        public boolean check(String login, String password) {
            if (System.currentTimeMillis() > currentTime + 60_000) {
                request = 0;
                currentTime = System.currentTimeMillis();
            }

            request++;

            if (request > requestPerMinute) {
                System.out.println("Request limit exceeded!");
                Thread.currentThread().stop();
            }
            return checkNext(login, password);
        }

}
