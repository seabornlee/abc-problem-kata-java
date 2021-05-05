public class Block {
    private final String sideOne;
    private final String sideTwo;

    public Block(String sideOne, String sideTwo) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    boolean contains(String letter) {
        return sideOne.equals(letter) || sideTwo.equals(letter);
    }
}
