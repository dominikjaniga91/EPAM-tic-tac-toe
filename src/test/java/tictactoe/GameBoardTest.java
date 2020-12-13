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

    @Test
    public void shouldReturnTrue_whenSetAppropriatePositionOnGameBoard() {

        int position1 = 0;
        int position2 = 0;
        boolean actual = gameBoard.setValue(position1, position2, Field.X);
        Assert.assertTrue(actual);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void shouldThrowAnException_afterSetValueOutOfBoard() {
           gameBoard.setValue(4, 4, Field.X);
    }


}
