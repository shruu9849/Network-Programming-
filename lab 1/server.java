//server//



import java.io.*;
import java.net.*;

public class server {
    public static void main(String[] args) {
        try {
            // Create server socket on port 5000
            ServerSocket serverSocket = new ServerSocket(5000);

            System.out.println("Server is waiting for client...");

            // Accept client connection
            Socket socket = serverSocket.accept();

            // Read message from client
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            String message = in.readLine();

            // Display received message
            System.out.println("Message from client: " + message);

            // Close connections
            in.close();
            socket.close();
            serverSocket.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}