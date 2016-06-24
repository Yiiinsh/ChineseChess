package Chess;

/**
 * 棋盘类
 */
import java.util.Map;

public class Board {
    public final int BOARD_WIDTH = 9, BOARD_HEIGHT = 10; // 棋盘大小

    public Map<String, Piece> pieces; // 棋子们
    public char player = 'r'; // 红色棋手
    private Piece[][] cells = new Piece[BOARD_HEIGHT][BOARD_WIDTH]; // 棋子位置记录

    /**
     * 棋子是否在棋盘内
     * **/
    public boolean isInside(int[] position) {
        return isInside(position[0], position[1]);
    }

    public boolean isInside(int x, int y) {
        return !(x < 0 || x > BOARD_HEIGHT
                || y < 0 || y > BOARD_WIDTH);
    }

    /**
     * 指定位置是否没有棋子
     * **/
    public boolean isEmpty(int[] position) {
        return isEmpty(position[0], position[1]);
    }

    public boolean isEmpty(int x, int y) {
        return cells[x][y] == null;
    }


    /**
     * 更新棋子位置记录
     * **/
    public boolean update(Piece piece) {
        int[] pos = piece.position;
        cells[pos[0]][pos[1]] = piece;
        return true;
    }

    /**
     * 更新待移动棋子信息
     * **/
    public Piece updatePiece(String key, int[] newPos) {
        Piece orig = pieces.get(key);
        Piece inNewPos = getPiece(newPos);
        /* If the new slot has been taken by another piece, then it will be killed.*/
        if (inNewPos != null)
            pieces.remove(inNewPos.key);
        /* Clear original slot and updatePiece new slot.*/
        int[] origPos = orig.position;
        cells[origPos[0]][origPos[1]] = null;
        cells[newPos[0]][newPos[1]] = orig;
        orig.position = newPos;
        player = (player == 'r') ? 'b' : 'r';
        return inNewPos;
    }

    /**
     * 棋子回退
     * **/
    public boolean backPiece(String key) {
        int[] origPos = pieces.get(key).position;
        cells[origPos[0]][origPos[1]] = pieces.get(key);
        return true;
    }

    /**
     * 获取特定坐标棋子信息
     * **/
    public Piece getPiece(int[] pos) {
        return getPiece(pos[0], pos[1]);
    }

    public Piece getPiece(int x, int y) {
        return cells[x][y];
    }
}
