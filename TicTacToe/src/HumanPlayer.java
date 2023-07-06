import java.util.Scanner;

public class HumanPlayer extends Player {
	Scanner scan = new Scanner(System.in);
	// String name;
	// char mark; these should not be used here these are automatically inherited \
	// from Player

	public HumanPlayer() {
		
		name = scan.nextLine();
		mark = scan.next().charAt(0);
	}

	void makeMove() {

		int row;
		int col;

		System.out.println("enter the row and column");

		do {
			row = scan.nextInt();
			col = scan.nextInt();
			// if the input is valid take it .
			// if its not valid keep iterating intil becomes valid
		} while (!isValidMove(row, col));
		TicTacToe.placeMark(row, col, mark);
	}

}
