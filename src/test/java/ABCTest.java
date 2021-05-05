import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class ABCTest {
    @Test
    public void should_make_one_letter_word() {
        List<Block> blocks = new ArrayList<>();
        blocks.add(new Block("A", "N"));
        ABCSolver abcSolver = new ABCSolver(blocks);
        assertTrue(abcSolver.canMakeWord("A"));
        assertTrue(abcSolver.canMakeWord("N"));
    }
}
