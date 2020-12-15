package tictactoe.game;

import tictactoe.game.messages.ExceptionMessage;

class OutOfRangeException extends Exception {

    OutOfRangeException(ExceptionMessage message) {
        super(message.toString());
    }
}
