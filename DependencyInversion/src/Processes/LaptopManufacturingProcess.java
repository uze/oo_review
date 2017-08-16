package Processes;

public class LaptopManufacturingProcess extends Processes.GeneralManufacturingProcess {

    public LaptopManufacturingProcess(String name) {
        super(name);
    }

    protected void assembleDevice() {
        System.out.println("Assembled Laptop");
    }

    protected void testDevice() {
        System.out.println("Assembled Laptop");
    }

    protected void packageDevice() {
        System.out.println("Assembled Laptop");
    }

    protected void storeDevice() {
        System.out.println("Assembled Laptop");
    }
}
