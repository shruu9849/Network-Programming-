package lab2;
import java.net.*;
import java.net.UnknownHostException;


public class AddressTypeExamples{
public static void main (String[] args){
    try{
        InetAddress [] addresses = {
            InetAddress.getByName("0.0.0.0"),
            InetAddress.getByName("127.0.0.1"),
            InetAddress.getByName("244.0.0.1"),
            InetAddress.getByName("FF02::1"),
            InetAddress.getByName("FF02::1"),
            InetAddress.getByName("FF02::1"),
        };
    for(InetAddress address : addresses){
        System.out.println("\nAddress:"+address.getHostAddress());
        System.out.println("Any Local:"+address.isAnyLocalAddress());
        System.out.println("Loopback:"+address.isLoopbackAddress());
        System.out.println("Link Local:"+address.isLinkLocalAddress());
        System.out.println("Site Local:"+address.isSiteLocalAddress());
        System.out.println("Multicast:"+address.isMulticastAddress());
        System.out.println("Mc Global:"+address.isMCGlobal());
        System.out.println("MC Organization:"+address.isMCOrgLocal());
        System.out.println("MC Site Local:"+address.isMCSiteLocal());
        System.out.println("MC Link Local:"+address.isMCLinkLocal());
        System.out.println("Mc Node Local:"+address.isMCNodeLocal());
    } 
    }catch (UnknownHostException e){
    System.out.println(e);
}
}
}

