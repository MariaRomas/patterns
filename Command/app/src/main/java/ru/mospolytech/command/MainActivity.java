package ru.mospolytech.command;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import ru.mospolytech.command.menu.Editor;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Editor editor = new Editor();
        editor.init();
    }
}
