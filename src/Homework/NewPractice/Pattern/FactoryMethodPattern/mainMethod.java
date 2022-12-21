package Homework.NewPractice.Pattern.FactoryMethodPattern;


public class mainMethod {

    public static void main(String[] args) {
        CoffeeShop italianoCoffeeShop = new ItalianCoffeeShop();
        italianoCoffeeShop.orderCoffee(CoffeeType.CAPPUCCINO);

        CoffeeShop americanoCoffeeShop = new AmericanCoffeeShop();
        americanoCoffeeShop.orderCoffee(CoffeeType.ESPRESSO);

    }


}
