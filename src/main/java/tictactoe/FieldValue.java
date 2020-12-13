package tictactoe;

enum FieldValue {

    X('X'), O('O');

    private final char value;

    FieldValue(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }
}
