package ru.mospolytech.abstractfactory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import ru.mospolytech.abstractfactory.Factories.CardFactory;
import ru.mospolytech.abstractfactory.Factories.DepartamentFactory;
import ru.mospolytech.abstractfactory.Factories.SurgFactory;

public class MainActivity extends AppCompatActivity {
private String departament;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Application app = configureApplication();
        app.create();
    }
    private  Application configureApplication() {
        Application app;
        DepartamentFactory factory;
        if(departament.equals("Surgeon")){
         factory = new SurgFactory();
         app = new Application(factory);
        }
        else{
      factory = new CardFactory();
      app = new Application(factory);

        }

        return app;
    }


}
