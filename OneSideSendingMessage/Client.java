//client side 

import java.net.*;
import java.io.*;

public class Client {
   public static void main(String args[]) throws Exception {
       DatagramSocket clientSocket = new DatagramSocket(9876);
       byte[] receiveData = new byte[1024];
       System.out.println("Client Waiting for Server Message ");
       while(true) {
          DatagramPacket receivePacket = new DatagramPacket(receiveData,receiveData.length);
          clientSocket.receive(receivePacket);
          String msg = new String(receivePacket.getData(),0,receivePacket.getLength());
          System.out.println("Server Message: " + msg);
          if(msg.equalsIgnoreCase("bye"))
              break;
       }
       clientSocket.close();
   }
}
       