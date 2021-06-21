package com.zetcode;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {	 
			EventQueue.invokeLater(() -> {
	            JFrame ex = new SnakeGame();
	            ex.setVisible(true);
	        });	 	             
	}
}
