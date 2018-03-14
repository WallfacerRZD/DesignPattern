package factory;

/**
 * @author
 * @date
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(PizzaType type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if (type.equals(PizzaType.CHEESE)) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else {
            // ...
        }
        return pizza;
    }
}
