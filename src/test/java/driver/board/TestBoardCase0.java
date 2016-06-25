package driver.board;

import Chess.Board;
import Chess.Piece;

/**
 * Created by kimmin on 6/26/16.
 */
public class TestBoardCase0 extends TestBoardBase {


    public TestBoardCase0(){
        super();
        this.pieces.put("rz0",new Piece("rz0", new int[]{7,0}));
    }

}
