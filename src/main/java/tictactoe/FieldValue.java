package tictactoe;

enum FieldValue {

    X('X'), O('O'), EMPTY(' ');

    private final char value;

    FieldValue(char value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);

    }
}
