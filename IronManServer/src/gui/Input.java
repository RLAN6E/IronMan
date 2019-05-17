package gui;

import java.util.Scanner;

import basic_operators.LengthFixedVector;
import basic_operators.Vector;
import javafx.scene.layout.Pane;
import parts_Arm.*;

public class Input extends Thread {

	Main main;
	Arm arm;

	public Input(Main m, Arm aA) {
		main = m;
		arm = aA;

	}

	public void run() {
		while (true) {
			workWithInput(arm, 100, 100);
		}
	}

	public void workWithInput(Arm aArm, double startX, double startY) {
		LengthFixedVector usedV;
		String[] input = this.scanInput();
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

	public String[] scanInput() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String inpt = scanner.nextLine();
		String[] inputs = inpt.split("/");
		return inputs;
	}

}
