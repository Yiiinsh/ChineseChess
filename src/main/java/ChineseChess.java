import Chess.Board;
import Controller.GameController;
import View.GameView;

/**
 * 启动函数
 */
public class ChineseChess {
    private Board board;

    private GameController controller;
    private GameView view;

    public static void main(String[] args) throws InterruptedException {
        ChineseChess game = new ChineseChess();
        game.init();
        game.run();
    }

    public void init() {
        controller = new GameController();
        board = controller.playChess();

        view = new GameView(controller);
        view.init(board);
    }

    public void run() throws InterruptedException {
        while (controller.hasWin(board) == 'x') {
            view.showPlayer('r');
            /* User in. */
            while (board.player == 'r')
                Thread.sleep(1000);

            if (controller.hasWin(board) != 'x')
                view.showWinner('r');
            view.showPlayer('b');
            /* AI in. */
            controller.responseMoveChess(board, view);
        }
        view.showWinner('b');
    }
}
