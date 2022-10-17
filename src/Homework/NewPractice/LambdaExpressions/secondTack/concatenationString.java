package Homework.NewPractice.LambdaExpressions.secondTack;

public class concatenationString {

    public static void main(String[] args) {

        SecondFunctionalInterface secondFunctionalInterface = ((o1, o2) -> o1.length() > o2.length() ? o1 : o2);

        String first = "hello";
        String second = "translation";
        String result = secondFunctionalInterface.line(first, second);
        System.out.println(result);


    }
}
