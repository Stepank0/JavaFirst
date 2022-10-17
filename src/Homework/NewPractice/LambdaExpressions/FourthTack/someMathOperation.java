package Homework.NewPractice.LambdaExpressions.FourthTack;

import Homework.NewPractice.LambdaExpressions.thirdTack.thirdFunctionalInterface;

public class someMathOperation {

    public static void main(String[] args) {

        thirdFunctionalInterface tfi = ((a, b, c) -> a * (Math.pow(b, c)));
        double a = 3;
        double b = 4;
        double c = 5;

        double result = tfi.decision(a, b, c);
        System.out.println(result);

    }
}
