# TicTacToeApplication-MiniProject-
Title: Tic Tac Toe Game

Description:
The Tic Tac Toe Game is a console-based application developed in Java.
It allows players to play the classic Tic Tac Toe game either against an AI player or with a friend. 
The game follows the standard rules of Tic Tac Toe, where players take turns marking their symbols ('X' or 'O') on a 3x3 game board until one player wins or the game ends in a draw.

The project consists of several classes:

1. TicTacToe:
   - Represents the game board and its operations.
   - Provides methods for initializing the board, displaying the board, placing a mark on the board, and checking win/draw conditions.
   - Uses a 2D character array to represent the board.

2. HumanPlayer:
   - Represents a human player in the game.
   - Inherits from the abstract class Player.
   - Prompts the user to enter their name and symbol ('X' or 'O').
   - Implements the makeMove() method to allow the human player to make a move by entering the row and column.

3. AIPlayer:
   - Represents an AI player in the game.
   - Inherits from the abstract class Player.
   - Prompts the user to enter the AI player's name and symbol ('X' or 'O').
   - Implements the makeMove() method to make a random move by generating random row and column values.

4. Player (abstract class):
   - Provides a common structure for human and AI players.
   - Contains fields for the player's name and symbol.
   - Defines an abstract method makeMove() to be implemented by subclasses.

5. LaunchGame:
   - Contains the main method to start the game.
   - Prompts the user to choose the mode of play (against the computer or with a friend).
   - Creates the necessary objects (TicTacToe, HumanPlayer, AIPlayer) based on the chosen mode.
   - Implements the game logic, alternating turns between players, and checking for a win or draw condition.

The Tic Tac Toe game project showcases object-oriented programming principles and user input handling in Java.
It provides a fun and interactive experience for players to enjoy the classic game either against an AI opponent or with a friend.
