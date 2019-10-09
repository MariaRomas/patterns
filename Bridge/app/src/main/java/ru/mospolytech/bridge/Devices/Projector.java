package ru.mospolytech.bridge.Devices;

public class Projector implements Device{
    private boolean on = true;
    private int brightness = 50;
    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
    }

    @Override
    public void disable() {
        on = false;
    }

    @Override
    public int getBrightness() {
        return brightness;
    }

    @Override
    public void setBrightness(int brightness) {
        if (brightness > 100) {
            this.brightness = 100;
        } else if (brightness < 0) {
            this.brightness = 0;
        } else {
            this.brightness = brightness;
        }
    }


    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| I'm projector.");
        System.out.println("| I'm " + (on ? "enabled" : "disabled"));
        System.out.println("| Current brighness is " + brightness + "%");
        System.out.println("------------------------------------\n");
    }
}
