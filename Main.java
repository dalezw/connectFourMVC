package mvc;


public class Main {

c4Model game;
	
	public Main() {
		game=new c4Model();
	}
	
	private int[][] board = new int[6][7];
	private int turnCounter = 1;
	private boolean winCondition = game.winCondition();
	private int row, col;
	private int currentPlayer;
	
	

	while (game.winCondition == false) {
		if (turnCounter%2 == 0) {
			currentPlayer = 2;
		} else {
			currentPlayer = 1;
		}
		//get input from GUI on the column selected
		//set to column
		
		if (board[column][7] != 0) {
			
		}
		
		for(int i = 0; i < 7; i++) {
			if (board[column][i] == 0) {
				board[column][i] = currentPlayer;
				System.out.println("Piece added");
				break;
			}
		}
		
		
		if (winCondition == true) {  
			winCondition = true;
		} else if (turnCounter > 42) {  //No more moves can be made and the game results in a Draw
			winCondition = true;
		}
		turnCounter += 1;
	}
	
	if (turnCounter > 42 || game.winCondition()==true ) {
		System.out.println("Draw");
	} else if (turnCounter % 2 == 0) { //If the turnCounter is even then Player 2 won
		System.out.println("Player 2 Wins");
	} else {
		System.out.println("Player 1 Wins");
	}
}	
}

