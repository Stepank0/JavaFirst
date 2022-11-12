package Homework.NewPractice.OOP.wallet;

import java.util.Random;

public class Wallet {

    public static void main(String[] args) {

        Person kate = new Person("Kate");

        Money rub = new Ruble(189.98);
        Money usd = new USD(24.54);
        Money uah = new Hryvnia(104.34);

        for(Money moneys : kate.getMoney()){
            System.out.println(kate.getName() + " have "+ moneys.getAmount()+ " " + moneys.getCurrencyName());
        }

    }
}
