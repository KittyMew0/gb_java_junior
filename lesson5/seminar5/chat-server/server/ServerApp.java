package geekbrains_course.java_junior.lesson5.seminar5;

import java.io.IOException;
import java.net.ServerSocket;

public class ServerApp {
    public static void main(String[] args) {
        try {
            System.out.println("Start Server . . .");
            ServerSocket serverSocket = new ServerSocket(8889);
            Server server = new Server(serverSocket);
            server.runServer();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}