package Homework.NewPractice.Encryption;

import java.util.Arrays;

public class SimpleEncryption {

public static int[] cript(int[] data, int password){
    int result[] = new int[data.length];
    for (int i = 0; i < data.length; i++) {
        result[i] = data[i] ^ password;
    }
    return result;
}

    public static void main(String[] args) {
        int data [] = {3,5,12,34,2,4,67,100};
        int password = 199;

        //шифруем массив
        int[] encrypted = cript(data, password);
        System.out.println(Arrays.toString(encrypted));

        //расшифровываем массив
        int[] decrypted = cript(encrypted, password);
        System.out.println(Arrays.toString(decrypted));
    }


}
