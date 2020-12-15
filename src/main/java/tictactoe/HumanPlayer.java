package tictactoe;

import static tictactoe.ExceptionMessage.*;

public class HumanPlayer {

    private FieldValue fieldValue;

    Field makeAMove(String input) throws InvalidInputException {
        if (input.length() > 2) {
            throw new InvalidInputException(TOO_LONG_INPUT);
        }
        int row = Parser.parseNumber(input.charAt(0));
        int column = Parser.parseNumber(input.charAt(1));
        return new Field(row, column, fieldValue);
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
