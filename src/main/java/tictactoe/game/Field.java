package tictactoe.game;

import java.util.Objects;

class Field {

    private final int row;
    private final int column;
    private FieldValue fieldValue;

    Field(int row, int column, FieldValue fieldValue) {
        this.row = row;
        this.column = column;
        this.fieldValue = fieldValue;
    }

    boolean isEmpty() {
        return fieldValue == FieldValue.EMPTY;
    }

    void setFieldValue(Field field) {
        this.fieldValue = field.fieldValue;
    }

    int getRow() {
        return row;
    }

    int getColumn() {
        return column;
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
        return Objects.hash(row, column);
    }

    @Override
    public String toString() {
        return fieldValue.toString();
    }
}
