package Devices;

public class SurroundSoundSystem implements Device{

    public void turnOn() {
        System.out.println("Surround sound system is powering on...");
        increasingVolume();
    }

    public void turnOff() {
        loweringVolume();
        System.out.println("Surround sound system is powering off...");
    }

    public void loweringVolume() {
        System.out.println("Volume has been lowered...");
    }

    public void increasingVolume() {
        System.out.println("Volume has been raised...");
    }

    public String toString() {
        return "SurroundSoundSystem";
    }
}
