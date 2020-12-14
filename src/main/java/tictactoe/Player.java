package tictactoe;

public class Player {

    private final Parser parser;
    private FieldValue fieldValue;

    public Player(Parser parser) {
        this.parser = parser;
    }

    Field makeAMove(String input) {
        if (input.length() > 2) {
            throw new IllegalArgumentException("Too long input value");
        }
        int firstPosition = parser.parse(input.charAt(0));
        int secondPosition = parser.parse(input.charAt(1));
        return new Field(firstPosition, secondPosition, fieldValue);
    }

    void selectTheGameMark(String mark) {
        boolean validGameMark = mark.equals("X") || mark.equals("O");
        if (validGameMark) {
            this.fieldValue = FieldValue.valueOf(mark);
        }
        throw new IllegalArgumentException("Invalid game mark " + mark);
    }
}
