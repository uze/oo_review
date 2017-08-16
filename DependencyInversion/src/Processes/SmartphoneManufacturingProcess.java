package Processes;

public class SmartphoneManufacturingProcess extends Processes.GeneralManufacturingProcess {

    public SmartphoneManufacturingProcess(String name) {
        super(name);
    }

    protected void assembleDevice() {
        System.out.println("Assembled Smartphone");
    }

    protected void testDevice() {
        System.out.println("Tested Smartphone");
    }

    protected void packageDevice() {
        System.out.println("Packaged Smartphone");
    }

    protected void storeDevice() {
        System.out.println("Stored Smartphone");
    }
}
