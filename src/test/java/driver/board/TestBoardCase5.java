package driver.board;

import Chess.Piece;

/**
 * Created by kimmin on 6/26/16.
 */
public class TestBoardCase5 extends TestBoardBase {

    public TestBoardCase5(){
        super();
        this.pieces.put("rx0", new Piece("rx0", new int[]{-1,0}));
    }

}
