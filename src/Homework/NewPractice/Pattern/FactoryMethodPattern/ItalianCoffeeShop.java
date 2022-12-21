package Homework.NewPractice.Pattern.FactoryMethodPattern;

import Homework.NewPractice.Pattern.FactoryMethodPattern.StyleCoffe.ItalianStyleAmericano;
import Homework.NewPractice.Pattern.FactoryMethodPattern.StyleCoffe.ItalianStyleCaffeLatte;
import Homework.NewPractice.Pattern.FactoryMethodPattern.StyleCoffe.ItalianStyleCappuccino;
import Homework.NewPractice.Pattern.FactoryMethodPattern.StyleCoffe.ItalianStyleEspresso;

public class ItalianCoffeeShop extends CoffeeShop {
    @Override
    public Coffee createCoffee(CoffeeType type) {
        Coffee coffee = null;

        switch (type) {
            case ESPRESSO:
                coffee = new ItalianStyleEspresso();
                break;
            case AMERICANO:
                coffee = new ItalianStyleAmericano();
                break;
            case CAFFE_LATTE:
                coffee = new ItalianStyleCaffeLatte();
                break;
            case CAPPUCCINO:
                coffee = new ItalianStyleCappuccino();
                break;
        }
        return coffee;
    }

}
