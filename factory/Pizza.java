package factory;

/**
 * 抽象披萨类, 所有具体的披萨派生自这个类
 *
 * @author
 * @date
 */
public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }
}

class CheesePizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        name = "CheesePizza";
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
    }

    @Override
    public String toString() {
        return name + " " + dough + " " + sauce;
    }
}
