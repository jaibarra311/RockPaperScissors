package model;

import java.util.Scanner;

/**
 * @author jaiba - jaibarra
 * CIS175 - Fall 2021
 * Sep 7, 2021
 */
public class RockPaperScissors {
	
	
public static int player1;
public static int player2;
public static String winner = "TEST";
	
	public static void main(String [] args) {
	


}
	public static void calWinner(int player1, int player2) {
		if (player1 == 1 && player2 == 1) {
			winner = "Tie";	
		} else if(player1 == 1 && player2 == 2) {
			winner = "Player 2 wins";
		} else if(player1 == 1 && player2 == 3) {
			winner = "Player 1 wins";
		} else if(player1 == 2 && player2 == 2) {
			winner = "Tie";
		} else if(player1 == 2 && player2 == 3) {
			winner = "Player 2 wins";
		} else if(player1 == 3 && player2 == 3) {
			winner = "Tie";
		}
	}
}