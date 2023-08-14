package Practice;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client extends JFrame{
    Socket socket;
    BufferedReader reader;
    PrintWriter writer;

    public Client() {
        try {
            System.out.println("Sending request to server...");
            socket = new Socket("127.0.0.1", 6666);
            System.out.println("Connection established");
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = new PrintWriter(socket.getOutputStream());

            read();
            write();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void write() {
        Runnable runnable = () -> {
            System.out.println("Writer started");
            try {
                while (true) {
                    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
                    String message = read.readLine();
                    writer.println(message);
                    writer.flush();
                    if(message.equals("exit")){
                        socket.close();
                        break;
                    }
                }

            } catch (Exception e) {
                System.out.println("Socket Connection terminated");
            }
            System.out.println("Connection Closed");
        };
        new Thread(runnable).start();
    }

    private void read() {
        Runnable runnable = () -> {
            try {
                while (!socket.isClosed()) {
                    String message = reader.readLine();
                    if (message.equals("exit")) {
                        System.out.println("Server terminated the chat");
                        socket.close();
                        break;
                    }
                    System.out.println("Server - " + message);
                }
            } catch (IOException e) {
                System.out.println("Socket Connection closed");
            }
        };
        new Thread(runnable).start();
    }

    public static void main(String[] args) {
        System.out.println("Client Started...");
        new Client();
    }
}
