package Homework.NewPractice.File;

import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class File {

    public File(String s) {
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        TerritoriesInfo territoriesInfo = new TerritoriesInfo("У Испании 6 провинций, у России 10 провинций, у Франции 8 провинций");
        ResourcesInfo resourcesInfo = new ResourcesInfo("У Испании 100 золота, у России 80 золота, у Франции 90 золота");
        DiplomacyInfo diplomacyInfo =  new DiplomacyInfo("Франция воюет с Россией, Испания заняла позицию нейтралитета");

        SavedGame savedGame = new SavedGame(territoriesInfo, resourcesInfo, diplomacyInfo);

        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\stepa\\OneDrive\\Рабочий стол\\Java\\JavaCore\\save.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        objectOutputStream.writeObject(savedGame);

                System.out.println(savedGame);

        objectOutputStream.close();

//----------------------------------------------------------------------------------------



    }


}
