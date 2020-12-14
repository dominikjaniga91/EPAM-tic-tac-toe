package tictactoe;

import java.util.Random;

public class Computer {

    private FieldValue fieldValue;
    private final Random random = new Random();

    void selectTheGameMark(FieldValue playerMark) {

        this.fieldValue = FieldValue.X.equals(playerMark) ? FieldValue.O
                                                          : FieldValue.X;
    }

    Field makeAMove() {
        int firstPosition = random.nextInt(3);
        int secondPosition = random.nextInt(3);
        return new Field(firstPosition, secondPosition, fieldValue);
    }
}
