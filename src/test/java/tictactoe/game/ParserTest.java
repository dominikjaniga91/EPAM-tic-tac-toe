package tictactoe.game;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ParserTest {


    @Test
    public void shouldReturnIntegerValue_afterParseValidInput() throws InvalidInputException {
        int expected = 3;
        int actual = Parser.parseNumber('3');
        Assert.assertEquals(actual, expected);
    }


    @Test(expectedExceptions = InvalidInputException.class,
          expectedExceptionsMessageRegExp = "Input should be a number")
    public void shouldThrowAnException_afterParseInvalidInput() throws InvalidInputException {
        Parser.parseNumber('D');
    }
}
