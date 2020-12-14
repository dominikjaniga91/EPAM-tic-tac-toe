package tictactoe;

import java.util.Scanner;
import static tictactoe.Console.print;

class Game {

    private final Scanner scanner = new Scanner(System.in);
    private final Parser parser = new Parser();
    private final GameBoard gameBoard = new GameBoard();
    private final Reader reader = new Reader(scanner);
    private final Player player = new Player(parser);
    private final Computer computer = new Computer();
    private int counter = 0;

    void play() {

        gameBoard.setUpGameBoard();
        FieldValue playerValue = getPlayerSelection();
        computer.selectTheGameMark(playerValue);
        gameBoard.printGameBoard();

        while (counter < 9) {
            Field userField = getPlayerMove();
            gameBoard.setValue(userField);
            Field computerField = computer.makeAMove();
            gameBoard.setValue(computerField);
            gameBoard.printGameBoard();
            counter++;
        }
    }

    private Field getPlayerMove() {

        print("Make a move - chose position (format: 00)");
        Field field = null;
        while (field == null) {
            try {
                String userInput = reader.readUserInput();
                field = player.makeAMove(userInput);
            } catch (InvalidInputException ex) {
                print(ex.getMessage());
            }
        }
        return field;
    }

    private FieldValue getPlayerSelection() {
        print(" Choose game mark (X or O)");
        FieldValue playerValue = null;
        while (playerValue == null) {
            try {
                String mark = reader.readUserInput();
                playerValue = player.selectTheGameMark(mark);
            } catch (InvalidInputException ex) {
                print(ex.getMessage());
            }
        }
        return playerValue;
    }
}
