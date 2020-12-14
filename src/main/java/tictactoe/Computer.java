package tictactoe;

public class Computer {

    private FieldValue fieldValue;


    void selectTheGameMark(String playerMark) {

        this.fieldValue = "X".equals(playerMark) ? FieldValue.O
                                                 : FieldValue.X;
    }
}
