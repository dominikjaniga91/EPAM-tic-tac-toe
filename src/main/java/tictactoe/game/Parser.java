package tictactoe.game;

import static tictactoe.game.messages.ExceptionMessage.*;
class Parser {

    static int parseNumber(char input) throws InvalidInputException {
        var position = String.valueOf(input);
        if(position.matches("[0-9]")) {
            return Integer.parseInt(position);
        }
        throw new InvalidInputException(NOT_A_NUMBER);
    }
}
