package Homework.NewPractice.LambdaExpressions.thirdTack;

public class Discriminant {

    public static void main(String[] args) {

        thirdFunctionalInterface tfi = ((a, b, c) -> (Math.pow(b, 2)) - (4*a)*c);

        double a = 4.1;
        double b = -2.0;
        double c = 3.7;

        double result = tfi.decision(a, b, c);
        System.out.println(result);


    }
}
