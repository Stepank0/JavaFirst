package Homework.HWJavaCore3;

abstract class Fruit {
    private Float weight;
    private String name;

    public Fruit(Float weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public float getWeight() {

        return weight;
    }

    public String getName() {
        return name;
    }
}
