package tictactoe;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParserTest {

    private Parser parser;

    @BeforeMethod
    public void setUp() {
        parser = new Parser();
    }

    @Test
    public void shouldReturnIntegerValue_afterParseValidInput() throws InvalidInputException {
        int expected = 3;
        int actual = parser.parse('3');
        Assert.assertEquals(actual, expected);
    }


    @Test(expectedExceptions = InvalidInputException.class,
          expectedExceptionsMessageRegExp = "Input should be a number")
    public void shouldThrowAnException_afterParseInvalidInput() throws InvalidInputException {
        parser.parse('D');
    }
}
