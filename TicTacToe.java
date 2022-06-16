import java.util.Scanner;
public class TicTacToe {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		TicTacToeFunctions tttf = new TicTacToeFunctions();
		String p1_name, p2_name;
		char[][] board = {
				{'|', ' ', '_', ' ', '|', ' ', '_', ' ', '|', ' ', '_', ' ', '|'},
				{'|', ' ', '_', ' ', '|', ' ', '_', ' ', '|', ' ', '_', ' ', '|'},
				{'|', ' ', '_', ' ', '|', ' ', '_', ' ', '|', ' ', '_', ' ', '|'}
				};
		boolean spotTaken, p1_turn = true, p2_turn = false, fullBoard;
		
		System.out.println("┍━━━━━━━━━━ ⋆⋅☆⋅⋆ ━━━━━━━━━━┑");
		System.out.println("   Let's play Tic Tac Toe!");
		System.out.println("┕━━━━━━━━━━ ⋆⋅☆⋅⋆ ━━━━━━━━━━┙\n");
		System.out.println("What is Player 1's name? ");
		p1_name = input.nextLine();
		System.out.println("What is Player 2's name? ");
		p2_name = input.nextLine();
		
		tttf.displayBoard(board);
		
		while (true) {
			while (p1_turn == true) {
				p1_turn = tttf.playerTurn(board, p1_name, 'X');
				if (p1_turn == true) {
					System.out.println("✼　 ҉  ✼　 ҉ ✼ " + p1_name.toUpperCase() + " IS THE WINNER! ✼　 ҉  ✼　 ҉ ✼");
					p2_turn = false; p1_turn = false;
				} else {
					fullBoard = tttf.checkFullBoard(board);
					if (fullBoard) {
						System.out.println("It's a tie ¯\\_(ツ)_/¯");
						p2_turn = false; p1_turn = false;
					} else {
						p1_turn = false;
						p2_turn = true;
					}
				}
			} // end of p1_turn
			
			while (p2_turn == true) {
				p2_turn = tttf.playerTurn(board, p2_name, 'O');
				if (p2_turn == true) {
					System.out.println("✼　 ҉  ✼　 ҉ ✼ " + p2_name.toUpperCase() + " IS THE WINNER! ✼　 ҉  ✼　 ҉ ✼");
					p1_turn = false; p2_turn = false;
				} else {
					fullBoard = tttf.checkFullBoard(board);
					if (fullBoard) {
						System.out.println("It's a tie ¯\\_(ツ)_/¯");
						p1_turn = false; p2_turn = false;
					} else {
						p2_turn = false;
						p1_turn = true;
					}
				}
			} // end of p2_turn
			if (p1_turn == false && p2_turn == false) {
				break;
			}
		} // end of while
		System.out.println("Thanks for playing! :D");
	} // end of main method

} // end of class
