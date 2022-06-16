import java.util.Scanner;

public class TicTacToeFunctions {
	
	Scanner input = new Scanner(System.in);

	void displayBoard(char[][] board) {
		System.out.println("Board:");
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[row].length; col++) {
				if (col == 12 || col == 24 || col == 36) {
					System.out.print(board[row][col] + "\n");
				} else {
					System.out.print(board[row][col]);
				}
			}
		}
		System.out.println("");
	} // end of displayBoard
	
	int rowNumber() {
		System.out.println("Choose Row 1, 2, or 3: ");
		String strRowNum = input.nextLine();
		int rowNum;
		while(true) {
			try {
				rowNum = Integer.parseInt(strRowNum);
				if (rowNum < 1 || rowNum > 3) {
					System.out.println("That spot is not on the board! Choose Row 1, 2, or 3: ");
					strRowNum = input.nextLine();
					continue;
				} else {
					break;
				}
			}
			catch (Exception e) {
				System.out.println("Invalid input. Choose Row 1, 2, or 3: ");
				strRowNum = input.nextLine();
				continue;
			}
		}
		return rowNum;
	} // end of rowNumber
	
	int colNumber() {
		System.out.println("Choose Column 1, 2, or 3: ");
		String strColNum = input.nextLine();
		int colNum;
		while(true) {
			try {
				colNum = Integer.parseInt(strColNum);
				if (colNum < 1 || colNum > 3) {
					System.out.println("That spot is not on the board! Choose Column 1, 2, or 3: ");
					strColNum = input.nextLine();
					continue;
				} else {
					break;
				}
			}
			catch (Exception e) {
				System.out.println("Invalid input. Choose Column 1, 2, or 3: ");
				strColNum = input.nextLine();
				continue;
			}
		}
		return colNum;
	} // end of colNumber
	
	boolean spotTaken(char[][] board, int rowIndex, int colIndex) {
		while (true) {
			if (board[rowIndex][colIndex] == 'X' || board[rowIndex][colIndex] == 'O') {
				return true;
			} else {
				return false;
			}
		}
	} // end of spotTaken
	
	int rowIndex(int rowNum) {
		switch (rowNum) {
		case 1:
			return 0;
		case 2:
			return 1;
		case 3:
			return 2;
		default:
			return 0;
		}
	} // end of rowIndex
	
	int colIndex(int colNum) {
		switch (colNum) {
			case 1:
				return 2;
			case 2:
				return 6;
			case 3:
				return 10;
			default:
				return 0;
			} // end of switch
		
	} // end of colIndex
	
	boolean checkWinner(char[][] board, char player_piece) {
		while (true) {
			if (board[0][2] == player_piece && board[0][6] == player_piece && board[0][10] == player_piece) {
				return true;
			} else if (board[1][2] == player_piece && board[1][6] == player_piece && board[1][10] == player_piece) {
				return true;
			} else if (board[2][2] == player_piece && board[2][6] == player_piece && board[2][10] == player_piece){
				return true;
			} else if (board[0][2] == player_piece && board[1][2] == player_piece && board[2][2] == player_piece) {
				return true;
			} else if (board[0][6] == player_piece && board[1][6] == player_piece && board[2][6] == player_piece) {
				return true;
			} else if (board[0][10] == player_piece && board[1][10] == player_piece && board[2][10] == player_piece) {
				return true;
			} else if (board[0][2] == player_piece && board[1][6] == player_piece && board[2][10] == player_piece) {
				return true;
			} else if (board[0][10] == player_piece && board[1][6] == player_piece && board[2][2] == player_piece) {
				return true;
			} else {
				return false;
			}
		} // end of while
	} // end of checkWinner
	
	boolean checkFullBoard(char[][] board) {
		int count = 0;
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[row].length; col++) {
				if (board[row][col] == 'X' || board[row][col] == 'O') {
					count++;
				}
			}
		}
		if (count == 9) {
			return true;
		} else {
			return false;
		}
	}
	
	boolean playerTurn(char[][] board, String player_name, char piece) {
		int rowNum, colNum, rowIndex, colIndex;
		boolean spotTaken, checkWinner, fullBoard;
		
		System.out.println(player_name + "'s turn! (" + piece + ")");
		rowNum = rowNumber();
		colNum = colNumber();
		
		rowIndex = rowIndex(rowNum);
		colIndex = colIndex(colNum);
		
		spotTaken = spotTaken(board, rowIndex, colIndex);
		while (spotTaken == true) {
			System.out.println("Sorry, that spot is taken!");
			rowNum = rowNumber();
			colNum = colNumber();
			rowIndex = rowIndex(rowNum);
			colIndex = colIndex(colNum);
			spotTaken = spotTaken(board, rowIndex, colIndex);
		}
		fullBoard = checkFullBoard(board);
		if (fullBoard == true) {
			checkWinner = checkWinner(board, piece);
			if (checkWinner == true) {
				System.out.println("✼　 ҉  ✼　 ҉ ✼ " + player_name.toUpperCase() + " IS THE WINNER! ✼　 ҉  ✼　 ҉ ✼");
				return true;
			}
			return true;
		}
		board[rowIndex][colIndex] = piece;
		displayBoard(board);
		checkWinner = checkWinner(board, piece);
		if (checkWinner == true) {
			return true;
		} else {
			return false;
		}
	} // end of playerTurn
	
} // end of class
