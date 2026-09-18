package lab2;

import java.net.*;

public class InetAddressGetterExample {
    public static void main(String[] args) {
        try {
            // Creating InetAddress object
            InetAddress address = InetAddress.getByName("www.google.com");

            // 1. getHostName()
            System.out.println("Hostname: " + address.getHostName());

            // 2. getHostAddress()
            System.out.println("IP Address: " + address.getHostAddress());

            // 3. getCanonicalHostName()
            System.out.println("Canonical Host Name: " + address.getCanonicalHostName());

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}