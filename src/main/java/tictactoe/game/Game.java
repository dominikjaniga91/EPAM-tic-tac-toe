package tictactoe.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static tictactoe.game.Console.print;
import static tictactoe.game.Console.printError;
import static tictactoe.game.messages.Messages.*;

public class Game {

    private final Scanner scanner = new Scanner(System.in);
    private final GameBoard gameBoard = new GameBoard(3);
    private final Reader reader = new Reader(scanner);
    private final List<HumanPlayer> players = new ArrayList<>();
    private final Arbiter arbiter = new Arbiter(gameBoard);
    private boolean endsGame = false;


    public void play() {
        print(GREETING);
        gameBoard.setUpGameBoard();
        setUpPlayers();

        do {
            for (HumanPlayer player : players) {
                gameBoard.printGameBoard();
                Field field = getPlayerMove(player);
                endsGame = arbiter.judge(field);
            }
        } while (!endsGame);

    }

    private void setUpPlayers() {
        players.add(new HumanPlayer(FieldValue.X));
        players.add(new HumanPlayer(FieldValue.O));
    }

    private Field getPlayerMove(HumanPlayer humanPlayer) {

        print(USER_PROMPT);
        Field field = null;
        boolean isSet = false;
        while (!isSet) {
            try {
                String userInput = reader.readUserInput();
                field = humanPlayer.makeAMove(userInput);
                isSet = gameBoard.setValue(field);
            } catch (InvalidInputException | OutOfRangeException ex) {
                printError(ex.getMessage());
            }
        }
        return field;
    }
}
