package tictactoe;

import java.util.Objects;

public class Field {

    private final int firstPosition;
    private final int secondPosition;

    public Field(int firstPosition, int secondPosition) {
        this.firstPosition = firstPosition;
        this.secondPosition = secondPosition;
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
