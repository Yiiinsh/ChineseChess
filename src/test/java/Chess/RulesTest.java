package Chess;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Rules Test
 */
public class RulesTest {
    @Test
    public void test_pRules() {
        /**
         * TC1.030
         */
        Board board = Rules.initBoard();
        board.updatePiece("rp1", new int[]{4,4});
        board.updatePiece("bj1", new int[]{4,3});
        board.updatePiece("rj1", new int[]{4,2});
        ArrayList<int[]> expectations = new ArrayList<>();
        expectations.add(new int[]{4,5});
        expectations.add(new int[]{4,6});
        expectations.add(new int[]{4,7});
        expectations.add(new int[]{4,8});
        expectations.add(new int[]{0,4});
        expectations.add(new int[]{5,4});
        Assert.assertArrayEquals(expectations.toArray(),Rules.getNextMove("rp1", new int[]{4,4}, board).toArray());

        /**
         * TC1.031
         */
        board = Rules.initBoard();
        board.updatePiece("rp1", new int[]{4,4});
        board.updatePiece("bj1", new int[]{4,3});
        board.updatePiece("bj0", new int[]{4,2});
        expectations = new ArrayList<>();
        expectations.add(new int[]{4,5});
        expectations.add(new int[]{4,6});
        expectations.add(new int[]{4,7});
        expectations.add(new int[]{4,8});
        expectations.add(new int[]{4,2});
        expectations.add(new int[]{0,4});
        expectations.add(new int[]{5,4});
        Assert.assertArrayEquals(expectations.toArray(),Rules.getNextMove("rp1", new int[]{4,4}, board).toArray());

        /**
         * TC1.032
         */
        board = Rules.initBoard();
        board.updatePiece("rp1", new int[]{4,4});
        board.updatePiece("rj0", new int[]{2,4});
        expectations = new ArrayList<>();
        expectations.add(new int[]{4,5});
        expectations.add(new int[]{4,6});
        expectations.add(new int[]{4,7});
        expectations.add(new int[]{4,8});
        expectations.add(new int[]{4,3});
        expectations.add(new int[]{4,2});
        expectations.add(new int[]{4,1});
        expectations.add(new int[]{4,0});
        expectations.add(new int[]{5,4});
        Assert.assertArrayEquals(expectations.toArray(),Rules.getNextMove("rp1", new int[]{4,4}, board).toArray());

        /**
         * TC1.033
         */
        board = Rules.initBoard();
        board.updatePiece("rp1", new int[]{4,4});
        board.updatePiece("bj0", new int[]{2,4});
        expectations = new ArrayList<>();
        expectations.add(new int[]{4,5});
        expectations.add(new int[]{4,6});
        expectations.add(new int[]{4,7});
        expectations.add(new int[]{4,8});
        expectations.add(new int[]{4,3});
        expectations.add(new int[]{4,2});
        expectations.add(new int[]{4,1});
        expectations.add(new int[]{4,0});
        expectations.add(new int[]{2,4});
        expectations.add(new int[]{5,4});
        Assert.assertArrayEquals(expectations.toArray(),Rules.getNextMove("rp1", new int[]{4,4}, board).toArray());
    }
}
