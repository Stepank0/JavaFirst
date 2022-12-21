package Homework.NewPractice.Pattern.FactoryMethodPattern.StyleCoffe;

import Homework.NewPractice.Pattern.FactoryMethodPattern.Coffee;

public class ItalianStyleCappuccino extends Coffee
{
    @Override
    public void makeCoffee(){
        System.out.println("Делаем каппучино по итальянски");
    }
}
