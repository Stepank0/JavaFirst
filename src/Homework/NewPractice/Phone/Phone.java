package Homework.NewPractice.Phone;

import java.util.Objects;

public class Phone {
    private String model;
    private int number;
    private int weight;


    public Phone() {

    }
    public Phone (String model, int number) {
        this.model = model;
        this.number = number;
    }

    public Phone(String model, int number, int weight) {
        this.model = model;
        this.number = number;
        this.weight = weight;

    }

    public String getModel() {
        return model;
    }

    public int getNumber() {
        return number;
    }

    public int getWeight() {
        return weight;
    }

    public void information () {
        System.out.println("This phone model > " + model + "\n It have number > " + number + "\n It have weight > " + weight);
    }

    public String receiveCall (String callerName) {
        String receive = " Звонит " + callerName + " number " + getNumber();
        System.out.println(receive);
        return receive ;
    }

    public String receiveCall (String callerName, int number) {
        String receive = " Звонит " + callerName + " number " + number;
        System.out.println(receive);
        return receive ;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Phone)) return false;
        Phone phone = (Phone) o;
        return getNumber() == phone.getNumber() && getWeight() == phone.getWeight() && getModel().equals(phone.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModel(), getNumber(), getWeight());
    }
}
