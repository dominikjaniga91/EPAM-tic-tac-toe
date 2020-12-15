package tictactoe;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ArbiterTest {

    private GameBoard gameBoard;
    private Arbiter arbiter;

    @BeforeMethod
    public void setUp() {
        gameBoard = new GameBoard(3);
        gameBoard.setUpGameBoard();
        arbiter = new Arbiter(gameBoard);
    }

    @Test
    void shouldReturnTrue_afterMarkThreeXInaRow() throws OutOfRangeException {

        Field last = new Field(0, 2, FieldValue.X);
        gameBoard.setValue(new Field(0, 0, FieldValue.X));
        gameBoard.setValue(new Field(0, 1, FieldValue.X));
        gameBoard.setValue(last);

        boolean actual = arbiter.checkRow(last, gameBoard.getGameBoard());
        Assert.assertTrue(actual);

    }

    @Test
    void shouldReturnFalse_afterMarkTwoXInaRow() throws OutOfRangeException {

        Field last = new Field(0, 2, FieldValue.X);
        gameBoard.setValue(new Field(0, 0, FieldValue.X));
        gameBoard.setValue(new Field(0, 1, FieldValue.O));
        gameBoard.setValue(last);

        boolean actual = arbiter.checkRow(last, gameBoard.getGameBoard());
        Assert.assertFalse(actual);

    }


    @Test
    void shouldReturnTrue_afterMarkThreeXInAColumn() throws OutOfRangeException {

        Field last = new Field(0, 0, FieldValue.X);
        gameBoard.setValue(new Field(1, 0, FieldValue.X));
        gameBoard.setValue(new Field(2, 0, FieldValue.X));
        gameBoard.setValue(last);

        boolean actual = arbiter.checkColumn(last, gameBoard.getGameBoard());
        Assert.assertTrue(actual);

    }

    @Test
    void shouldReturnFalse_afterMarkTwoXInAColumn() throws OutOfRangeException {

        Field last = new Field(0, 0, FieldValue.X);
        gameBoard.setValue(new Field(1, 0, FieldValue.O));
        gameBoard.setValue(new Field(2, 0, FieldValue.X));
        gameBoard.setValue(last);

        boolean actual = arbiter.checkColumn(last, gameBoard.getGameBoard());
        Assert.assertFalse(actual);

    }
}
