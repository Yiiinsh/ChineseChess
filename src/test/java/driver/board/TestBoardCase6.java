package driver.board;

import Chess.Piece;

/**
 * Created by kimmin on 6/26/16.
 */
public class TestBoardCase6 extends TestBoardBase {

    public TestBoardCase6(){
        super();
        this.pieces.put("rx0", new Piece("rx0", new int[]{0,-1}));
    }

}
