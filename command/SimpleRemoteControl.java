package command;

/**
 * 控制器, 封装了一个命令对象
 * 调用命令对象的execute方法就可以执行相应的命令
 * @author
 * @date
 */
public class SimpleRemoteControl {
    private Command command;

    SimpleRemoteControl() {

    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonWasPressed() {
        command.execute();
    }
}
