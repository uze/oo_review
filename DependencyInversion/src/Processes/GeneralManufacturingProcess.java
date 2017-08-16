package Processes;

public abstract class GeneralManufacturingProcess {

    private String processName;

    public GeneralManufacturingProcess(String name) {
        processName = name;
    }

    protected abstract void assembleDevice();
    protected abstract void testDevice();
    protected abstract void packageDevice();
    protected abstract void storeDevice();


    /* Template Method */
    public void launchProcess() {

        if(processName != null && !processName.isEmpty()){
            assembleDevice();
            testDevice();
            packageDevice();
            storeDevice();
        } else
            System.out.println("No process was specified...");
    }


}
