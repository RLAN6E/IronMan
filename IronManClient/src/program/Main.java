package program;
import networking.*;

public class Main{


	public Main() {
		

	}

	public static void main(String[] args) throws Exception {
		Client client= new Client();
		while(true) {
			client.send();
		}
	}


}
