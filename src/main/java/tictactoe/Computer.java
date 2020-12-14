package tictactoe;

public class Computer {

    private FieldValue fieldValue;

    void selectTheGameMark(FieldValue playerMark) {

        this.fieldValue = FieldValue.X.equals(playerMark) ? FieldValue.O
                                                          : FieldValue.X;
    }
}
