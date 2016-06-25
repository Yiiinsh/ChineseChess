package driver;

import Chess.Board;
import Controller.GameController;
import driver.util.ValidateUtil;
import org.junit.Before;
import org.junit.Test;
import status.GameStatus;
import status.Status;

/**
 * Created by kimmin on 6/26/16.
 */
public class ControllerDriver {

    private GameController controller;

    @Before
    public void beforeTest(){
        this.controller = new GameController();
        System.out.println("===============================");
        System.out.println("Integration - Game Controller:");
    }

    @Test
    public void testInitBoard(){
        this.controller.initBoard();
        if(GameStatus.status.equals(Status.READY)){
            System.out.println("Controller Init Board PASSED");
        }else{
            System.out.println("Controller Init Board FAILURE");
        }
    }

    @Test
    public void testPlayChess(){
        Board board = this.controller.playChess();
        boolean b = ValidateUtil.vatedate(board);
        if(b){
            System.out.println("Controller Play Chess PASSED");
        }else{
            System.out.println("Controller Play Chess FAILURE");
        }
    }

}
