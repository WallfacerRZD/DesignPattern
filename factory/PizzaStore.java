package factory;

/**
 * 抽象披萨餐厅, 含有一个工厂方法
 * 不同地区的披萨餐厅派生自这个类, 产生不同风味的披萨
 * @author
 * @date
 */
public abstract class PizzaStore {
    abstract protected Pizza createPizza(PizzaType type);

    public Pizza orderPizza(PizzaType type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
