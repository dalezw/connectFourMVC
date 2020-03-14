
public class Main {
	
	c4Model game;
	private int[][] board = new int[7][6];
	private int turnCounter = 1;
	private boolean winCondition  = game.winCondition();
	private int row, col, userChoice;
	private int currentPlayer;
	View view;
	
	
	while (winCondition == false) {
		if (turnCounter%2 == 0) {
			currentPlayer = 2;
		} else {
			currentPlayer = 1;
		}
		
		userChoice = view.getPlayerMove(currentPlayer);
		
		if (board[userChoice][6] != 0) {
			view.invalidMove();
		}
		
		for(int i = 0; i < 6; i++) {
			if (board[userChoice][i] == 0) {
				board[userChoice][i] = currentPlayer;
				System.out.println("Piece added");
				break;
			}
		}
		
		
		if (game.winCondition() == true) {
			winCondition = true;
		} else if (turnCounter > 42) {  //No more moves can be made and the game results in a Draw
			winCondition = true;
		}
		turnCounter += 1;
	}
	
	if (turnCounter > 42) {
		view.draw();
	} else if (turnCounter % 2 == 0) { //If the turnCounter is even then Player 2 won
		view.winner(2);
	} else {
		view.winner(1);
	}
	
}
}

