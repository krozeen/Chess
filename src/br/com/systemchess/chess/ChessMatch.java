package br.com.systemchess.chess;

import br.com.systemchess.boardgame.Board;

public class ChessMatch {

    private Board board;

    public ChessMatch() {
        this.board = new Board(8, 8);
        this.initialSetup();
    }

    public ChessPiece[][] getPieces(){
        ChessPiece[][] match = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows(); i++){
            for (int j = 0; j < board.getColumns(); j++){
                match[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return match;
    }

    private void placeNewPiece(char column, int row, ChessPiece piece){
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }

    private void initialSetup(){

    }
}
