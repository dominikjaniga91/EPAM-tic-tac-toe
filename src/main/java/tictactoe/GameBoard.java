package tictactoe;

import java.util.List;

class GameBoard {

    private List<Field> gameBoard = List.of( new Field(0, 0, FieldValue.EMPTY), new Field(0, 1, FieldValue.EMPTY), new Field(0, 2, FieldValue.EMPTY),
                                            new Field(1, 0, FieldValue.EMPTY), new Field(1, 1, FieldValue.EMPTY), new Field(1, 2, FieldValue.EMPTY),
                                            new Field(2, 0, FieldValue.EMPTY), new Field(2, 1, FieldValue.EMPTY), new Field(2, 2, FieldValue.EMPTY));


    boolean setValue(Field userField) {

        Field gameBoardField = findField(userField);

        if (gameBoardField.isEmpty()) {
           gameBoardField = userField;
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
