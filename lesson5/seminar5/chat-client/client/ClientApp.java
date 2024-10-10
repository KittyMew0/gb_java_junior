package geekbrains_course.java_junior.lesson5.seminar5;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientApp {
    public static void main(String[] args) {
        try {
            System.out.println("Start Client . . .");
            Scanner scanner = new Scanner(System.in);
            System.out.println("������� ��� �������: ");
            String name = scanner.nextLine();
            Socket socket = new Socket("localhost", 8889);
            Client client = new Client(socket, name);
            InetAddress inetAddress = socket.getInetAddress();
            System.out.println("InetAddress: " + inetAddress);
            String remoteIp = inetAddress.getHostAddress();
            System.out.println("RemoteIP: " + remoteIp);
            System.out.println("LocalPort: " + socket.getLocalPort());

            client.listenForMessage();
            client.sendMessage();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}