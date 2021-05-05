import java.util.ArrayList;
import java.util.List;

public class ABCSolver {
    private List<Block> blocks;

    public ABCSolver(List<Block> blocks) {
        this.blocks = blocks;
    }

    public boolean canMakeWord(String word) {
        List<Block> unusedBlocks = new ArrayList<>(blocks);

        char[] chars = word.toCharArray();
        for (char ch : chars) {
            int index = indexOf(unusedBlocks, ch);
            if (index <= -1) {
                return false;
            }

            unusedBlocks.remove(index);
        }
        return true;
    }

    private int indexOf(List<Block> unusedBlocks, char ch) {
        for (int i = 0; i < unusedBlocks.size(); i++) {
            if (unusedBlocks.get(i).contains(ch)) {
                return i;
            }
        }
        return -1;
    }
}
