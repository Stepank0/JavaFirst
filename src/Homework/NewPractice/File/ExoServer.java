package Homework.NewPractice.File;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ExoServer {

    public static void main(String[] args) throws IOException {

        Socket socket = null;
         try(ServerSocket serverSocket = new ServerSocket(8189)) {
             System.out.println("Сервер запущен ожидаем подключения");
             socket = serverSocket.accept();
             System.out.println("Клиенит подключился.");
             DataInputStream in = new DataInputStream(socket.getInputStream());
             DataOutputStream out = new DataOutputStream(socket.getOutputStream());
             while (true) {
                 String str = in.readUTF();
                 if(str.equals("/end")) {
                     break;
                 }
                 out.writeUTF("Эхо: " + str);
             }
         }


    }
}
