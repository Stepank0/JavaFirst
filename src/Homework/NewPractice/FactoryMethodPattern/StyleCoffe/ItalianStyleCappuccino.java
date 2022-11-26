package Homework.NewPractice.FactoryMethodPattern.StyleCoffe;

import Homework.NewPractice.FactoryMethodPattern.Coffee;

public class ItalianStyleCappuccino extends Coffee
{
    @Override
    public void makeCoffee(){
        System.out.println("Делаем каппучино по итальянски");
    }
}
