package Homework.NewPractice.Pattern.FactoryMethodPattern.StyleCoffe;

import Homework.NewPractice.Pattern.FactoryMethodPattern.Coffee;

public class ItalianStyleCaffeLatte extends Coffee
{
    @Override
    public void makeCoffee(){
        System.out.println("Делаем латте по итальянски");
    }
}
