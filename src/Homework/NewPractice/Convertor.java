package Homework.NewPractice;

import java.util.Scanner;

public class Convertor {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) throws InterruptedException {
        int decimalNumber = 21;
        System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
        int decimalNumber2 = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber2 + " равно двоичному числу " + toBinary(decimalNumber2));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
        int decimalNumber3 = 2545;
        System.out.println("Десятичное число " + decimalNumber3 + " равно шестнадцатеричному числу " + toHex(decimalNumber3));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal2(hexNumber));
        String binaryNumber2 = "100111010000";
        System.out.println("Двоичное число " + binaryNumber2 + " равно шестнадцатеричному числу " + toHexByBinary(binaryNumber2));
        String hexNumber2 = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber2 + " равно двоичному числу " + toBinaryByHex(hexNumber2));


    }

// конвертировать шеснацатиричное число в двоичное
public static String toBinaryByHex(String hexNumber) {
    //напишите тут ваш код
    if (hexNumber == null || hexNumber.equals("")) return "";
    Scanner scanner = new Scanner(hexNumber);
    String validationResult = scanner.findInLine("[^0123456789abcdef]");
    if (validationResult != null){
        return "";
    }
    long dec = 0;
    for (int i = 0; i < hexNumber.length(); i++){
        dec = 16*dec + HEX.indexOf(hexNumber.charAt(i));
    }

    String binNumber="";
    while (dec!=0){
        binNumber=(dec%2)+binNumber;
        dec=dec/2;
    }
    return binNumber;
}

//конвертировать двоичное число в шеснацатиричное
    public static String toHexByBinary(String binaryNumber) {
        if (binaryNumber == "" || binaryNumber == null){
            return "";
        }
        for (int i = 0; i < binaryNumber.length(); i++) {
            if (binaryNumber.charAt(i) == '1' || binaryNumber.charAt(i) == '0') {
            } else {
                return "";
            }
        }
        int b =0;
        for (int i = 0; i < binaryNumber.length(); i++){
            int number = binaryNumber.charAt(binaryNumber.length() - 1 - i) == '1' ? 1 : 0;
            b =(int) (b + (number * (Math.pow(2, i))));
        }

        String hexNumber = "";
        String x = "";
        if (b <= 0 ) {
            return hexNumber;
        }
        while (b !=0){
            int index = b%16;
            hexNumber = String.valueOf(HEX.charAt(index));
            x = hexNumber + x;
            b/=16;
        }
        return x;
    }

    // конвертор из шеснацатиричное цисло в десятичное
    public static int toDecimal2(String hexNumber) {
        //напишите тут ваш код
            if(hexNumber == null || hexNumber == ""){
                return 0;
        }
        int decimal = 0;
        for(int i = 0; i < hexNumber.length(); i++){
            decimal = 16 * decimal + Character.getNumericValue(hexNumber.charAt(i));
        }


        return decimal;
    }

//конвертор из десятиричного числа в шестнацатиричное число
    public static String toHex(int decimalNumber) {
        //напишите тут ваш код
        String hexNumber = "";
        String x = "";
            if (decimalNumber <= 0 ) {
            return hexNumber;
        }
        while (decimalNumber !=0){
            int index = decimalNumber%16;
            hexNumber = String.valueOf(HEX.charAt(index));
             x = hexNumber + x;
            decimalNumber/=16;

        }
        return x;
    }


// Ковертор из двоичного представления числа в десятичное
    public static int toDecimal(String binaryNumber) {
        //напишите тут ваш код
        if( binaryNumber ==null || binaryNumber == ""){
            return 0;
        }
        int b =0;
        for (int i = 0; i < binaryNumber.length(); i++){
            int number = binaryNumber.charAt(binaryNumber.length() - 1 - i) == '1' ? 1 : 0;
            b =(int) (b + (number * (Math.pow(2, i))));
        }
        return b;
    }
//конвертор из десятичного числа в двоичное
    public static String toBinary(int decimalNumber){
        String result = "";
        if(decimalNumber <=0 ){
            return "";
        }
        while (decimalNumber !=0){
            result = String.valueOf((decimalNumber%2) + result);
            decimalNumber /= 2;
        }
        return result;
    }
// конвертор из восмеричного числа в десятиричное
    public static int toDecimal(int octalNumber) {
        //напишите тут ваш код
        int i = 0;
        int result = 0;
        int x =0;

        if( octalNumber % 1 !=0 || octalNumber <= 0){
            return 0;
        }
        while (octalNumber !=0){
           x = octalNumber%10;
           octalNumber /= 10;
           x = (int) (x * (Math.pow(8,i)));
           result = result + x;
           i++;
        }
        return result;
    }

//конвертор из десятиричногого числа в восмеричное
    public static int toOctal(int decimalNumber) {
        //напишите тут ваш код
        int result = 0;
        int ost = 0;
        String d = "";
        String s;
        if( decimalNumber % 1 !=0 || decimalNumber <= 0){
            return 0;
        }
        while ( decimalNumber % 8 !=0 ){
            result = decimalNumber / 8;
            ost = decimalNumber % 8;
            decimalNumber = result;
            s = String.valueOf(ost);
            d += s;
        }
        result = Integer.parseInt(d);
        int mirror=0;
        while (result !=0){
            mirror = mirror*10 + ( result % 10);
            result /= 10;
        }
        return mirror;
    }
}
