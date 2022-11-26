package Homework.NewPractice.FactoryMethodPattern.StyleCoffe;

import Homework.NewPractice.FactoryMethodPattern.Coffee;

public class ItalianStyleAmericano extends Coffee
{
    @Override
    public void makeCoffee(){
        System.out.println("Делаем американно по итальянски");
    }
}
