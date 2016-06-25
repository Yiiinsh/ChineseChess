package driver.board;

import Chess.Board;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kimmin on 6/26/16.
 */
public class TestBoardData {

    public static List<Board> boards = new ArrayList<>();

    static {
        boards.add(new TestBoardBase());
        boards.add(new TestBoardCase0());
        boards.add(new TestBoardCase2());
        boards.add(new TestBoardCase3());
        boards.add(new TestBoardCase4());
        boards.add(new TestBoardCase5());
        boards.add(new TestBoardCase6());
        boards.add(new TestBoardCase7());
    }

}
