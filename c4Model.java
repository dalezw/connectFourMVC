/**
 * 
 * @author dalezw
 * Date: 01 march 2020
 */

package mvc;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JPanel;
public class c4Model {

	private int[][] board= new int[6][7];// game board
	
	int player=1;
	
	public void reset() {	
		for(int[] i: board) {
			for (int j=0; j<i.length; j++) {
				i[j]=0;
			}
		}
	}
	
	public void changeTurn() {
		 if(player==2) {
			 player=1;
		 }
		 else {
			 player=2;
		 }
	}
	
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
	
	public boolean checkHorizontal() {
		for(int r=0; r<3;r++) {
			for(int c=0;c<7;c++) {
				if(board[r][c] !=0 && board[r][c]==board[r][c+1]
						&& board[r][c]==board[r][c+2]
						&&board[r][c] == board[r][c+3]) {
					return true;
				}
			}
		}
		return false;
	}
	
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
	
	public boolean checkDiagonal() {
		for(int r=0; r<3;r++) {
			for(int c=0;c<7;c++) {
				if(board[r][c] !=0 && board[r][c]==board[r+1][c+1]
						&& board[r][c]==board[r+2][c+2]
						&&board[r][c] == board[r+3][c+2]) {
					return true;
				}
			}
		}
		return false;
	}
	
	
}
