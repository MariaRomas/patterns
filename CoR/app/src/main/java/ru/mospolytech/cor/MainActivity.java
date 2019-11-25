package ru.mospolytech.cor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import ru.mospolytech.cor.middleware.Middleware;
import ru.mospolytech.cor.middleware.OMiddleware;
import ru.mospolytech.cor.middleware.PasswordCheck;
import ru.mospolytech.cor.middleware.RoleCheck;
import ru.mospolytech.cor.server.Server;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {
        server = new Server();
        server.register("admin", "admin_pass");
        server.register("user", "user_pass");

        Middleware middleware = new OMiddleware(2);
        middleware.linkWith(new PasswordCheck(server))
                .linkWith(new RoleCheck());

        // Сервер получает цепочку от клиентского кода.
        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean success;
        do {
            System.out.print("Enter login: ");
            String login = reader.readLine();
            System.out.print("Input password: ");
            String password = reader.readLine();
            success = server.logIn(login, password);
        } while (!success);
    }
}
