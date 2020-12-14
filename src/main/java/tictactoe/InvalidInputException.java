package tictactoe;

class InvalidInputException extends Exception {

    public InvalidInputException(ExceptionMessage message) {
        super(message.toString());
    }
}
