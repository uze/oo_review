package User;

import Devices.Projector;
import Devices.SurroundSoundSystem;
import Devices.TV;
import Remotes.RemoteControl;

public class Person {

    public static void main(String args[]){

        Projector projector = new Projector();
        TV tv = new TV();
        SurroundSoundSystem surroundSoundSystem = new SurroundSoundSystem();

        RemoteControl remoteControl = RemoteControl.getInstance();

        remoteControl.connectToDevice(projector);
        remoteControl.clickOnButton();

        remoteControl.connectToDevice(tv);
        remoteControl.clickOnButton();

        remoteControl.connectToDevice(surroundSoundSystem);
        remoteControl.clickOnButton();

        remoteControl.connectToDevice(projector);
        remoteControl.clickOffButton();

        remoteControl.connectToDevice(tv);
        remoteControl.clickOffButton();

        remoteControl.connectToDevice(surroundSoundSystem);
        remoteControl.clickOffButton();
    }
}


