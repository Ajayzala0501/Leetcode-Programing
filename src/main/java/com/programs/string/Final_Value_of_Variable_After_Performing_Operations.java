package org.example.leetcode.string;

public class Final_Value_of_Variable_After_Performing_Operations {
    public static int finalValueAfterOperations(String[] operations) {
        int X = 0;
        for (String s : operations)
        {
            if(s.charAt(1)=='+')
                X++;
            else
                X--;
//            if(s.equals("++X")) ++X;
//            else if (s.equals("X++")) X++;
//            else if (s.equals("--X")) --X;
//            else X--;
        }
        return X;
    }
}
