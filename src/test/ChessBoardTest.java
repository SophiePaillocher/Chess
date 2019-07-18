package test;

import junit.framework.TestCase;
import main.ChessBoard;

public class ChessBoardTest extends TestCase {

    ChessBoard chessBoard = new ChessBoard();

    public void testInitializeF6() {
        assertEquals('f', chessBoard.getSquares()[45].getFile());
        assertEquals(6, chessBoard.getSquares()[45].getRank());
    }
}