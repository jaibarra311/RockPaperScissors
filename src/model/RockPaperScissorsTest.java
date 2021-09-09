package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author jaiba - jaibarra
 * CIS175 - Fall 2021
 * Sep 7, 2021
 */
public class RockPaperScissorsTest {

	
	
	
	
	@Before
	public void setUp() throws Exception {
	}

	
	@Test
	public void RockPaperScissors_Player2Wins() {
		RockPaperScissors test1 = new RockPaperScissors();
		test1.calWinner(1, 2);
		assertEquals("Player 2 wins", test1.winner);
		
	}
	@Test
	public void RockPaperScissors_Player1Wins() {
		RockPaperScissors test2 = new RockPaperScissors();
		test2.calWinner(1, 3);
		assertEquals("Player 1 wins", test2.winner);

}
	@Test
	public void RockPaperScissors_Tie() {
		RockPaperScissors test3 = new RockPaperScissors();
		test3.calWinner(1, 2);
		assertEquals("Player 2 wins", test3.winner);
}
	
}