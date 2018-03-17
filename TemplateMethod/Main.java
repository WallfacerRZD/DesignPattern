package TemplateMethod;

/**
 * @author
 * @date
 */
public class Main {
    public static void main(String[] args) {
        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();
        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
