import java.util.Scanner;

public class View {

	Scanner userInput = new Scanner(System.in);
	int currentPlayer;
	
	public View() {
		//constructor
	}
	
	public void displayBoard(int[][] board) {
		for(int r = 5; r >= 0; r--) {
			for (int c = 0; c < 7; c++) {
				System.out.print(board[c][r]+" | ");
			}
			System.out.println();
		}
	}
	
	public int getPlayerMove(int player) {
		currentPlayer = player;
		if (player == 1) {
			System.out.println("Player 1, which column would you like to place your piece in? Pick a number between 1 and 7");
		} else {
			System.out.println("Player 2, which column would you like to place your piece in? Pick a number between 1 and 7");
		}
		
		return userInput.nextInt();
	}
	
	public void invalidMove() {
		System.out.println("Invalid move, please select a column with open spaces");
		getPlayerMove(currentPlayer);
	}
	
	public void draw() {
		System.out.println("The game results in a draw.");
	}
	
	public void winner(int player) {
		currentPlayer = player;
		if (player == 1) {
			System.out.println("Player 1 wins!");
		} else {
			System.out.println("Player 2 wins!");
		}
	}
}
