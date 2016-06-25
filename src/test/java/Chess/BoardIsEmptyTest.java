package Chess;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * BoardIsEmpty Test
 */

@RunWith(Parameterized.class)
public class BoardIsEmptyTest {
    private static Board board = Rules.initBoard();

    private int pos_x;
    private int pos_y;
    private boolean expected;

    public BoardIsEmptyTest(int pos_x, int pos_y, boolean expected) {
        this.pos_x = pos_x;
        this.pos_y = pos_y;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}: isEmpty")
    public static Iterable<Object[]> data() {
        ArrayList<Object[]> for_return = new ArrayList<>();

        /**
         * Read data from csv
         */
        try {
            BufferedReader reader = new BufferedReader(new FileReader("BoardIsEmptyTestCase.csv"));
            reader.readLine(); // eliminate headers
            String line = null;
            while((line=reader.readLine())!=null){
                String item[] = line.split(",");
                int x = Integer.parseInt(item[3].replaceAll("\"", ""));
                int y = Integer.parseInt(item[4].replaceAll("\"", ""));
                if (item[7].equals("FALSE")){
                    for_return.add(new Object[]{x,y,false});
                }
                else {
                    for_return.add(new Object[]{x,y,true});
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return for_return;
    }

    @Test
    public void testIsInside() {
        Assert.assertEquals(expected, board.isEmpty(pos_x, pos_y));
//        System.out.printf("%d,%d : %s\n",pos_x, pos_y, expected);
    }
}
