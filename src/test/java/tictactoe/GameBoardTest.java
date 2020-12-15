package tictactoe;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GameBoardTest {

    GameBoard gameBoard;

    @BeforeMethod
    public void setUp() {
        gameBoard = new GameBoard(3);
        gameBoard.setUpGameBoard();
    }


    @Test
    public void shouldReturnTrue_whenSetAppropriatePositionOnGameBoard() throws OutOfRangeException {
        Field field = new Field(0 ,0, FieldValue.X);
        boolean actual = gameBoard.setValue(field);
        Assert.assertTrue(actual);
    }

    @Test(expectedExceptions = OutOfRangeException.class,
    expectedExceptionsMessageRegExp = "Provided position is out of board game's range")
    public void shouldThrowAnException_afterSetValueOutOfBoard() throws OutOfRangeException {
           gameBoard.setValue(new Field(4 ,4, FieldValue.X));
    }


}
