package factory;

/**
 * @author
 * @date
 */
public class Main {
    public static void main(String[] args) {
        PizzaStore store = new NYPizzaStore();
        System.out.println(store.orderPizza(PizzaType.CHEESE));
    }
}
