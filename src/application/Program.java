package application;

import boardgame.Board;
import chess.ChessMath;

public class Program {

	public static void main(String[] args) {
		
	ChessMath chessMath = new ChessMath();
	UI.printBoard(chessMath.getPiece());
	}
}
