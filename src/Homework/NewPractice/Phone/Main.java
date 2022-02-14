package Homework.NewPractice.Phone;

public class Main {

    public static void main(String[] args) {

        Phone nokia = new Phone("NOKIA", 1234, 120 );
        Phone iphone = new Phone("IPHONE", 4321, 130 );
        Phone lg = new Phone("LG", 3241, 140 );

        nokia.information();
        iphone.information();
        lg.information();

        nokia.receiveCall("nokia");
        iphone.receiveCall("iphone");
        lg.receiveCall("LG");

        Phone nokiaLight = new Phone("NOKIA", 1234);
        nokiaLight.information();

        nokiaLight.receiveCall("NOKIA", 1234);


    }
}
