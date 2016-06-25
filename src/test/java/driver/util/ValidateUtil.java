package driver.util;

import Algorithm.AlphaBetaNode;
import Chess.Board;

/**
 * Created by kimmin on 6/26/16.
 */
public class ValidateUtil {

    public static boolean validate(AlphaBetaNode node){
        if(!(node.from[0] >=0 && node.from[1] <= 9)) return false;
        if(!(node.to[0] >=0 && node.to[1] <= 9)) return false;
        return true;
    }

    public static boolean vatedate(Board board){
        return true;
    }

}
