package controller;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

@SuppressWarnings("rawtypes")
public class GUI_Controller_Handler implements EventHandler {
	
	@FXML
	public TextArea console;
	
	@Override
	public void handle(Event arg0) {

	}
	
	public void println(String s) {
		console.setText(s);
	}

	public void handle_buttonClose(ActionEvent event) {
		System.exit(0);
	}

	public void handle_buttonMinimize(ActionEvent event) {

	}

	public void handle_buttonSize(ActionEvent event) {

	}
}
