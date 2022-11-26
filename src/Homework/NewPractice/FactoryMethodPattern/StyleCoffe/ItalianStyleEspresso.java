package Homework.NewPractice.FactoryMethodPattern.StyleCoffe;

import Homework.NewPractice.FactoryMethodPattern.Coffee;

public class ItalianStyleEspresso extends Coffee
{
    @Override
    public void makeCoffee(){
        System.out.println("Делаем эспрессо по итальянски");
    }
}
