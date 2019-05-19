package controller;

import java.net.SocketException;
import java.util.Scanner;

import basic_operators.LengthFixedVector;
import parts_Arm.*;
import networking.*;
import parts.Part;

public class Input_Controller extends Thread {

	Admin admin;
	Main_Controller mainController;

	public Input_Controller() {
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
			usedV = aArm.getUpperArm();
			break;
		case "2":
			usedV = aArm.getForeArm();
			break;
		case "3":
			usedV = aArm.getHand();
			break;
		default:
			usedV = aArm.getUpperArm();
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

	public void decrypInput(String inpt) {
		Part originPart;
		
		String[] inputs = inpt.split("/");
		
		String talkingPart = inputs[0];
		
		String command = inputs[1];
		String subPart = inputs[2];
		String axis = inputs[3];
		double value = Double.parseDouble(inputs[4]);

		switch (talkingPart) {
		case "leftArm":
			originPart = mainController.getLeftArm();
			break;
		case "rightArm":
			originPart = mainController.getRightArm();
			break;
			
		default: originPart = mainController.getRightArm(); break;
		}
		
		
		
		
		
		
		switch(command) {
		case "moveCoordiate"
		
		
		}
		
		

	}

}