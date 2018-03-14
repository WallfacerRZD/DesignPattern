package factory;

abstract class Dough {
    @Override
    public String toString() {
        return "Dough";
    }
}

class ThinCrustDough extends Dough {
    @Override
    public String toString() {
        return "ThinCrustDough";
    }
}


/*
 **********************************************
 */

abstract class Sauce {
    @Override
    public String toString() {
        return "Sauce";
    }
}

class MarinaraSauce extends Sauce {
    @Override
    public String toString() {
        return "MarinaraSauce";
    }
}

/**
 * 抽象原料工厂
 * 不同地区的原料工厂实现这个接口
 *
 * @author
 * @date
 */
public interface PizzaIngredientFactory {
    Dough createDough();

    Sauce createSauce();
}

class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }
}
