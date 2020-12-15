package tictactoe.game;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static tictactoe.game.FieldValue.*;

public class HumanPlayerTest {

    private HumanPlayer humanPlayer;

    @BeforeMethod
    public void setUp() {
        humanPlayer = new HumanPlayer(X);
    }

    @Test
    public void shouldReturnField_afterPlayerProvideValidInput() throws InvalidInputException {
        Field actual = humanPlayer.makeAMove("01");
        Field expected = new Field(0, 1, X);
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = InvalidInputException.class,
            expectedExceptionsMessageRegExp = "Provided input is too long - only two digits")
    public void shouldThrowAnException_afterProvideTooLongInput() throws InvalidInputException {
        humanPlayer.makeAMove("011");
    }
}
