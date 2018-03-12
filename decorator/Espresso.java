package decorator;

/**
 * 具体的饮料类, 被装饰者
 * @author
 * @date
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
