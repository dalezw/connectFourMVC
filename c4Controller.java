
public class c4Controller {

	static c4Model game = new c4Model();
	static c4View view = new c4View();

	public static void main(String[] args) {


		int[][] board = new int[7][6];  //2D array that holds the values of the pieces
		int turnCounter = 1;
		boolean winCondition = false;
		int row, col, userChoice;
		int currentPlayer;



		while (winCondition == false) {
			if (turnCounter%2 == 0) {   //If the turn counter is even then it's player 2's turn
				currentPlayer = 2;
			} else {
				currentPlayer = 1;   //Odd is Player 1 
			}

			userChoice = view.getPlayerMove(currentPlayer) - 1;  //Subtract by one so that it's set back to 0 first notation

			if (board[userChoice][5] != 0) {  //If the column is full
				view.invalidMove();
			}

			for(int i = 0; i < 6; i++) {
				if (board[userChoice][i] == 0) {
					board[userChoice][i] = currentPlayer;	//Add piece from the View to board
					break;
				}
			}


			if (game.winCondition() == true) {
				winCondition = true;
			} else if (turnCounter > 42) {  //No more moves can be made and the game results in a Draw
				winCondition = true;
			}
			turnCounter += 1;
			view.displayBoard(board);
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

