package Devices;

public class Projector implements Device {

    public void turnOn() {
        pullDownProjectorScreen();
        System.out.println("Projector is turning on...");
    }

    public void turnOff() {
        pullUpProjectorScreen();
        System.out.println("Projector is turning off...");

    }

    public void pullDownProjectorScreen() {
        System.out.println("Pulling projector screen down...");
    }

    public void pullUpProjectorScreen() {
        System.out.println("Pulling projector screen up...");
    }

    public String toString() {
        return "Projector";
    }
}
