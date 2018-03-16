package command;

/**
 * 控制器, 封装了一个命令对象
 * 调用命令对象的execute方法就可以执行相应的命令
 *
 * @author
 * @date
 */
public class SimpleRemoteControl {
    private final int slotCount = 7;
    private Command[] onCommand;
    private Command[] offCommand;
    private Command lastCommand;

    SimpleRemoteControl() {
        onCommand = new Command[slotCount];
        offCommand = new Command[slotCount];
        for (int i = 0; i < slotCount; i++) {
            onCommand[i] = new NoCommand();
            offCommand[i] = new NoCommand();
        }
        lastCommand = new NoCommand();
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommand[slot] = onCommand;
        this.offCommand[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        Command command = onCommand[slot];
        command.execute();
        lastCommand = command;
    }

    public void offButtonWasPressed(int slot) {
        Command command = offCommand[slot];
        command.execute();
        lastCommand = command;
    }

    public void undoButtonWasPressed() {
        lastCommand.undo();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("-------Remote control----------\n");
        for (int i = 0; i < offCommand.length; i++) {
            stringBuilder.append(String.format("[slot %d : %s %s ]\n", i, onCommand[i].getClass().getName(), offCommand[i].getClass().getName()));
        }
        return stringBuilder.toString();
    }
}
