package application;

import chess.ChassMatch;

public class Program {

	public static void main(String[] args) {


		ChassMatch chessMatch = new ChassMatch();
		UI.printBoard(chessMatch.getPieces());
		
	}

}
