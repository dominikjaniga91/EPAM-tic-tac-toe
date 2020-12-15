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


    protected boolean checkFirstDiagonal(Field userField, Field[][] fields) {

        if (fields[0][0].isEmpty())
            return false;

        for (int i = 0; i < fields.length ; i++) {
            if(!userField.equals(fields[i][i])) {
                return false;
            }
        }
        return true;
    }

    protected boolean checkSecondDiagonal(Field userField, Field[][] fields) {
        int end = fields.length - 1;

        if (fields[0][end].isEmpty())
            return false;

        for (int i = 0; i < end ; i++) {
            if(!userField.equals(fields[i][end - i])) {
                return false;
            }
        }
        return true;
    }
}
