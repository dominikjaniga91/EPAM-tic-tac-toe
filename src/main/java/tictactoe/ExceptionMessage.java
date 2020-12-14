package tictactoe;

enum ExceptionMessage {

    NOT_A_NUMBER("Input should be a number"),
    TOO_LONG_INPUT("Provided input is too long - only two digits"),
    INVALID_GAME_MARK("Invalid input - please provide 'X' or 'O' "),
    OUT_OF_RANGE("Provided position is out of board game's range");

    private final String value;

    ExceptionMessage(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
