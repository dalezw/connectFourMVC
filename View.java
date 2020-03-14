import java.util.Scanner;

public class View {

	Scanner userInput = new Scanner(System.in);
	int currentPlayer;
	
	public void displayBoard(int[][] board) {
		for(int c = 0; c < 7; c++) {
			for (int r = 0; r < 6; r++) {
				System.out.print(board[c][r]+"|  ");
			}
		}
	}
	
	public int getPlayerMove(int player) {
		currentPlayer = player;
		if (player == 1) {
			System.out.println("Player 1, which column would you like to place your piece in?\nPick a number between 1 and 7");
		} else {
			System.out.println("Player 2, which column would you like to place your piece in?\\nPick a number between 1 and 7");
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
