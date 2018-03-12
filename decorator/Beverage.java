package decorator;

/**
 * 装饰者模式的组件
 * 装饰者和被装饰者的超类
 * @author
 * @date
 */
public abstract class Beverage {
    public String getDescription() {
        return description;
    }

    public abstract double cost();

    protected String description = "Unknown Beverage";
}
