package Homework.NewPractice.FactoryMethodPattern.StyleCoffe;

import Homework.NewPractice.FactoryMethodPattern.Coffee;

public class ItalianStyleCaffeLatte extends Coffee
{
    @Override
    public void makeCoffee(){
        System.out.println("Делаем латте по итальянски");
    }
}
