package Homework.NewPractice.Pattern.FactoryMethodPattern;

import Homework.NewPractice.Pattern.FactoryMethodPattern.StyleCoffe.AmericanStyleAmericano;
import Homework.NewPractice.Pattern.FactoryMethodPattern.StyleCoffe.AmericanStyleCaffeLatte;
import Homework.NewPractice.Pattern.FactoryMethodPattern.StyleCoffe.AmericanStyleCappuccino;
import Homework.NewPractice.Pattern.FactoryMethodPattern.StyleCoffe.AmericanStyleEspresso;

public class AmericanCoffeeShop extends CoffeeShop{
    @Override
    public Coffee createCoffee(CoffeeType type) {
        Coffee coffee = null;

        switch (type) {
            case ESPRESSO:
                coffee = new AmericanStyleEspresso();
                break;
            case AMERICANO:
                coffee = new AmericanStyleAmericano();
                break;
            case CAFFE_LATTE:
                coffee = new AmericanStyleCaffeLatte();
                break;
            case CAPPUCCINO:
                coffee = new AmericanStyleCappuccino();
                break;
        }
        return coffee;

    }
}
