package tictactoe;

public class Parser {

    int parse(String input) {
        if(input.matches("[0-9]")) {
            return Integer.parseInt(input);
        }
        throw new IllegalArgumentException("Invalid input");
    }
}
