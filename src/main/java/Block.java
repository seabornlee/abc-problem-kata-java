public class Block {
    private final char sideOne;
    private final char sideTwo;

    public Block(char sideOne, char sideTwo) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    boolean contains(char letter) {
        return sideOne == letter || sideTwo == letter;
    }
}