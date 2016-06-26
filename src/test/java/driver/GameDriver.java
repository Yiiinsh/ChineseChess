package driver;

import Chess.ChineseChess;
import org.junit.Test;

/**
 * Created by kimmin on 6/26/16.
 */
public class GameDriver {

    private ChineseChess chineseChess = new ChineseChess();

//    @Test
    public void testInit(){
        chineseChess.init();
    }

//    @Test
    public void testRun(){
        try {
            chineseChess.run();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }


}
