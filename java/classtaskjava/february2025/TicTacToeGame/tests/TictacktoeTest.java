import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TictacktoeTest {
    private Tictactoe game1;

    @BeforeEach
    void setUp(){
        game1 = new Tictactoe("john", "mary");
    }

    @Test
    public void testThatGameHasABoardAndItIsInitialisedWithEmptyStrings() {
        String[][] expected = {
                {" ", " ", " "},
                {" ", " ", " "},
                {" ", " ", " "}
        };
        assertArrayEquals(expected, game1.getBoard());
    }
    @Test
    public void testThatGameHasPlayersAndItSwitches() {
        assertFalse(game1.getIsPlayer());
        assertEquals(Players.PLAYER1, game1.getCurrentPlayer());
        game1.setIsPlayer();
        assertTrue(game1.getIsPlayer());
        assertEquals(Players.PLAYER2, game1.getCurrentPlayer());
        game1.setIsPlayer();
        assertFalse(game1.getIsPlayer());
        assertEquals(Players.PLAYER1, game1.getCurrentPlayer());
    }

    @Test
    public void testThatPlayersChooseCharacters() {
        assertFalse(game1.getIsPlayer());
        assertEquals(Players.PLAYER1, game1.getCurrentPlayer());
        game1.collectUserPreferredSymbol('X');
        assertEquals('X', game1.getPlayer1Marker());
        game1.setIsPlayer();
        assertTrue(game1.getIsPlayer());
        assertEquals(Players.PLAYER2, game1.getCurrentPlayer());
        game1.collectUserPreferredSymbol('O');
        assertEquals('O', game1.getPlayer2Marker());
    }

    @Test
    public void testThatPlayersMarkersAreEnteredInBoard() {
        assertFalse(game1.getIsPlayer());
        game1.collectUserPreferredSymbol('X');
        game1.setIsPlayer();
        assertTrue(game1.getIsPlayer());
        game1.collectUserPreferredSymbol('O');

        game1.setBoard(0, 0);
        game1.setIsPlayer();

        game1.setBoard(0, 1);
        game1.setIsPlayer();

        game1.setBoard(0, 2);
        game1.setIsPlayer();

        game1.setBoard(1, 0);
        game1.setIsPlayer();

        game1.setBoard(1, 1);
        game1.setIsPlayer();

        game1.setBoard(1, 2);
        game1.setIsPlayer();

        game1.setBoard(2, 0);
        game1.setIsPlayer();

        game1.setBoard(2, 1);
        game1.setIsPlayer();

        game1.setBoard(2, 2);
        game1.setIsPlayer();

        String[][] expected = {
                {"O", "X", "O"},
                {"X", "O", "X"},
                {"O", "X", "O"}
        };
        assertArrayEquals(expected, game1.getBoard());
    }

    @Test
    public void testThatPlayersMarkersEnteredInBoardThrowsExceptionWhenPositionIsOccupied() {
        assertFalse(game1.getIsPlayer());
        game1.collectUserPreferredSymbol('X');
        game1.setIsPlayer();
        assertTrue(game1.getIsPlayer());
        game1.collectUserPreferredSymbol('O');
        game1.setBoard(0, 0);
        game1.setIsPlayer();
        assertThrows(IllegalArgumentException.class, () -> game1.setBoard(0, 0));
    }

    @Test
    public void testThatPlayersMarkersEnteredInBoardThrowsExceptionWhenColumnIsOutOfBound() {
        assertFalse(game1.getIsPlayer());
        game1.collectUserPreferredSymbol('X');
        game1.setIsPlayer();
        assertTrue(game1.getIsPlayer());
        game1.collectUserPreferredSymbol('O');
        assertThrows(IllegalArgumentException.class, () -> game1.setBoard(4, 0));
    }

    @Test
    public void testThatBoardChecksIfAnyPlayerWins() {
        assertFalse(game1.getIsPlayer());
        game1.collectUserPreferredSymbol('X');
        game1.setIsPlayer();
        assertTrue(game1.getIsPlayer());
        game1.collectUserPreferredSymbol('O');

        game1.setBoard(0, 0);
        game1.setIsPlayer();
        game1.setBoard(0, 1);
        game1.setIsPlayer();
        game1.setBoard(1, 1);
        game1.setIsPlayer();
        game1.setBoard(0, 2);
        game1.setIsPlayer();
        game1.setBoard(2, 2);
        assertTrue(game1.checkWinCondition());
    }
}
