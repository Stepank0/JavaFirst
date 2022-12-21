package Homework.NewPractice.Pattern.FactoryMethodPattern.StyleCoffe;


import Homework.NewPractice.Pattern.FactoryMethodPattern.Coffee;

public class AmericanStyleCappuccino extends Coffee
{
    @Override
    public void makeCoffee(){
        System.out.println("Делаем капучино по американски");
    }
}
