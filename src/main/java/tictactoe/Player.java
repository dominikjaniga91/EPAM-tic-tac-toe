package tictactoe;

import static tictactoe.ExceptionMessage.*;

public class Player {

    private final Parser parser;
    private FieldValue fieldValue;

    public Player(Parser parser) {
        this.parser = parser;
    }

    Field makeAMove(String input) throws InvalidInputException {
        if (input.length() > 2) {
            throw new InvalidInputException(TOO_LONG_INPUT);
        }
        int firstPosition = parser.parse(input.charAt(0));
        int secondPosition = parser.parse(input.charAt(1));
        return new Field(firstPosition, secondPosition, fieldValue);
    }

    FieldValue selectTheGameMark(String mark) throws InvalidInputException {
        boolean validGameMark = mark.equals("X") || mark.equals("O");
        if (validGameMark) {
            this.fieldValue = FieldValue.valueOf(mark);
            return this.fieldValue;
        }
        throw new InvalidInputException(INVALID_GAME_MARK);
    }
}
