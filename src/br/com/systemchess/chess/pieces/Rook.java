package br.com.systemchess.chess.pieces;

import br.com.systemchess.boardgame.Board;
import br.com.systemchess.boardgame.Piece;
import br.com.systemchess.chess.ChessPiece;
import br.com.systemchess.chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }
}
