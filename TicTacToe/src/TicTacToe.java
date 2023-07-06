
public class TicTacToe {
	static char[][] board;

	// constructor
	// The moment we create the object everything should be intitalised
	public TicTacToe() {
		board = new char[3][3];
		initBoard();// initialised
	}

	// as soon as we intitalise an array it will be filled with /u0000 means unicode
	// null
	// method for intitialising the board with spaces
	void initBoard() {
		for (int i = 0; i < board.length; i++) {// row
			for (int j = 0; j < board[i].length; j++) {// column in i th row
				board[i][j] = ' ';// space
			}
		}
	}

	// method for displaying
	static void displayBoard() {
		// before entering the row for only 1st line(top)
		System.out.println("----------------");

		for (int i = 0; i < board.length; i++) {
			// before printing the row we have one line
			System.out.print("| ");
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + " ");
				// after printing the column
				System.out.print(" | ");
			}
			System.out.println();
			// before going to next iteration one line(down)
			System.out.println("----------------");
		}

	}

	static void placeMark(int row, int col, char mark) {
		if ((row >= 0 && row <= 2) && (col >= 0 && col <= 2)) {
			board[row][col] = mark;
		} else {
			System.out.println("invalid position");
		}
	}

//checking column win condition col(j) is common here while row value changes
	static boolean checkColWin() {
		for (int j = 0; j <= 2; j++) {
			// check first column contains mark
			if (board[0][j] != ' ' && board[0][j] == board[1][j] && board[1][j] == board[2][j]) {
				return true;
			}
		}
		return false;
	}

	// checking the row win condition
	// here row will be constant while column varies
	static boolean checkRowWin() {
		for (int i = 0; i < 3; i++) {
			// check first place has element
			if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
				return true;
			}
		}
		return false;
	}

	// check diagonal win condition
	// diagonal conditions should be hardcoded
	static boolean checkDiagonalWin() {
		// check first element is present or not in both diagonals
		if ((board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2])
				|| (board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0])) {
			return true;
		}
		return false;
	}
	static boolean checkDraw() {
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				if(board[i][j]==' ') {
					return false;
				}
			}
		}
		return true;
	}
}
