package br.com.systemchess.application;

import br.com.systemchess.chess.ChessMatch;

public class ChessApplication {

    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}
