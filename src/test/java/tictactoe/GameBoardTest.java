package tictactoe;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GameBoardTest {

    GameBoard gameBoard;

    @BeforeMethod
    public void setUp() {
        gameBoard = new GameBoard();
    }

    @Test
    public void shouldReturnEmptyGameBoard_afterPrint() {

        char[][] actual = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '} };

        char[][] expected = gameBoard.getGameBoard();

        Assert.assertEquals(actual, expected);
    }
}
