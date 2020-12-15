package tictactoe.game;

class Arbiter {

    private final GameBoard gameBoard;

    Arbiter(GameBoard gameBoard) {
        this.gameBoard = gameBoard;
    }

    boolean judge(Field field) {
        var board = gameBoard.getGameBoard();
        return checkRow(field, board) ||
                checkColumn(field, board) ||
                checkFirstDiagonal(field, board) ||
                checkSecondDiagonal(field, board);
    }

    private boolean checkRow(Field field, Field[][] board) {

        int row = field.getRow();
        for (Field boardField : board[row]) {
            if(!boardField.equals(field)) {
                return false;
            }
        }
        return true;
    }

    private boolean checkColumn(Field userField, Field[][] board) {

        int column = userField.getColumn();
        for (Field[] field : board) {
            if(!userField.equals(field[column])) {
                return false;
            }
        }
        return true;
    }


    private boolean checkFirstDiagonal(Field userField, Field[][] board) {

        if (board[0][0].isEmpty())
            return false;

        for (int i = 0; i < board.length ; i++) {
            if(!userField.equals(board[i][i])) {
                return false;
            }
        }
        return true;
    }

    private boolean checkSecondDiagonal(Field userField, Field[][] board) {
        int end = board.length - 1;

        if (board[0][end].isEmpty())
            return false;

        for (int i = 0; i < end ; i++) {
            if(!userField.equals(board[i][end - i])) {
                return false;
            }
        }
        return true;
    }
}
