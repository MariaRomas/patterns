package ru.mospolytech.builder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import ru.mospolytech.builder.Builders.CakeBuilder;
import ru.mospolytech.builder.Builders.PieBuilder;
import ru.mospolytech.builder.Cakes.Cake;
import ru.mospolytech.builder.Director.Director;
//Строитель - порождающий паттерн
public class MainActivity extends AppCompatActivity {
Director director = new Director();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CakeBuilder builder = new CakeBuilder();
        director.constructFruitCake(builder);

        Cake cake=builder.getResult();
        PieBuilder pieBuilder = new PieBuilder();
        director.constructPie(pieBuilder);

    }


}
