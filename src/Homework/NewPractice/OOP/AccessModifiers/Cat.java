package Homework.NewPractice.OOP.AccessModifiers;

public class Cat {

    protected String getName() {
        return "Vasili";
    }

    public Cat parent;

    public Cat getMyParent() {
        return this.parent;
    }

    public void setMyParent(Cat cat){
        this.parent = cat;
    }
}
