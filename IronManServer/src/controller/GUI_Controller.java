package controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class GUI_Controller extends Application {
	
	private TextArea textarea;
	
	


	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		
		Parent root = FXMLLoader.load(getClass().getResource("GUI_FILES/gui.fxml"));
		textarea= cons
		Scene scene = new Scene(root);
		
		primaryStage.initStyle(StageStyle.UNDECORATED);

		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	
	public void goRun() {
		launch();
	}
	
}