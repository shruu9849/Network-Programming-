import java.net.InetAddress;
import java.util.Arrays;

public class Inet {
    public static void main(String[] args) {
        try {
            // Creating InetAddress object
            InetAddress address = InetAddress.getByName("www.google.com");

            // get host name
            System.out.println("Hostname: " + address.getHostName());

            // get host address
            System.out.println("IP Address: " + address.getHostAddress());

            // get Canonical Host Name
            System.out.println("Canonical Host Name: " + address.getCanonicalHostName());

            // get Address
            System.out.println("IP Address bytes: " + Arrays.toString(address.getAddress()));
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}