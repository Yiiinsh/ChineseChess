package driver;

import Algorithm.AlphaBetaNode;
import Algorithm.SearchModel;
import Chess.Board;
import driver.board.TestBoardData;
import driver.util.ReadCsvUtil;
import driver.util.ValidateUtil;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by kimmin on 6/26/16.
 */
public class SearchModelDriver {


    private SearchModel searchModel;

    @Before
    public void beforeTestSearchModel(){
        this.searchModel = new SearchModel();
    }

    @Test(timeout = 60000)
    public void testSearchModel(){
        System.out.println("===============================");
        System.out.println("Integration - Search Model:");
        int i=0;
        for(Board board : TestBoardData.boards){
            AlphaBetaNode node = searchModel.search(board);
            boolean b = ValidateUtil.validate(node);
            if(b){
                System.out.println("Board" + i + " PASSED");
            }else{
                System.out.println("Board" + i + " FAILED");
            }
            i++;
        }
    }

}
