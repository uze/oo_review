package Clients;
import Processes.GeneralManufacturingProcess;
import Processes.SmartphoneManufacturingProcess;
import Processes.LaptopManufacturingProcess;

public class DeviceFactory {

    public static void main(String args[]){
        GeneralManufacturingProcess phoneManufacturingProcess = new SmartphoneManufacturingProcess("iPhone Manufacturing Process");
        phoneManufacturingProcess.launchProcess();

        GeneralManufacturingProcess laptopManufacturingProcess = new LaptopManufacturingProcess("Mac Manufacturing Process");
        laptopManufacturingProcess.launchProcess();
    }
}
