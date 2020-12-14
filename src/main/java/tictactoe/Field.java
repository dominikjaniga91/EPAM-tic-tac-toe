package tictactoe;

import java.util.Objects;

public class Field {

    private final int firstPosition;
    private final int secondPosition;
    private final FieldValue fieldValue;

    public Field(int firstPosition, int secondPosition, FieldValue fieldValue) {
        this.firstPosition = firstPosition;
        this.secondPosition = secondPosition;
        this.fieldValue = fieldValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Field field = (Field) o;
        return firstPosition == field.firstPosition &&
                secondPosition == field.secondPosition;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstPosition, secondPosition);
    }
}
