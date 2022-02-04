package Homework.SixthHW;

    public class Cat extends Animals {
        private static int count;


        public Cat (String type, int moveMax, int swimMax) {
            super(type, moveMax, swimMax);
            count++;
        }

        public static int getCount () {
            return count;
        }

        @Override
        public void DistanceMove (int length) {

            if (length <= moveMax && length >= 0) {
                System.out.println(type + " run " + length + " m.");
            } else {
                System.out.println(type + " can only run " + moveMax + " meters instead of " + length );
            }

        }

        @Override
        public void DistanceSwim (int length) {
            System.out.println("Cats can’t swim at all, and " + length + " meters is even more");
        }



}
