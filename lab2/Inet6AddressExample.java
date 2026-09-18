package lab2;

import java.net.Inet6Address;

public class Inet6AddressExample {
    public static void main(String[] args) {
        try {
            Inet6Address ip = (Inet6Address) Inet6Address.getByName("2001:db8::1");

            System.out.println("HostName: " + ip.getHostName());

            System.out.println("IPv6 Address: " + ip.getHostAddress());
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
