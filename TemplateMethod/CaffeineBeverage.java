package TemplateMethod;

/**
 * @author
 * @date
 */
public abstract class CaffeineBeverage {
    public final void prepareRecipe() {
        boilWater();
        brew();
        if (clientWantsCondiments()) {
            addCondiments();
        }
        pourInCup();
    }

    protected abstract void brew();

    protected abstract void addCondiments();

    /**
     * 钩子方法
     * @return
     */
    protected boolean clientWantsCondiments() {
        return true;
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }
}

class Tea extends CaffeineBeverage {

    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding Lemon");
    }

    @Override
    protected boolean clientWantsCondiments() {
        return false;
    }
}

class Coffee extends CaffeineBeverage {

    @Override
    protected void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}


