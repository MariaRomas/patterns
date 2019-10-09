package ru.mospolytech.fabric;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import ru.mospolytech.fabric.Doctors.Cardiologist;
import ru.mospolytech.fabric.Doctors.Surgeon;
import ru.mospolytech.fabric.Factory.Dialog;

//Фабричный метод - порождающий паттерн
public class MainActivity extends AppCompatActivity {
    private static Dialog dialog;
    private  String specialization;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        configure();
        run();
    }
    private void configure(){
        if(specialization.equals("Surgeon")){
            Intent intent = new Intent(this, Surgeon.class);
            startActivity(intent);
        }
        else{
            Intent intent = new Intent(this, Cardiologist.class);
            startActivity(intent);

        }
    }
    static void run(){
        dialog.renderDoctor();
    }
}
