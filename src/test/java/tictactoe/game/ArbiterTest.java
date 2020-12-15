package tictactoe.game;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static tictactoe.game.FieldValue.*;

public class ArbiterTest {

    private GameBoard gameBoard;
    private Arbiter arbiter;

    @BeforeMethod
    public void setUp() {
        gameBoard = new GameBoard(3);
        arbiter = new Arbiter(gameBoard);
    }

    @Test
    void shouldReturnTrue_afterMarkThreeXInaRow() throws OutOfRangeException {

        Field last = new Field(0, 2, X);
        gameBoard.setValue(new Field(0, 0, X));
        gameBoard.setValue(new Field(0, 1, X));
        gameBoard.setValue(last);

        boolean actual = arbiter.judge(last);
        Assert.assertTrue(actual);

    }

    @Test
    void shouldReturnFalse_afterMarkTwoXInaRow() throws OutOfRangeException {

        Field last = new Field(0, 2, X);
        gameBoard.setValue(new Field(0, 0, X));
        gameBoard.setValue(new Field(0, 1, O));
        gameBoard.setValue(last);

        boolean actual = arbiter.judge(last);
        Assert.assertFalse(actual);

    }


    @Test
    void shouldReturnTrue_afterMarkThreeXInAColumn() throws OutOfRangeException {

        Field last = new Field(0, 0, X);
        gameBoard.setValue(new Field(1, 0, X));
        gameBoard.setValue(new Field(2, 0, X));
        gameBoard.setValue(last);

        boolean actual = arbiter.judge(last);
        Assert.assertTrue(actual);

    }

    @Test
    void shouldReturnFalse_afterMarkTwoXInAColumn() throws OutOfRangeException {

        Field last = new Field(0, 0, X);
        gameBoard.setValue(new Field(1, 0, O));
        gameBoard.setValue(new Field(2, 0, X));
        gameBoard.setValue(last);

        boolean actual = arbiter.judge(last);
        Assert.assertFalse(actual);

    }


    @Test
    void shouldReturnTrue_afterMarkThreeXInFirstDiagonal() throws OutOfRangeException {

        Field last = new Field(0, 0, X);
        gameBoard.setValue(new Field(1, 1, X));
        gameBoard.setValue(new Field(2, 2, X));
        gameBoard.setValue(last);

        boolean actual = arbiter.judge(last);
        Assert.assertTrue(actual);

    }


    @Test
    void shouldReturnFalse_afterMarkTwoXInFirstDiagonal() throws OutOfRangeException {

        Field last = new Field(0, 0, X);
        gameBoard.setValue(new Field(1, 1, X));
        gameBoard.setValue(new Field(2, 2, O));
        gameBoard.setValue(last);

        boolean actual = arbiter.judge(last);
        Assert.assertFalse(actual);

    }

    @Test
    void shouldReturnTrue_afterMarkThreeXInSecondDiagonal() throws OutOfRangeException {

        Field last = new Field(2, 0, X);
        gameBoard.setValue(new Field(0, 2, X));
        gameBoard.setValue(new Field(1, 1, X));
        gameBoard.setValue(last);

        boolean actual = arbiter.judge(last);
        Assert.assertTrue(actual);

    }


    @Test
    void shouldReturnFalse_afterMarkTwoXInSecondDiagonal() throws OutOfRangeException {

        Field last = new Field(2, 0, X);
        gameBoard.setValue(new Field(0, 2, X));
        gameBoard.setValue(new Field(1, 1, O));
        gameBoard.setValue(last);

        boolean actual = arbiter.judge(last);
        Assert.assertFalse(actual);

    }
}
