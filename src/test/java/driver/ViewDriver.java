package driver;

import Chess.Board;
import Controller.GameController;
import View.GameView;
import driver.board.TestBoardData;
import driver.util.ReadCsvUtil;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by kimmin on 6/26/16.
 */
public class ViewDriver {

    private GameView view;

    @Before
    public void beforeTest(){
        this.view = new GameView(new GameController());
        System.out.println("===============================");
        System.out.println("Integration - Game View:");
    }

//    @Test
    public void testInit(){
        for(Board board : TestBoardData.boards){
            view.init(board);
        }
    }

//    @Test
    public void testShowWinner(){
        List<String[]> list = ReadCsvUtil.readCsv("driver_004_003");
        for(String[] strs : list){
            view.showWinner(strs[1].charAt(0));
        }
    }



}
