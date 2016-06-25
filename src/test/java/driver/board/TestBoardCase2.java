package driver.board;

import Chess.Piece;

/**
 * Created by kimmin on 6/26/16.
 */
public class TestBoardCase2 extends TestBoardBase {

    public TestBoardCase2(){
        super();
        this.pieces.put("rs0", new Piece("rs0", new int[]{5,4}));
    }

}
