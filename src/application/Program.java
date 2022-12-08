package application;

import java.util.Scanner;

import boardgame.Board;
import chess.ChessMath;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ChessMath chessMath = new ChessMath();

		while (true) {
			UI.printBoard(chessMath.getPiece());
			System.out.println();
			System.out.print("Source: ");
			ChessPosition source = UI.readChessPosition(sc);
			
			System.out.println();
			System.out.print("Target: ");
			ChessPosition target = UI.readChessPosition(sc);
			
			ChessPiece capturedPiece = chessMath.performchessMove(source,target);
			

		}
		
	}
}
