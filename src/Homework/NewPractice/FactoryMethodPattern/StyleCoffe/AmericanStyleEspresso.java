package Homework.NewPractice.FactoryMethodPattern.StyleCoffe;


import Homework.NewPractice.FactoryMethodPattern.Coffee;

public class AmericanStyleEspresso extends Coffee {
    @Override
    public void makeCoffee(){
        System.out.println("Делаем эспрессо по американски");
    }
}
