package decorator;

/**
 * @author
 * @date
 */
public class Main {
    public static void main(String[] args) {
        // 不加调料的Espresso
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        // 加一份Mocha的Espresso
        Beverage beverage1 = new Mocha(beverage);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        // 加两份Mocha的Espresso
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        // 加一份Mocha的HouseBlend
        beverage2 = new Mocha(new HouseBlend());
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

    }
}
