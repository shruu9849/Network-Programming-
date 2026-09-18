package lab2;

import java.net.InetAddress;

public class InetAddressFactoryExample {
    public static void main(String[] args) {
        try {
            InetAddress local = InetAddress.getLocalHost();

            System.out.println("Local Host Name: " + local);

            InetAddress named = InetAddress.getByName("www.google.com");
            System.out.println("Named Host Name: " + named);

            InetAddress[] all = InetAddress.getAllByName("www.google.com");
            for(InetAddress address : all) {
                System.out.println("All Address: " + address);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}