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
    public void shouldReturnIntegerValue_afterParseValidInput() {
        int expected = 3;
        int actual = parser.parse('3');
        Assert.assertEquals(actual, expected);
    }


    @Test(expectedExceptions = IllegalArgumentException.class,
          expectedExceptionsMessageRegExp = "Invalid input")
    public void shouldThrowAnException_afterParseInvalidInput() {
        parser.parse('D');
    }
}
