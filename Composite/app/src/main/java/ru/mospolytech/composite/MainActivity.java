package ru.mospolytech.composite;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import ru.mospolytech.composite.editor.Editor;
import ru.mospolytech.composite.graphics.Circle;
import ru.mospolytech.composite.graphics.CompoundGraphic;
import ru.mospolytech.composite.graphics.Rectangle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Editor editor = new Editor();

        editor.loadGraphics(
                new Circle(10, 10, 10,Color.BLUE),


                new CompoundGraphic(
                        new Rectangle(250, 250, 100, 100,Color.GREEN)
                )
        );
    }
    }

}
