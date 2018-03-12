package decorator;

/**
 * 具体的饮料类, 被装饰者
 * @author
 * @date
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
