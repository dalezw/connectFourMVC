
public class Main {

	private int[][] board = new int[6][7];
	private int turnCounter = 0;
	private boolean winCondition = false;
	
	
	while (winCondition == false) {
		
		
		
		
		turnCounter += 1;
		if (checkWin() == true) {  //Not an actual method yet
			winCondition = true;
		} else if (turnCounter > 42) {  //No more moves can be made and the game results in a Draw
			winCondition = true;
		}
	}
	
	if (turnCounter > 42) {
		//Draw
	} else if (turnCounter % 2 == 0) { //If the turnCounter is even then Player 2 won
		//Player 2 Wins
	} else {
		//Player 1 Wins
	}
	
}
}
