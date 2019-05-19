package gui;

import java.net.SocketException;
import java.util.Scanner;

import basic_operators.LengthFixedVector;
import basic_operators.Vector;
import networking.*;
import parts.*;


public class Input extends Thread {

	Main main;
	Arm arm;
	Admin admin;
	

	public Input(Main m, Arm aA) {
		main = m;
		arm = aA;
		try {
			admin = new Admin();
		} catch (SocketException e) {
			System.out.println("Socketproblem");
		}
	}

	public void run() {
		while (true) {
			try {
				workWithInput(arm, 100, 100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void workWithInput(Arm aArm, double startX, double startY) throws Exception {
		LengthFixedVector usedV;
		String[] input = admin.scan();
		
		switch (input[0]) {

		case "1":
			usedV = aArm.getUpperArm().getVector();
			break;
		case "2":
			usedV = aArm.getForeArm().getVector();
			break;
		case "3":
			usedV = aArm.getHand().getVector();
			break;
		default:
			usedV = aArm.getUpperArm().getVector();
		}

		switch (input[1]) {

		case "x":
			usedV.moveX(Double.parseDouble(input[2]));
			break;

		case "y":
			usedV.moveY(Double.parseDouble(input[2]));
			break;

		}
		main.refresh();

	}

	public String[] scanInput() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String inpt = scanner.nextLine();
		String[] inputs = inpt.split("/");
		return inputs;
	}

}
