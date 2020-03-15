import java.util.Scanner;

public class c4View {

	Scanner userInput = new Scanner(System.in);
	int currentPlayer;
	
	public c4View() {
		//constructor
	}
	
	public void displayBoard(int[][] board) {  //Prints current state of board
		for(int r = 5; r >= 0; r--) {
			for (int c = 0; c < 7; c++) {
				System.out.print(board[c][r]+" | ");
			}
			System.out.println();
		}
	}
	
	public int getPlayerMove(int player) {		// Prompt the user for the column choice
		currentPlayer = player;
		if (player == 1) {
			System.out.println("Player 1, which column would you like to place your piece in? Pick a number between 1 and 7");
		} else {
			System.out.println("Player 2, which column would you like to place your piece in? Pick a number between 1 and 7");
		}
		
		return userInput.nextInt();
	}
	
	public void invalidMove() {   // Invalid move made try again
		System.out.println("Invalid move, please select a column with open spaces");
		getPlayerMove(currentPlayer);
	}
	
	public void draw() {   // The game resulted in a draw
		System.out.println("The game results in a draw.");
	}
	
	public void winner(int player) {  // Print the winner of the game based on current player
		currentPlayer = player;
		if (player == 1) {
			System.out.println("Player 1 wins!");
		} else {
			System.out.println("Player 2 wins!");
		}
	}
}
