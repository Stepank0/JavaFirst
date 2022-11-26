package Homework.NewPractice.FactoryMethodPattern.StyleCoffe;


import Homework.NewPractice.FactoryMethodPattern.Coffee;

public class AmericanStyleCaffeLatte extends Coffee {

    @Override
    public void makeCoffee(){
        System.out.println("Делаем латте по американски");
    }
}
