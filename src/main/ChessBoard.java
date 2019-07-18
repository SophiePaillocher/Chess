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
}
