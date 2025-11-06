//server 

import java.net.*;
import java.io.*;
import java.util.Scanner;


public class Server {
   public static void main(String args[]) throws Exception {
        DatagramSocket serverSocket = new DatagramSocket();
        InetAddress clientIp = InetAddress.getByName("localhost");
        Scanner sc = new Scanner(System.in);
        System.out.println("Server Started, Type Message for client : ");
        while(true) {
           String msg = sc.nextLine(); 
           byte[] sendData = msg.getBytes();
           DatagramPacket sendPackets = new DatagramPacket(sendData,sendData.length,clientIp,9876);
           serverSocket.send(sendPackets);
           if(msg.equalsIgnoreCase("bye")) 
                break;
        }
        serverSocket.close();
   }
}
        