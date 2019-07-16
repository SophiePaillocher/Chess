package test;

import junit.framework.TestCase;
import main.Square;

import static org.junit.Assert.assertEquals;

public class SquareTest extends TestCase {

    public void testisOnTheBoardWhenA1() throws Exception {
        Square square= new Square('a',1);
        assertEquals(true, square.isOnTheBoard());
    }

    public void testNotOnTheBoardWhenA0() throws Exception {
        Square square= new Square('a',0);
        assertEquals(false, square.isOnTheBoard());
    }

    public void testNotOnTheBoardWhenA9() throws Exception {
        Square square= new Square('a',9);
        assertEquals(false, square.isOnTheBoard());
    }

    public void testNotOnTheBoardWhenM2() throws Exception {
        Square square= new Square('m',2);
        assertEquals(false, square.isOnTheBoard());
    }
}