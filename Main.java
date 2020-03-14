
public class Main {

	private int[][] board = new int[6][7];
	private int turnCounter = 1;
	private boolean winCondition = false;
	private int row, col;
	private int currentPlayer;
	
	
	while (winCondition == false) {
		if (turnCounter%2 == 0) {
			currentPlayer = 2;
		} else {
			currentPlayer = 1;
		}
		//get input from GUI on the column selected
		//set to column
		
		if (board[column][7] != 0) {
			//column filled, try again
		}
		
		for(int i = 0; i < 7; i++) {
			if (board[column][i] == 0) {
				board[column][i] = currentPlayer;
				System.out.println("Piece added");
				break;
			}
		}
		
		
		if (checkWin() == true) {  //Not an actual method yet
			winCondition = true;
		} else if (turnCounter > 42) {  //No more moves can be made and the game results in a Draw
			winCondition = true;
		}
		turnCounter += 1;
	}
	
	if (turnCounter > 42) {
		//Draw
	} else if (turnCounter % 2 == 0) { //If the turnCounter is even then Player 2 won
		//Player 2 Wins
	} else {
		//Player 1 Wins
	}
	
}

