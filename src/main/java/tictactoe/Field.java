package tictactoe;

import java.util.Objects;

public class Field {

    private final int firstPosition;
    private final int secondPosition;
    private FieldValue fieldValue;

    public Field(int firstPosition, int secondPosition, FieldValue fieldValue) {
        this.firstPosition = firstPosition;
        this.secondPosition = secondPosition;
        this.fieldValue = fieldValue;
    }

    boolean isEmpty() {
        return fieldValue == FieldValue.EMPTY;
    }

    public void setFieldValue(Field field) {
        this.fieldValue = field.fieldValue;
    }

    public int getFirstPosition() {
        return firstPosition;
    }

    public int getSecondPosition() {
        return secondPosition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Field field = (Field) o;
        return fieldValue == field.fieldValue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstPosition, secondPosition);
    }

    @Override
    public String toString() {
        return fieldValue.toString();
    }
}
