package Tests;
import model.RockPaperScissors;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author jaiba - jaibarra
 * CIS175 - Fall 2021
 * Sep 9, 2021
 */
public class Player2Test {
    @Test
    public void RockPaperScissors() {
        RockPaperScissors game = new RockPaperScissors();
    	game.calWinner(1, 3);
		assertEquals("Player 1 wins", game.winner);
    }
}