package br.com.systemchess.chess;

import br.com.systemchess.boardgame.Board;
import br.com.systemchess.boardgame.Position;
import br.com.systemchess.chess.pieces.King;
import br.com.systemchess.chess.pieces.Rook;

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

    private void initialSetup(){
        board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
    }
}
