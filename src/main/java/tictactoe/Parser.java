package tictactoe;

public class Parser {

    int parse(char input) {
        var position = String.valueOf(input);
        if(position.matches("[0-9]")) {
            return Integer.parseInt(position);
        }
        throw new IllegalArgumentException("Invalid input");
    }
}
