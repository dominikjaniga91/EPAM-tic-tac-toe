package tictactoe;

import java.util.Scanner;

public class Console {

    private final Scanner scanner;
    private final Parser parser;

    public Console(Scanner scanner, Parser parser) {
        this.scanner = scanner;
        this.parser = parser;
    }

    Field readUserInput(String input) {
        if (input.length() > 2) {
            throw new IllegalArgumentException("Invalid input");
        }
        int firstPosition = parser.parse(input.charAt(0));
        int secondPosition = parser.parse(input.charAt(1));
        return new Field(firstPosition, secondPosition);
    }

}
