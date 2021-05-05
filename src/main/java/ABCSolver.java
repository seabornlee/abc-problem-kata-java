import java.util.List;

public class ABCSolver {
    private List<Block> blocks;

    public ABCSolver(List<Block> blocks) {
        this.blocks = blocks;
    }

    public boolean canMakeWord(String word) {
        return blocks.stream().anyMatch(block -> block.contains(word));
    }

}
