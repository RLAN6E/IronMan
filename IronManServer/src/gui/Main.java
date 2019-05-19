package gui;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import parts.*;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

public class Main extends Application {
	Arm leftArm;

	Line upperArm;
	Line foreArm;
	Line hand;

	Pane root;
	Scene scene;
	Stage stage;

	public boolean reload;

	@Override
	public void start(Stage primaryStage) {

		stage = primaryStage;
		leftArm = new Arm(400, 300, 190);

		try {
			Input inpt = new Input(this, leftArm);

			inpt.start();
			root = new Pane();

			upperArm = new Line();
			foreArm = new Line();
			hand = new Line();

			upperArm.setStroke(Color.RED);
			upperArm.setStrokeWidth(5);

			foreArm.setStroke(Color.GREEN);
			foreArm.setStrokeWidth(5);

			hand.setStroke(Color.BLUE);
			hand.setStrokeWidth(5);

			run();
			root.getChildren().addAll(upperArm, foreArm, hand);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

	public void run() {
		drawArm(leftArm, 100, 100);
		scene = new Scene(root, 1000, 1000);
		stage.setScene(scene);
		stage.show();
	}

	public void drawArm(Arm arm, double startX, double startY) {
		
		double endUpperArmX = arm.getUpperArm().getEndpoint().getCorrd(0);
		double endUpperArmY = arm.getUpperArm().getEndpoint().getCorrd(1);
		double endForeArmX = arm.getForeArm().getEndpoint().getCorrd(0);
		double endForeArmY = arm.getForeArm().getEndpoint().getCorrd(1);
		double endHandX = arm.getHand().getEndpoint().getCorrd(0);
		double endHandY = arm.getHand().getEndpoint().getCorrd(1);

		System.out.println("-----------------------------------");
		System.out.println("UPPERARM  " + arm.getUpperArm().getEndpoint().toString());
		System.out.println("-----------------------------------");
		System.out.println("FOREARM   " + arm.getForeArm().getEndpoint().toString());
		System.out.println("-----------------------------------");
		System.out.println("HAND      " + arm.getHand().getEndpoint().toString());
		System.out.println("-----------------------------------");

		endUpperArmX += startX;
		endUpperArmY += startY;
		endForeArmX += startX;
		endForeArmY += startY;
		endHandX += startX;
		endHandY += startY;

		upperArm.setStartX(startX);
		upperArm.setStartY(startY);
		upperArm.setEndX(endUpperArmX);
		upperArm.setEndY(endUpperArmY);
		
		foreArm.setStartX(endUpperArmX);
		foreArm.setStartY(endUpperArmY);
		foreArm.setEndX(endForeArmX);
		foreArm.setEndY(endForeArmY);
		
		hand.setStartX(endForeArmX);
		hand.setStartY(endForeArmY);
		hand.setEndX(endHandX);
		hand.setEndY(endHandY);

		System.out.println("drawn");
	}

	public void refresh() {
		Platform.runLater(new Runnable() {
			public void run() {
				drawArm(leftArm, 100, 100);
			}
		});
	}
}