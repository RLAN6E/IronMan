package controller;

import java.net.SocketException;
import java.util.Scanner;

import basic_operators.LengthFixedVector;
import parts.*;
import networking.*;

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
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}