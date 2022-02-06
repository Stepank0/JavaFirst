package Homework.SixthHW;

public abstract class Animals {

    protected String type;
    protected int moveMax;
    protected int swimMax;
    private static int count;


    public abstract void DistanceMove (int length);
    public abstract void DistanceSwim ( int length);

    public Animals(String type, int moveMax, int swimMax) {
        this.type = type;
        this.moveMax = moveMax;
        this.swimMax = swimMax;
        count++;
    }

    public static int getCount () {
        return count;
    }
}



