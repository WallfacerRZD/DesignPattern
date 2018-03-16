package command;

/**
 * @author
 * @date
 */
public class Main {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        remote.setCommand(1, lightOnCommand, lightOffCommand);
        remote.onButtonWasPressed(1);
        remote.offButtonWasPressed(1);
        remote.undoButtonWasPressed();
        System.out.println(remote);
    }
}
