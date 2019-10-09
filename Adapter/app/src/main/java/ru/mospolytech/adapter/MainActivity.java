package ru.mospolytech.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import ru.mospolytech.adapter.Adapters.Adapter;
import ru.mospolytech.adapter.Big.BigDoor;
import ru.mospolytech.adapter.Small.SmallDoor;
import ru.mospolytech.adapter.Small.SmallHole;
//Адаптер - струтурный паттерн
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SmallHole hole = new  SmallHole(4);
        SmallDoor door = new SmallDoor(4);
        if(hole.fits(door)){
            System.out.println("Come in");
        }
        BigDoor sbgdoor = new BigDoor(2);
        BigDoor bgdoor = new BigDoor(10);
        Adapter smallAdapter = new Adapter(sbgdoor);
        Adapter bigAdapter = new Adapter(bgdoor);
        if(hole.fits(smallAdapter)){
            System.out.println("Come in");
        }
        if(!hole.fits(bigAdapter)){
            System.out.println("Do not come in");
        }
    }
}
