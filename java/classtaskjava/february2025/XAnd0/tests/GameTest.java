import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GameTest {
    private Game game;

    @BeforeEach
    public void setUp(){
        game = new Game();
    }

    @Test
    public void testThat_gameHasABoard_andItIsEmpty(){
        char[][] expecting = new char[3][3];
        assertArrayEquals(expecting, game.getCharacterBoard());
    }

    @Test
    public void testThat_gameHasPlayersAndItSwitches(){
        assertFalse(game.getIsPlayers());
        assertEquals(Players.PLAYER1, game.getPlayer());
        game.setIsPlayers();
        assertTrue(game.getIsPlayers());
        assertEquals(Players.PLAYER2, game.getPlayer());
        game.setIsPlayers();
        assertFalse(game.getIsPlayers());
        assertEquals(Players.PLAYER1, game.getPlayer());
    }

    @Test
    public void testThat_playersChooseBetweenXAndOCharacters(){
        assertFalse(game.getIsPlayers());
        assertEquals(Players.PLAYER1, game.getPlayer());
        game.collectUserPreferredSymbol('x');
        assertEquals('x', game.getPlayer1Marker());
        game.setIsPlayers();
        assertTrue(game.getIsPlayers());
        assertEquals(Players.PLAYER2, game.getPlayer());
        game.collectUserPreferredSymbol('o');
        assertEquals('o', game.getPlayer2Marker());
    }

    @Test
    public void testThat_playersMarkersAreEnteredInBoard(){
        assertFalse(game.getIsPlayers());
        game.collectUserPreferredSymbol('x');
        game.setIsPlayers();
        assertTrue(game.getIsPlayers());
        game.collectUserPreferredSymbol('o');
        game.setBoard(0,0);
        game.setIsPlayers();
        game.setBoard(0,1);
        game.setIsPlayers();
        game.setBoard(0,2);
        game.setIsPlayers();
        game.setBoard(1,0);
        game.setIsPlayers();
        game.setBoard(1,1);
        game.setIsPlayers();
        game.setBoard(1,2);
        game.setIsPlayers();
        game.setBoard(2,0);
        game.setIsPlayers();
        game.setBoard(2,1);
        game.setIsPlayers();
        game.setBoard(2,2);
        game.setIsPlayers();
        char[][] expecting = {{'o','x','o'},{'x','o','x'},{'o','x','o'}};
        assertArrayEquals(expecting, game.getCharacterBoard());
    }

    @Test
    public void testThat_playersMarkersAreEnteredInBoardAndDisplaysBinaryWhenCompleted(){
        assertFalse(game.getIsPlayers());
        game.collectUserPreferredSymbol('x');
        game.setIsPlayers();
        assertTrue(game.getIsPlayers());
        game.collectUserPreferredSymbol('o');
        game.setBoard(0,0);
        game.setIsPlayers();
        game.setBoard(0,1);
        game.setIsPlayers();
        game.setBoard(0,2);
        game.setIsPlayers();
        game.setBoard(1,0);
        game.setIsPlayers();
        game.setBoard(1,1);
        game.setIsPlayers();
        game.setBoard(1,2);
        game.setIsPlayers();
        game.setBoard(2,0);
        game.setIsPlayers();
        game.setBoard(2,1);
        game.setIsPlayers();
        game.setBoard(2,2);

        int[][] expecting = {{0,1,0},{1,0,1},{0,1,0}};
        assertArrayEquals(expecting, game.getBinaryBoard());
    }
}
