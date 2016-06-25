package driver;

import Algorithm.EvalModel;
import Chess.Board;
import driver.board.TestBoardData;
import driver.util.ReadCsvUtil;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by kimmin on 6/25/16.
 */
public class EvalModelDriver {


    private EvalModel evalModel;

    @Before
    public void initModel(){
        this.evalModel = new EvalModel();
    }


    @Test
    public void testEval(){

        for(Board board : TestBoardData.boards){
            List<String[]> list = ReadCsvUtil.readCsv("driver_001_001");
            for(String[] strs: list){
                int ret =  evalModel.eval(board, strs[1].charAt(0));
            }
        }

    }

}
