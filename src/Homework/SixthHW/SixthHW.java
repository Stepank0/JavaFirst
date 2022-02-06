package Homework.SixthHW;

public class SixthHW {

    static int count = 0;

    public static void main(String[] args) {

// решил реализовать чтобы у каждого отдельного животного были свои ограничения по бегу и плаванию.
//ну и раз мы на уроке разобрали массив, сделал в массиве для тренирвки.

        Animals[] animals = new Animals[5];
            animals[0] = new Cat("MaineCoon", 200, 0);
            animals[1] = new Dogs("JackRussellTerrier",500, 10);
            animals[2] = new Cat("Himalayan cat", 250, 0);
            animals[3] = new Dogs("Pudel",400, 7);
            animals[4] = new Dogs("Bulldog",450, 12);

            animals[0].DistanceMove(200);
            animals[0].DistanceSwim(3);

            animals[3].DistanceMove(1000);
            animals[3].DistanceSwim(0);

        System.out.println("Всего котов создано: " + (Cat.getCount()));
        System.out.println("Всего собак создано: " + (Dogs.getCount()));
        System.out.println("Всего животных создано: " + (Animals.getCount()));




    }
}
