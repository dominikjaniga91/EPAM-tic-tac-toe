package tictactoe;

import tictactoe.messages.ExceptionMessage;

class OutOfRangeException extends Exception {

    public OutOfRangeException(ExceptionMessage message) {
        super(message.toString());
    }
}
