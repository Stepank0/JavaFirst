package Homework.NewPractice.File;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import okhttp3.OkHttp;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.rmi.server.RemoteRef;
import java.util.List;
import java.util.Map;


public class File {

    public File(String s) {
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//
//        TerritoriesInfo territoriesInfo = new TerritoriesInfo("У Испании 6 провинций, у России 10 провинций, у Франции 8 провинций");
//        ResourcesInfo resourcesInfo = new ResourcesInfo("У Испании 100 золота, у России 80 золота, у Франции 90 золота");
//        DiplomacyInfo diplomacyInfo =  new DiplomacyInfo("Франция воюет с Россией, Испания заняла позицию нейтралитета");
//
//        SavedGame savedGame = new SavedGame(territoriesInfo, resourcesInfo, diplomacyInfo);
//
//        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\stepa\\OneDrive\\Рабочий стол\\Java\\JavaCore\\save.ser");
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
//
//        objectOutputStream.writeObject(savedGame);
//
//                System.out.println(savedGame);
//
//        objectOutputStream.close();

//----------------------------------------------------------------------------------------
//        urlConection ( );

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://geekbrains.ru")
                .build();

        Response response = client.newCall(request).execute();

        String body = response.body().string();

        System.out.println(response.code());
        System.out.println(response.headers());
        System.out.println(response.isRedirect());
        System.out.println(response.isSuccessful());
        System.out.println(response.protocol());
        System.out.println(response.receivedResponseAtMillis());





    }

    public static void urlConOkHttp() throws IOException {

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://geekbrains.ru")
                .build();

        Response response = client.newCall(request).execute();

        String body = response.body().string();

        System.out.println(response.code());
        System.out.println(response.headers());
        System.out.println(response.isRedirect());
        System.out.println(response.isSuccessful());
        System.out.println(response.protocol());
        System.out.println(response.receivedResponseAtMillis());





    }

    public static void urlConection ( ) throws IOException {
        URL url = new URL("https://mail.ru/");

        HttpsURLConnection hpCon = (HttpsURLConnection) url.openConnection();

        System.out.println(hpCon.getRequestMethod());
        System.out.println(hpCon.getResponseCode());
        System.out.println(hpCon.getResponseMessage());

        Map <String, List<String >> header = hpCon.getHeaderFields();
        for (String k : header.keySet()){
            System.out.printf("Ключ: %s, значение: %s \n", k, header.get(k));
        }

    }


}
