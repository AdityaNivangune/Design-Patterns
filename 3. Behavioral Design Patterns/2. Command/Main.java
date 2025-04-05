public class Main {
    public static void main(String[] args) {
        
        // create devices
        TV tv = new TV();
        Stereo stereo = new Stereo();

        // create command objects
        Command turnOnTVCommand = new TurnOnCommand(tv);
        Command turnOffTVCommand = new TurnOffCommand(tv);
        Command adjustVolumeStereoCommand = new AdjustVolumeCommand(stereo);
        Command changeChannelTVCommand = new ChangeChannelCommand(tv);

        // create remote control
        RemoteControl remote = new RemoteControl();

        // Set and execute commands
        remote.setCommand(turnOnTVCommand);
        remote.pressButton();

        remote.setCommand(adjustVolumeStereoCommand);
        remote.pressButton();

        remote.setCommand(changeChannelTVCommand);
        remote.pressButton();

        remote.setCommand(turnOffTVCommand);
        remote.pressButton();
    }
}
