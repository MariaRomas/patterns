package ru.mospolytech.observer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import ru.mospolytech.observer.editor.Editor;
import ru.mospolytech.observer.listeners.EmailListener;
import ru.mospolytech.observer.listeners.LogListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Editor editor = new Editor();
        editor.events.subscribe("open", new LogListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
