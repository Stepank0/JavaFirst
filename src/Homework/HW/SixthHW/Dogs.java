package Homework.HW.SixthHW;

    public class Dogs extends Animals {

        private static int count;


    public Dogs (String type, int moveMax, int swimMax) {
        super(type, moveMax, swimMax);
        count++;
    }

    public static int getCount () {
        return count;
    }

    @Override
    public void DistanceMove (int length) {
        if ( (length >= 0) && (length <= moveMax)) {
            System.out.println(type + " run " + length + " m.");
        } else {
            System.out.println(type + " can only run " + moveMax + " meters instead of " + length );
        }
    }


    @Override
    public void DistanceSwim (int length) {

        if ( (length >= 0) && (length <= swimMax)) {
            System.out.println(type + " swim " + length + " m.");
        } else {
            System.out.println(type + " can only run " + swimMax + " meters instead of " + length );
        }
    }
}