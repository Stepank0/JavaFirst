package Homework.HW.FifthHW;

public class Employee {
    private static final int year = 2021;

    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    // конструктор класса
    public Employee(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }


    int getAge() {
        return age;

    }

    String getInfo () {
        return this.fullName + "\n" +
                this.position + "\n" +
                this.email + "\n" +
                this.phone + "\n" +
                this.salary + "$" + "\n" +
                this.getAge();
    }
}
