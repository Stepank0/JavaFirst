package Homework.NewPractice.PractException;

import java.util.Arrays;

public class getStackTrace {

    public static void main(String[] args) {
        test();

    }

    public static void test (){
        Thread current = Thread.currentThread();
        StackTraceElement[] method = current.getStackTrace();
        for (StackTraceElement info : method){
            System.out.println(info.getClassName());
            System.out.println(info.getFileName());
            System.out.println(info.getLineNumber());
            System.out.println(info.getMethodName());
            System.out.println(info.isNativeMethod());
        }
    }
}
