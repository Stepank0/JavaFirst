package Homework.NewPractice.FactoryMethodPattern;


public abstract class CoffeeShop
{

    public Coffee orderCoffee(CoffeeType type){
        Coffee coffee = createCoffee(type);
        coffee.grindCoffee();
        coffee.makeCoffee();
        coffee.pourIntoCup();

        System.out.println("Вот ваш кофе! Спасибо, приходите еще!");
        return coffee;
    }

    public abstract Coffee createCoffee(CoffeeType type);

}
