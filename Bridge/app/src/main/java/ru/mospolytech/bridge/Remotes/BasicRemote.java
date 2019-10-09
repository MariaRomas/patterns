package ru.mospolytech.bridge.Remotes;

import ru.mospolytech.bridge.Devices.Device;

public class BasicRemote implements Remote {
    protected Device device;

    public BasicRemote() {}

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        System.out.println("Remote: power toggle");
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    @Override
    public void brightnessDown() {
        System.out.println("Remote: brightness down");
        device.setBrightness(device.getBrightness() - 10);
    }

    @Override
    public void brightnessUp() {
        System.out.println("Remote: brightness up");
        device.setBrightness(device.getBrightness() + 10);
    }


}
