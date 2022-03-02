package Homework.NewPractice;

public class Generalization2 <T extends Number>{
    private T[] nums;

    public Generalization2(T... nums) {
        this.nums = nums;
    }

    public double avg () {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }
        return sum / nums.length;

    }
    public boolean sameAvg(Generalization2<?> another) {
        return Math.abs(this.avg() - another.avg()) < 0.0001;
    }

    public static class BoxWithNumbersDemoApp {
        public static void main(String[] args) {
            Generalization2<Integer> iBoxWithNumbers = new Generalization2<>(1, 2, 3, 4, 5);
            System.out.println("Среднее iBoxWithNumbers = " + iBoxWithNumbers.avg());


            Generalization2<Double> dBoxWithNumbers = new Generalization2<>(1.1, 2.2, 3.3, 4.4, 5.5);
            System.out.println("Среднее dBoxWithNumbers = " + dBoxWithNumbers.avg());


            Generalization2<Float> fBoxWithNumbers = new Generalization2<>(1.0f, 2.0f, 3.0f, 4.0f, 5.0f);
            System.out.println("Среднее fBoxWithNumbers = " + fBoxWithNumbers.avg());

            System.out.print("Средние iBoxWithNumbers и dBoxWithNumbers ");
            if (iBoxWithNumbers.sameAvg(dBoxWithNumbers)) {
                System.out.println("равны");
            } else {
                System.out.println("отличаются");
            }

            System.out.print("Средние iBoxWithNumbers и fBoxWithNumbers");
            if (iBoxWithNumbers.sameAvg(fBoxWithNumbers)) {
                System.out.println("равны");
            } else {
                System.out.println("отличаются");
            }

        }

    }
}
