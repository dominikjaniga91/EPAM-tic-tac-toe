package tictactoe;

import tictactoe.messages.ExceptionMessage;

class InvalidInputException extends Exception {

    public InvalidInputException(ExceptionMessage message) {
        super(message.toString());
    }
}
