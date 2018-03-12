package decorator;

/**
 * 装饰者类的抽象类
 * @author
 * @date
 */
public abstract class CondimentDecorator extends Beverage {
    @Override
    public abstract String getDescription();
}
