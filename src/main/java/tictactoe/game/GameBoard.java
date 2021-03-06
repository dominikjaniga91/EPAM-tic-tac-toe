package tictactoe.game;

import tictactoe.game.messages.ExceptionMessage;
import tictactoe.game.messages.Messages;
import static tictactoe.game.Console.print;

class GameBoard {

    private final Field[][] gameBoard;
    private final int size;

    GameBoard(int size) {
        this.size = size;
        gameBoard = setUpGameBoard();
    }

    Field[][] getGameBoard() {
        return gameBoard.clone();
    }

    private Field[][] setUpGameBoard() {
        Field[][] gameBoard = new Field[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                gameBoard[i][j] = new Field(i, j, FieldValue.EMPTY);
            }
        }
        return gameBoard;
    }

    void printGameBoard() {
       print(Messages.GAME_BOARD);
        print("   0  1  2");
        for (int i = 0; i < gameBoard.length; i++) {
            System.out.print(i + " ");
            for (Field field : gameBoard[i]) {
                System.out.printf("[%s]", field);
            }
            print("");
        }
    }

    boolean setValue(Field field) throws OutOfRangeException {
        int row = field.getRow();
        int column = field.getColumn();
        boolean isOutOfRange = row < 0 || row > size - 1 || column < 0 || column > size - 1;

        if (isOutOfRange) {
            throw new OutOfRangeException(ExceptionMessage.OUT_OF_RANGE);
        }
        Field gameBoardField = gameBoard[row][column];

        if (gameBoardField.isEmpty()) {
            gameBoardField.setFieldValue(field);
            return true;
        }
        return false;
    }
}
