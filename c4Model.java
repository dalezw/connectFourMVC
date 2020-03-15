/**
 * 
 * @author dalezw
 * Date: 01 march 2020
 * Last Modified: 14 march 2020
 */


public class c4Model {

	private int[][] board= new int[7][6];// game board
	
	int player=1;
	
	public c4Model () {
		//constructor
	}
	
	//sets board up with all values of 0 
	public void setBoard() {	
		for(int[] i: board) {
			for (int j=0; j<i.length; j++) {
				i[j]=0;
			}
		}
	}
	
	// checks for win
	public boolean winCondition() {
		
		boolean horiz = checkHorizontal();
		boolean vert = checkVertical();
		boolean diag = checkDiagonal();
		
		if(horiz== true) {
			return true;
		}
		if(vert==true) {
			return true;
		}
		if(diag==true) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//checks for horizontal win
	public boolean checkHorizontal() {
		for(int r=0; r<4;r++) {
			for(int c=0;c<6;c++) {
				if(board[r][c] !=0 && board[r][c]==board[r][c+1]
						&& board[r][c]==board[r][c+2]
						&&board[r][c] == board[r][c+3]) {
					return true;
				}
			}
		}
		return false;
	}
	
	//checks for vertical win
	public boolean checkVertical() {
		for(int r=0; r<3;r++) {
			for(int c=0;c<7;c++) {
				if(board[r][c] !=0 && board[r][c]==board[r+1][c]
						&& board[r][c]==board[r+2][c]
						&&board[r][c] == board[r+3][c]) {
					return true;
				}
			}
		}
		return false;
	}
	
	//checks for diagonal win
	public boolean checkDiagonal() {
		int r=0, c=0;
		//positive slope
		for(r=0; r<3;r++) {
			for(c=0;c<4;c++) {
				if(board[r][c] !=0 && board[r][c]==board[r+1][c+1]
						&& board[r][c]==board[r+2][c+2]
						&&board[r][c] == board[r+3][c+3]) {
					return true;
				}
			}
			//negative slope 
			for(r=3; r<6;r++) {
				for(c=0;c<4;c++) {
					if(board[r][c] !=0 && board[r][c]==board[r-1][c+1]
							&& board[r][c]==board[r-2][c+2]
							&&board[r][c] == board[r-3][c+3]) 
						return true;
					}
				}
		}
		return false;
	}
}
	
	