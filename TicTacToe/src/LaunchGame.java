import java.util.Scanner;

public class LaunchGame {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println(
				" Enter the mode of play \n" + "Press 1 to play with Computer "
						+ "\n" + "Press 2 to play with your friend \n"
						+ "Press 3 to exit ");

		int number = scan.nextInt();
		
		switch (number) {
		case 1: {
			// TicTacToe t = new TicTacToe();
			new TicTacToe();
			System.out.println("enter first players  name and Symbol");
			HumanPlayer p1 = new HumanPlayer();
			System.out.println("enter AI players  name and Symbol");
			AIPlayer p2 = new AIPlayer();
			Player cp;// reference to point the currentplayer everytime
			cp = p1;// giving p1 player reference to cp
			while (true) {
				System.out.println(cp.name + " turn");
				cp.makeMove();
				// after every move we have to display the box and check if player won or not or
				// draw
				TicTacToe.displayBoard();
				if (TicTacToe.checkColWin() || TicTacToe.checkRowWin() || TicTacToe.checkDiagonalWin()) {
					System.out.println(cp.name + " has won");
					break;
					// if p1 didn't won then give the move to p2
				} else if (TicTacToe.checkDraw()) {
					System.out.println("Game is Draw");
					break;// if its draw stop it there itself
				} else {
					if (cp == p1) {
						cp = p2;
					} else {// if cp is not pointing to p1 we should understand that its pointing to p2
						cp = p1;
					}
				}
			}
		}
			break;
		case 2: {
			// first initialisation should be done otherwise the recently stored marks are not visible
			new TicTacToe();// call this constructor to initialise the board
			HumanPlayer cp;
			System.out.println("enter first players name and Symbol");
			HumanPlayer p1 = new HumanPlayer();
			System.out.println("enter second players name and Symbol");
			HumanPlayer p2 = new HumanPlayer();

			cp = p1;
			while (true) {

				System.out.println(cp.name + "'s turn");
				cp.makeMove();
				// after every move display the board and check the winning condition,draw
				// condition.
				TicTacToe.displayBoard();
				if (TicTacToe.checkColWin() || TicTacToe.checkDiagonalWin() || TicTacToe.checkRowWin()) {
					System.out.println(cp.name + " has won");
					break;// if he wins stop game
				} else if (TicTacToe.checkDraw()) {
					System.out.println("Game ended in Draw");
				} else {// check who is the current player and give move to another player
					if (cp == p1) {
						cp = p2;
					} else {// if cp is not pointing to p1 we should understand that its pointing to p2
						cp = p1;
					}

				}
			}
		}
			break;
		case 3:
			return;
		}

	}
}
