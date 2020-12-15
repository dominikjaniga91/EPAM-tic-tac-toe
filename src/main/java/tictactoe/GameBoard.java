package tictactoe;


class GameBoard {

    private final Field[][] gameBoard;
    private final int size;

    public GameBoard(int size) {
        this.size = size;
        gameBoard = new Field[size][size];
    }

    void setUpGameBoard() {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                gameBoard[i][j] = new Field(i, j, FieldValue.EMPTY);
            }
        }
    }

    void printGameBoard() {

        for (Field[] fields : gameBoard) {
            for (Field field : fields) {
                System.out.printf("[%s]", field);
            }
            System.out.println();
        }
    }

    boolean setValue(Field field) throws OutOfRangeException {
        int first = field.getFirstPosition();
        int second = field.getSecondPosition();
        boolean isOutOfRange = first < 0 || first > size - 1 || second < 0 || second > size - 1;

        if (isOutOfRange) {
            throw new OutOfRangeException(ExceptionMessage.OUT_OF_RANGE);
        }
        Field gameBoardField = gameBoard[first][second];

        if (gameBoardField.isEmpty()) {
            gameBoardField.setFieldValue(field);
            return true;
        }
        return false;
    }
}
