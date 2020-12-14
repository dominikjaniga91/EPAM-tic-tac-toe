package tictactoe;

import java.util.Scanner;

class Game {

    private final Scanner scanner = new Scanner(System.in);
    private final Parser parser = new Parser();
    private final GameBoard gameBoard = new GameBoard();
    private final Reader reader = new Reader(scanner);
    private final Player player = new Player(parser);
    private final Computer computer = new Computer();
    private int counter = 0;

    void play() throws InvalidInputException {
        gameBoard.setUpGameBoard();
        System.out.println(" Choose game mark (X or O)");
        String mark = reader.readUserInput();
        FieldValue playerValue = player.selectTheGameMark(mark);
        computer.selectTheGameMark(playerValue);
        gameBoard.printGameBoard();
        String userInput;
        while (counter < 9) {
            System.out.println("Make a move - chose position (format: 00)");
            userInput = reader.readUserInput();
            Field userField = player.makeAMove(userInput);
            gameBoard.setValue(userField);
            Field computerField = computer.makeAMove();
            gameBoard.setValue(computerField);
            gameBoard.printGameBoard();
            counter++;
        }
    }

}
