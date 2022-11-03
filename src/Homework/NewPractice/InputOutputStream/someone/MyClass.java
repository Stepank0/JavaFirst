package Homework.NewPractice.InputOutputStream.someone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyClass {
    private List<Integer> list = new ArrayList<>(Arrays.asList(111, 222, 333, 444));

    public void write(int data)
    {
        list.add(data);
    }

    public int read()
    {
        int first = list.get(0);
        list.remove(0);
        return first;
    }

    public int available()
    {
        return list.size();
    }
}
