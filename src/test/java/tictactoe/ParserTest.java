package tictactoe;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParserTest {

    Parser parser;

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

}
