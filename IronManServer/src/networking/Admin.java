package networking;

import java.io.*;
import java.net.*;

public class Admin extends Thread{
	DatagramSocket serverSocket;
	byte[] receiveData;

	
	public Admin() throws SocketException {
		 serverSocket = new DatagramSocket(53172);
		 
		
	}
	
	public String[] scan() throws Exception {
		
		receiveData = new byte[1024];
		
		while (true) {
			DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
			serverSocket.receive(receivePacket);
			
			String data = new String(receivePacket.getData());
			System.out.println("RECEIVED: " + data);
			
			//InetAddress IPAddress = receivePacket.getAddress();
			//int port = receivePacket.getPort();
			
			String[] dates = data.split("/");
			return dates;
		}
	}
}