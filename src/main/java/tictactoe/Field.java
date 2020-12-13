package tictactoe;

enum Field {

    X('X'), O('O');

    private final char value;

    Field(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }
}
