package command;

/**
 * 命令对象的接口, 命令对象必须实现execute方法
 * @author
 * @date
 */
public interface Command {
    void execute();
    void undo();
}

/**
 * 开灯命令对象
 * 封装了灯对象, execute方法调用灯对象的on方法
 */
class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}

class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}

class NoCommand implements Command {

    @Override
    public void execute() {
        System.out.println("no command");
    }

    @Override
    public void undo() {
        System.out.println("no command");
    }
}
