package tictactoe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static tictactoe.Console.print;

class Game {

    private final Scanner scanner = new Scanner(System.in);
    private final GameBoard gameBoard = new GameBoard(3);
    private final Reader reader = new Reader(scanner);
    private final List<HumanPlayer> players = new ArrayList<>();
    private final Arbiter arbiter = new Arbiter(gameBoard);
    private boolean endsGame = false;


    void play() throws OutOfRangeException {
        print("Here's the Tic Tac Toe game, enjoy!");
        gameBoard.setUpGameBoard();

        setUpPlayers();
        do {
            for (HumanPlayer player : players) {
                gameBoard.printGameBoard();
                Field field = getPlayerMove(player);
                gameBoard.setValue(field);
                endsGame = arbiter.judge(field);
            }
        } while (!endsGame);

    }

    void setUpPlayers() {
        players.add(new HumanPlayer(FieldValue.X));
        players.add(new HumanPlayer(FieldValue.O));
    }

    private Field getPlayerMove(HumanPlayer humanPlayer) {

        print("Make a move - chose position (format: 00)");
        Field field = null;
        while (field == null) {
            try {
                String userInput = reader.readUserInput();
                field = humanPlayer.makeAMove(userInput);
            } catch (InvalidInputException ex) {
                print(ex.getMessage());
            }
        }
        return field;
    }
}
