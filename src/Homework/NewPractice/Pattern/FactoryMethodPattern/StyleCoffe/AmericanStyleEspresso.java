package Homework.NewPractice.Pattern.FactoryMethodPattern.StyleCoffe;


import Homework.NewPractice.Pattern.FactoryMethodPattern.Coffee;

public class AmericanStyleEspresso extends Coffee {
    @Override
    public void makeCoffee(){
        System.out.println("Делаем эспрессо по американски");
    }
}
