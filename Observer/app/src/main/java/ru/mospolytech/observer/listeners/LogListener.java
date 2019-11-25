package ru.mospolytech.observer.listeners;

import java.io.File;
import java.util.EventListener;

public class LogListener implements EventListener {
    private File log;

    public LogListener(String fileName) {
        this.log = new File(fileName);
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Save to log " + log + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }
}
