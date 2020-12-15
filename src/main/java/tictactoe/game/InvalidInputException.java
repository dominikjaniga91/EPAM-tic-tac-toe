package tictactoe.game;

import tictactoe.game.messages.ExceptionMessage;

class InvalidInputException extends Exception {

    InvalidInputException(ExceptionMessage message) {
        super(message.toString());
    }
}
