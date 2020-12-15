package tictactoe;

class Arbiter {

    private final GameBoard gameBoard;

    public Arbiter(GameBoard gameBoard) {
        this.gameBoard = gameBoard;
    }

    protected boolean checkRow(Field userField, Field[][] fields) {

        int row = userField.getRow();
        for (Field field : fields[row]) {
            if(!field.equals(userField)) {
                return false;
            }
        }
        return true;
    }

    protected boolean checkColumn(Field userField, Field[][] fields) {

        int column = userField.getColumn();
        for (Field[] field : fields) {
            if(!userField.equals(field[column])) {
                return false;
            }
        }
        return true;
    }
}
