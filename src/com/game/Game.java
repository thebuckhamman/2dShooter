package com.game;

import javax.swing.JFrame;

/**
 * Used to create the window and start the game
 * @author goofybud16
 *
 */
public class Game {

	/**
	 * Main method
	 * @param args command line arguments
	 */
	public static void main(String[] args)
	{
		JFrame window = new JFrame("2D Shooter");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		window.setContentPane(new GamePanel());

		window.pack();
		window.setVisible(true);
	}

}
