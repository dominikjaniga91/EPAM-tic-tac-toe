package tictactoe;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HumanPlayerTest {

    private HumanPlayer humanPlayer;

    @BeforeMethod
    public void setUp() {
        Parser parser = new Parser();
        humanPlayer = new HumanPlayer(parser);
    }


    @Test
    public void shouldReturnFieldValue_afterSelectGameMark() throws InvalidInputException {

        FieldValue expected = FieldValue.X;
        FieldValue actual = humanPlayer.selectTheGameMark("X");
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = InvalidInputException.class,
    expectedExceptionsMessageRegExp = "Invalid input - please provide 'X' or 'O' ")
    public void shouldThrowAnException_afterProvideInvalidMark() throws InvalidInputException {
        humanPlayer.selectTheGameMark("D");
    }

    @Test
    public void shouldReturnField_afterPlayerProvideValidInput() throws InvalidInputException {
        Field actual = humanPlayer.makeAMove("01");
        Field expected = new Field(0, 1, FieldValue.EMPTY);
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = InvalidInputException.class,
            expectedExceptionsMessageRegExp = "Provided input is too long - only two digits")
    public void shouldThrowAnException_afterProvideTooLongInput() throws InvalidInputException {
        humanPlayer.makeAMove("011");
    }
}
