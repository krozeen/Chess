package br.com.systemchess.chess;

import br.com.systemchess.boardgame.Board;
import br.com.systemchess.boardgame.Piece;

public class ChessPiece extends Piece {

    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
