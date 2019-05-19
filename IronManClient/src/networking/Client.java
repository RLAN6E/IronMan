package networking;

import java.net.*;
import java.util.Scanner;

public class Client {
	private DatagramSocket clientSocket;
	private InetAddress IPAddress;
	
	public Client() throws Exception {
		 clientSocket = new DatagramSocket();
		 IPAddress = InetAddress.getByName("localhost");
		 
	}

	public void send() throws Exception {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String inpt = scanner.nextLine();
		byte[] sendData = new byte[1024];
		sendData = inpt.getBytes();
		DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 53172);
		clientSocket.send(sendPacket);
		System.out.println(inpt+"...gesendet");
	}
	
	public void quit() {
		clientSocket.close();
		System.exit(0);
	}
}