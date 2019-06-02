package networking;

import java.net.*;

public class Admin extends Thread{
	DatagramSocket serverSocket;
	byte[] receiveData;
	
	public Admin() throws SocketException {
		 serverSocket = new DatagramSocket(50505);
		 
		
	}
	
	public String[] scan() throws Exception {
		
		receiveData = new byte[1024];
		
		while (true) {
			DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
			serverSocket.receive(receivePacket);
			
			String data = new String(receivePacket.getData());
			System.out.println("RECEIVED: " + data);

			String[] dates = data.split("/");
			return dates;
		}
	}
}