package com.zetcode;

import javax.swing.JFrame;
import java.awt.EventQueue;


public class SnakeGame extends JFrame{
	
	public SnakeGame() {
        
        initUI();
    }
    
    private void initUI() {
        
    	Board board = new Board();
        add(board);
        board.StartTheGame();
        
        setResizable(false);
        pack();
        
        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
