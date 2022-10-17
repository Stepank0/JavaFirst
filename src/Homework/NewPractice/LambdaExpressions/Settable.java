package Homework.NewPractice.LambdaExpressions;

public interface Settable <C extends WithNameAndAge> {

    void set(C entry, String name, int age);

}
