package tictactoe.game;

import static tictactoe.game.messages.ExceptionMessage.*;

class HumanPlayer {

    private final FieldValue fieldValue;

    HumanPlayer(FieldValue fieldValue) {
        this.fieldValue = fieldValue;
    }

    Field makeAMove(String input) throws InvalidInputException {
        if (input.length() > 2) {
            throw new InvalidInputException(TOO_LONG_INPUT);
        }
        int row = Parser.parseNumber(input.charAt(0));
        int column = Parser.parseNumber(input.charAt(1));
        return new Field(row, column, fieldValue);
    }
}
