package tictactoe;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HumanPlayerTest {

    private HumanPlayer humanPlayer;

    @BeforeMethod
    public void setUp() {
        humanPlayer = new HumanPlayer(FieldValue.X);
    }

    @Test
    public void shouldReturnField_afterPlayerProvideValidInput() throws InvalidInputException {
        Field actual = humanPlayer.makeAMove("01");
        Field expected = new Field(0, 1, FieldValue.X);
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = InvalidInputException.class,
            expectedExceptionsMessageRegExp = "Provided input is too long - only two digits")
    public void shouldThrowAnException_afterProvideTooLongInput() throws InvalidInputException {
        humanPlayer.makeAMove("011");
    }
}
