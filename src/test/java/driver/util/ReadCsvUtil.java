package driver.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by kimmin on 6/26/16.
 */
public class ReadCsvUtil {

    public static List<String[]> readCsv(String filename){
        try{
            String fstr = ReadCsvUtil.class.getResource("/" + filename).getFile();
            File file = new File(fstr);
            BufferedReader br = new BufferedReader(
                    new FileReader(file)
            );
            String line = null;
            List<String[]> list = new ArrayList<>();
            while((line = br.readLine()) != null){
                String[] strs = line.split(",");
                list.add(strs);
            }
            return list;
        }catch (Throwable e){
            e.printStackTrace();
            return null;
        }
    }

}
