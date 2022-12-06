package chess;

import boardgame.Board;
import boardgame.Position;
import chess.piece.Torre;

public class ChessMath {

	private Board board;

	public ChessMath() {
		board = new Board(8, 8);
		initialSetup();
	}

	public ChessPiece[][] getPiece() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	
	private void initialSetup() {
		board.placePiece(new Torre(board, Color.BLACK), new Position(0, 0));
		board.placePiece(new Torre(board, Color.BLACK), new Position(0, 7));
	}
}
