package driver.board;

import Chess.Piece;

/**
 * Created by kimmin on 6/26/16.
 */
public class TestBoardCase1 extends TestBoardBase {

    public TestBoardCase1(){
        super();
        this.pieces.put("rb0", new Piece("rb0", new int[]{5,4}));
    }

}
