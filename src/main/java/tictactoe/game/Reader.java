package tictactoe.game;

import java.util.Scanner;

class Reader {

    private final Scanner scanner;

    Reader(Scanner scanner) {
        this.scanner = scanner;
    }

    String readUserInput() {
        return scanner.nextLine();
    }

}
