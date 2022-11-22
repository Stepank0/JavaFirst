package Homework.NewPractice.OOP.AccessModifiers;

public class example {

    public static void main(String[] args) {
//        expandingVisibility();

        Cat cat = new Cat();

        Cat me = new Cat();
        me.setMyParent(cat.parent);
        Cat myParent = me.getMyParent();

        Tiger parent = new Tiger();
        Cat meaw = new Tiger();
        meaw.setMyParent(parent);
        Cat MyPar = meaw.getMyParent();





    }

    public static void expandingVisibility(){
        Cat cat = new Cat();
        System.out.println(cat.getName());
        Tiger tiger = new Tiger();
        System.out.println(tiger.getName());
        Cat catTiger = new Tiger();
        System.out.println(catTiger.getName());
    }
}
