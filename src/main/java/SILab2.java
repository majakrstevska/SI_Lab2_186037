import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class SILab2 {
    public static List<String> function(List<String> list) {
        if (list.size() <= 0) {//A
            throw new IllegalArgumentException("List length should be greater than 0");//B
        }
        List<String> numMines = new ArrayList<>();//C
        for (int i = 0; i < list.size(); i++) {//C
            if (!list.get(i).equals("#")) {//D
                int num = 0;//D
                if (i - 1 >= 0 && list.get(i - 1).equals("#")) {//E
                    num++;//F
                }
                if (i + 1 < list.size() && list.get(i + 1).equals("#")) {//G
                    num++;//H
                }
                numMines.add(String.valueOf(num));//I
            } else {//J
                numMines.add(list.get(i));//K
            }
        }
        return numMines;//L
    }

}






