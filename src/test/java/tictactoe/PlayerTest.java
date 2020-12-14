package tictactoe;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PlayerTest {

    private Player player;

    @BeforeMethod
    public void setUp() {
        Parser parser = new Parser();
        player = new Player(parser);
    }


    @Test
    public void shouldReturnFieldValue_afterSelectGameMark() throws InvalidInputException {

        FieldValue expected = FieldValue.X;
        FieldValue actual = player.selectTheGameMark("X");
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = InvalidInputException.class,
    expectedExceptionsMessageRegExp = "Invalid input - please provide 'X' or 'O' ")
    public void shouldThrowAnException_afterProvideInvalidMark() throws InvalidInputException {
        player.selectTheGameMark("D");
    }

    @Test
    public void shouldReturnField_afterPlayerProvideValidInput() throws InvalidInputException {
        Field actual = player.makeAMove("01");
        Field expected = new Field(0, 1, FieldValue.EMPTY);
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = InvalidInputException.class,
            expectedExceptionsMessageRegExp = "Provided input is too long - only two digits")
    public void shouldThrowAnException_afterProvideTooLongInput() throws InvalidInputException {
        player.makeAMove("011");
    }
}
