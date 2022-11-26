package Homework.NewPractice.FactoryMethodPattern.StyleCoffe;


import Homework.NewPractice.FactoryMethodPattern.Coffee;

public class AmericanStyleCappuccino extends Coffee
{
    @Override
    public void makeCoffee(){
        System.out.println("Делаем капучино по американски");
    }
}
