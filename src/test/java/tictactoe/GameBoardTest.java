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
    public void shouldReturnTrue_whenSetAppropriatePositionOnGameBoard() {
        Field field = new Field(0 ,0, FieldValue.X);
        boolean actual = gameBoard.setValue(field);
        Assert.assertTrue(actual);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void shouldThrowAnException_afterSetValueOutOfBoard() {
           gameBoard.setValue(new Field(4 ,4, FieldValue.X));
    }


}
