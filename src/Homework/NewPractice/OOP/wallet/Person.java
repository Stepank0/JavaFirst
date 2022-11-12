package Homework.NewPractice.OOP.wallet;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;

    private List<Money> money;

    public Person(String name) {
        this.name = name;
        this.money = new ArrayList<Money>();

        Money rub = new Ruble(189.98);
        Money usd = new USD(24.54);
        Money uah = new Hryvnia(104.34);
        money.add(rub);
        money.add(usd);
        money.add(uah);
    }




    public String getName() {
        return name;
    }

    public List<Money> getMoney() {
        return money;
    }




}
