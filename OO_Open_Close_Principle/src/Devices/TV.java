package Devices;

public class TV implements Device {

    public void turnOn() {
        System.out.println("Powering on television...");
        changeChannel();
    }

    public void turnOff() {
        System.out.println("Powering off television...");
    }

    public void changeChannel() {
        System.out.println("Channel has been changed...");
    }

    public String toString() {
        return "TV";
    }
}
