package lab2;
import java.net.InetAddress;

public class ReachabilityExample {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("www.google.com");
            boolean result = address.isReachable(5000); // Timeout in milliseconds
            System.out.println("Host: " + address.getHostName());
            System.out.println("Reachable: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}