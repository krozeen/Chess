package br.com.systemchess.chess.pieces;

import br.com.systemchess.boardgame.Board;
import br.com.systemchess.chess.ChessPiece;
import br.com.systemchess.chess.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }
}
