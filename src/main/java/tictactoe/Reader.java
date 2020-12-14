package tictactoe;

import java.util.Scanner;

public class Reader {

    private final Scanner scanner;

    public Reader(Scanner scanner) {
        this.scanner = scanner;
    }

    String readUserInput() {
        return scanner.nextLine();
    }

}
