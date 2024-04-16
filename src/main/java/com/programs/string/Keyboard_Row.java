package org.example.leetcode.string;

import java.util.ArrayList;
import java.util.Arrays;

public class Keyboard_Row {
    public static String[] findWords(String[] words) {

        String [] inp = new String[]{"qwertyuiop","asdfghjkl","zxcvbnm"};
        int ind = 0;
        ArrayList<String> res =  new ArrayList<>();
        for(int i=0; i<words.length;i++){
            String selectedRow = "";
            int count = 0;
            if(inp[0].indexOf(words[i].toLowerCase().charAt(0))>=0){
                selectedRow = inp[0];
            } else if (inp[1].indexOf(words[i].toLowerCase().charAt(0))>=0) {
                selectedRow = inp[1];
            }else {
                selectedRow = inp[2];
            }
            for(int j=0;j<words[i].length();j++){
                if(selectedRow.indexOf(words[i].toLowerCase().charAt(j))>=0){
                    count++;
                }
            }
            if(count == words[i].length()){
                res.add(words[i]);
            }
        }
        String[] word = new String[res.size()];
        word = res.toArray(word);
        return word;
    }
}
