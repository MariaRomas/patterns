package ru.mospolytech.bridge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import ru.mospolytech.bridge.Devices.Device;
import ru.mospolytech.bridge.Devices.Projector;
import ru.mospolytech.bridge.Devices.Screen;
import ru.mospolytech.bridge.Remotes.BasicRemote;
//Мост - структурный паттерн
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testDevice(new Projector());
        testDevice(new Screen());
    }
    public void testDevice(Device device){
        System.out.println("Tests with remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();
    }
}
