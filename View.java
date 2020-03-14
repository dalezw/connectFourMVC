import java.util.Scanner;

public class View {

	Scanner userInput = new Scanner(System.in);
	
	public void displayBoard(int[][] board) {
		for(int c = 0; c < 6; c++) {
			for (int r = 0; r < 7; r++) {
				System.out.print(board[c][r]+"|  ");
			}
		}
	}
	
	public int getPlayerMove(int player) {
		if (player == 1) {
			System.out.println("Player 1, which column would you like to place your piece in?\nPick a number between 1 and 6");
		} else {
			System.out.println("Player 2, which column would you like to place your piece in?\\nPick a number between 1 and 6");
		}
		
		return userInput.nextInt();
	}
}
