package org.example.leetcode.string;

import java.util.ArrayList;
import java.util.List;

public class Cells_in_a_Range_on_an_Excel_Sheet {
    public static List<String> cellsInRange(String s) {

        int initialCol = s.charAt(0);
        int finalCol = s.charAt(3);

        int initialRow = s.charAt(1);
        int finalRow = s.charAt(4);

        List<String> cells = new ArrayList<>();
        char[] ch = new char[2];

        for(int c = initialCol; c <= finalCol; c++){
            for(int r = initialRow; r <= finalRow; r++){
                ch[0] = (char)c;
                ch[1] = (char)r;
                cells.add(String.valueOf(ch));
            }
        }

        return cells;
    }
}
