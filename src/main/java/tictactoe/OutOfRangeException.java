package tictactoe;

class OutOfRangeException extends Exception {

    public OutOfRangeException(ExceptionMessage message) {
        super(message.toString());
    }
}
