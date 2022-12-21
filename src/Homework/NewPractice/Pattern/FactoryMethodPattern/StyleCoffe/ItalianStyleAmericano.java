package Homework.NewPractice.Pattern.FactoryMethodPattern.StyleCoffe;

import Homework.NewPractice.Pattern.FactoryMethodPattern.Coffee;

public class ItalianStyleAmericano extends Coffee
{
    @Override
    public void makeCoffee(){
        System.out.println("Делаем американно по итальянски");
    }
}
