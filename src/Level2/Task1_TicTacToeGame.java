package Level2;
import java.util.*;

public class Task1_TicTacToeGame {
	static char [][] board = new char[3][3];
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				board[i][j]=' ';
			}
		}
		int cho=0;
		boardDisplay();
		while(cho<9) {
			
			
			if(cho%2!=0) {
				  System.out.println("Enter your move (row and column: 1-3): ");
			int r = sc.nextInt()-1;
			int c = sc.nextInt()-1;
	
			if(board[r][c]!=' ' || r<0||c<0||r>2|| c>2) {
				System.err.println("invalid position");
			continue;
			}else {

				board[r][c]='X';
			}
			}else {
				Random rd = new Random();

				char mark = 'O';
				while(true) {
				
					int  r = rd.nextInt(3);
					int c = rd.nextInt(3);
				
					if(board[r][c]==' ') {
						
						board[r][c]=mark;
						break;
						}
				}
				
			}
			boardDisplay();
			
		cho++;
		if (checkWin('X')) {
		    boardDisplay();
		    System.out.println("you wins!");
		    break;
		}
		if (checkWin('O')) {
		    boardDisplay();
		    System.out.println("Computer  wins!");
		    break;
		}
		if(cho==9 &&!checkWin('X') && !checkWin('O')) {
			System.err.println("Draw");
		}

		}

	}
	public static void boardDisplay() {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(board[i][j]);
				if(j<2) System.out.print("   |  ");
			
			}
			System.out.println();
			if(i<2) System.out.println("--------------");
		}
		System.out.println();
	}
	public static boolean checkWin(char mark) {
		for(int i=0;i<3;i++) {
			if(board[i][0]==mark && board[i][1]==mark && board[i][2]==mark) return true;
			if(board[0][i]== mark && board[1][i]==mark && board[2][i]==mark) return true;
		}
		if(board[0][0]==mark && board[1][1]==mark && board[2][2]==mark) return true;
		if(board[0][2]== mark && board[1][1]== mark && board[2][0]== mark) return true;
		return false;
		
	}
	

}
