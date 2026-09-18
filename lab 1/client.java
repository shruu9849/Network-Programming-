//Client//



import java.io.*;
import java.net.*;

public class client {
    public static void main(String[] args) {
        try {
            // Connect to server
            Socket socket = new Socket("localhost", 5000);

            // Send message to server
            PrintWriter out = new PrintWriter(
                    socket.getOutputStream(), true);

           out.println("Hello Server! This is a message from Client.");

            System.out.println("Message sent to server.");

            // Close connection
            out.close();
            socket.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}