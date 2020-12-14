package tictactoe;

public class Player {

    private final Reader reader;
    private final Parser parser;

    public Player(Reader reader, Parser parser) {
        this.reader = reader;
        this.parser = parser;
    }

    Field makeAMove() {
        String input = reader.readUserInput();
        if (input.length() > 2) {
            throw new IllegalArgumentException("Too long input value");
        }
        int firstPosition = parser.parse(input.charAt(0));
        int secondPosition = parser.parse(input.charAt(1));
        return new Field(firstPosition, secondPosition);
    }

    FieldValue selectTheGameMark() {
        String mark = reader.readUserInput();
        boolean validGameMark = mark.equals("X") || mark.equals("O");
        if (validGameMark) {
            return FieldValue.valueOf(mark);
        }
        throw new IllegalArgumentException("Invalid game mark " + mark);
    }
}
