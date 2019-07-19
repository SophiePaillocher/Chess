package main;

public class ChessBoard {

    private Square[] squares = new Square[64];

    public ChessBoard() {
        for (int i = 0; i<64 ; i++) {
            squares[i] = new Square((char)((int)'a' + i%8), i/8+1);
        }
    }

    public Square[] getSquares(){
        return squares;
    }

    /*
    Initialisation de la partie : placement des pièces sur l'échiquier
     */
    public void newGame(){
        int colorPlayer1 = 1;
        int colorPlayer2 = 2;

        Rook rook1P1 = new Rook(colorPlayer1);
        squares[0].setOccupation(rook1P1);

        Knight knight1P1 = new Knight(colorPlayer1);
        squares[1].setOccupation(knight1P1);

        Bishop bishop1P1 = new Bishop(colorPlayer1);
        squares[2].setOccupation(bishop1P1);

        Queen queenP1 = new Queen(colorPlayer1);
        squares[3].setOccupation(queenP1);

        King kingP1 = new King(colorPlayer1);
        squares[4].setOccupation(kingP1);

        Bishop bishop2P1 = new Bishop(colorPlayer1);
        squares[5].setOccupation(bishop2P1);

        Knight knight2P1 = new Knight(colorPlayer1);
        squares[6].setOccupation(knight2P1);

        Rook rook2P1 = new Rook(colorPlayer1);
        squares[7].setOccupation(rook2P1);

        Pawn[] pawnsP1 = new Pawn[8];

        for (int i=0; i<9; i++){
            pawnsP1[i] = new Pawn(colorPlayer1);
            squares[i+8].setOccupation(pawnsP1[i]);
        }

        Rook rook1P2 = new Rook(colorPlayer2);
        squares[56].setOccupation(rook1P2);

        Knight knight1P2 = new Knight(colorPlayer2);
        squares[57].setOccupation(knight1P2);

        Bishop bishop1P2 = new Bishop(colorPlayer2);
        squares[58].setOccupation(bishop1P2);

        Queen queenP2 = new Queen(colorPlayer2);
        squares[59].setOccupation(queenP2);

        King kingP2 = new King(colorPlayer2);
        squares[60].setOccupation(kingP2);

        Bishop bishop2P2 = new Bishop(colorPlayer2);
        squares[61].setOccupation(bishop2P2);

        Knight knight2P2 = new Knight(colorPlayer2);
        squares[62].setOccupation(knight2P2);

        Rook rook2P2 = new Rook(colorPlayer2);
        squares[63].setOccupation(rook2P2);

        Pawn[] pawnsP2 = new Pawn[8];

        for (int i=0; i<9; i++){
            pawnsP2[i] = new Pawn(colorPlayer1);
            squares[i+48].setOccupation(pawnsP2[i]);
        }

    }
}
