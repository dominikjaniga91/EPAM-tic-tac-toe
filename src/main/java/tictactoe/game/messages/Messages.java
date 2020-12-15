package tictactoe.game.messages;

public enum Messages {

    GREETING("Here's the Tic Tac Toe game, enjoy!"),
    USER_PROMPT("Make a move - chose position (format: 00)"),
    GAME_BOARD("Actual game board: ");


    private final String value;

    Messages(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
