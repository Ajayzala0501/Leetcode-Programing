package org.example.leetcode.string;

import java.util.ArrayList;
import java.util.List;

public class Fizz_Buzz {

    public static List<String> fizzBuzz(int n) {

        ArrayList<String> list =  new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0&&i%5!=0){
                list.add("Fizz");
            } else if (i%5==0&&i%3!=0) {
                list.add("Buzz");
            } else if (i%3==0&&i%5==0) {
                list.add("FizzBuzz");
            }else {
             list.add(String.valueOf(i));
            }
        }
       return list;
    }
}
