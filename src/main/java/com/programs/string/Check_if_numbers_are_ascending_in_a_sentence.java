package org.example.leetcode.string;

public class Check_if_numbers_are_ascending_in_a_sentence {
    public static boolean areNumbersAscending(String s) {
//        int max = 0;
//        for (String inpStr : s.split(" ")){
//            try{
//               if(Integer.parseInt(inpStr) > max)
//                   max=Integer.parseInt(inpStr);
//               else
//                   return false;
//            }catch (NumberFormatException e){
//            }
//        }
//        return true;

        int prev = 0;
        for (String token : s.split(" ")){
            if(Character.isDigit(token.charAt(0))){
                int num = Integer.parseInt(token);
                if(num<=prev){
                    return false;
                }
                prev = num;
            }
        }
        return true;
    }
}
