package tictactoe;

class GameBoard {

    private char[][] gameBoard = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '} };

    void print() {

        for (char[] row : gameBoard) {
            for(char c : row) {
                System.out.print("[" + c + "]");
            }
            System.out.println();
        }
    }

    char[][] getGameBoard() {
        return gameBoard;
    }

    boolean setValue(int position1, int position2, Field value) {

        if (isOutOfRange(position1) && isOutOfRange(position2)) {
            throw new IllegalArgumentException();
        }
        if (gameBoard[position1][position2] != ' ') {
            gameBoard[position1][position2] = value.getValue();
            return true;
        }
        return false;
    }

    private boolean isOutOfRange(int position) {
        return position < 0 || position > 2;
    }
}
