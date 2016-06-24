package Chess;

/**
 * 基本棋子信息类
 */
public class Piece {
    public String key; // 棋子标识符全称(bj0 => 黑方0号车)
    public char color; // 拥有者颜色(红黑...)
    public char character; // 棋子类型标识(车 => j ...)
    public char index; // 棋子编号(红车1,红车2...)
    public int[] position = new int[2]; // 棋子坐标

    // 构造器
    public Piece(String name, int[] position) {
        this.key = name;
        this.color = name.charAt(0);
        this.character = name.charAt(1);
        this.index = name.charAt(2);
        this.position = position;
    }

}
