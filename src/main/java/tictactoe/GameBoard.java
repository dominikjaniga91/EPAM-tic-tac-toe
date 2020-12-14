package tictactoe;

import java.util.ArrayList;
import java.util.List;

class GameBoard {

    private List<Field> gameBoard = new ArrayList<>();

    void setUpGameBoard() {

        gameBoard.add(new Field(0, 0, FieldValue.EMPTY));
        gameBoard.add(new Field(0, 1, FieldValue.EMPTY));
        gameBoard.add(new Field(0, 2, FieldValue.EMPTY));
        gameBoard.add(new Field(1, 0, FieldValue.EMPTY));
        gameBoard.add(new Field(1, 1, FieldValue.EMPTY));
        gameBoard.add(new Field(1, 2, FieldValue.EMPTY));
        gameBoard.add(new Field(2, 0, FieldValue.EMPTY));
        gameBoard.add(new Field(2, 1, FieldValue.EMPTY));
        gameBoard.add(new Field(2, 2, FieldValue.EMPTY));
    }

    void printGameBoard() {

        for (int i = 0; i < gameBoard.size(); i++) {

            System.out.printf("[%s]", gameBoard.get(i));
            if ((i + 1) % 3 == 0) {
                System.out.println();
            }
        }
    }

    boolean setValue(Field userField) {

        Field gameBoardField = findField(userField);

        if (gameBoardField.isEmpty()) {
            gameBoardField.setFieldValue(userField);
            return true;
        }
        return false;
    }

    Field findField(Field field) {
        return gameBoard.stream()
                .filter(f -> f.equals(field))
                .findFirst().orElseThrow(IllegalArgumentException::new);
    }
}
