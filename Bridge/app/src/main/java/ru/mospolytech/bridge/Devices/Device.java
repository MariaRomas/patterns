package ru.mospolytech.bridge.Devices;

public interface Device {
    boolean isEnabled();

    void enable();

    void disable();

    int getBrightness();

    void setBrightness(int percent);

    void printStatus();
}