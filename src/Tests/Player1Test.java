package Tests;
import model.RockPaperScissors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * @author jaiba - jaibarra
 * CIS175 - Fall 2021
 * Sep 9, 2021
 */


	public class Player1Test {
	    @Test
	    public void RockPaperScissors() {
	        RockPaperScissors game = new RockPaperScissors();
	        game.calWinner(1, 2);
			assertEquals("Player 2 wins", game.winner);
	    }
	}

	