package br.com.systemchess.chess;

import br.com.systemchess.boardgame.Board;

public class ChessMatch {

    private Board board;

    public ChessMatch() {
        this.board = new Board(8, 8);
    }

    public ChessPiece[][] getPieces(){
        ChessPiece[][] match = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows(); i++){
            for (int j = 0; i < board.getColumns(); j++){
                match[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return match;
    }
}
