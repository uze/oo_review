package Remotes;

import Devices.Device;

public class RemoteControl {

    private Device device = null;
    private static final RemoteControl INSTANCE = new RemoteControl();

    public static RemoteControl getInstance(){
        return INSTANCE;
    }

   public void connectToDevice(Device _device){
        this.device = _device;
        System.out.println("Connected to: " + device);
   }

    public void clickOnButton(){
        device.turnOn();
    }

    public void clickOffButton(){
        device.turnOff();
    }

}