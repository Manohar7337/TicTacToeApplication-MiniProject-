
import java.util.Random;
import java.util.Scanner;

public class AIPlayer extends Player {
	// String name;
	// char mark;
	Scanner scan = new Scanner(System.in);

	public AIPlayer() {
		name = scan.nextLine();
		mark = scan.next().charAt(0);
	}

	void makeMove() {

		int row;
		int col;

		System.out.println("enter the row and column");

		do {
			Random r = new Random();
			row = r.nextInt(3);
			col = r.nextInt(3);
			// if the input is valid take it .
			// if its not valid keep iterating until becomes valid
		} while (!isValidMove(row, col));
		TicTacToe.placeMark(row, col, mark);
	}

}
