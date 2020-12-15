package tictactoe.game;


import tictactoe.game.messages.ExceptionMessage;
import tictactoe.game.messages.Messages;

class GameBoard {

    private final Field[][] gameBoard;
    private final int size;

    GameBoard(int size) {
        this.size = size;
        gameBoard = new Field[size][size];
    }

    Field[][] getGameBoard() {
        return gameBoard.clone();
    }

    void setUpGameBoard() {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                gameBoard[i][j] = new Field(i, j, FieldValue.EMPTY);
            }
        }
    }

    void printGameBoard() {
       Console.print(Messages.GAME_BOARD);
        for (Field[] fields : gameBoard) {
            for (Field field : fields) {
                System.out.printf("[%s]", field);
            }
            System.out.println();
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
