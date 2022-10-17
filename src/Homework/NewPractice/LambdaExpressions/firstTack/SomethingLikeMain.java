package Homework.NewPractice.LambdaExpressions.firstTack;

public class SomethingLikeMain {

    public static void main(String[] args) {

        MyFunctionalInterface lambda = x -> x % 13 == 0;

        int i =256;
        boolean result = lambda.mySupperMethod(i);
        System.out.println(result);

    }
}
