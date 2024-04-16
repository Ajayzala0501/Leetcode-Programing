package org.example.leetcode.string;

public class Circular_Sentence {

    public static boolean isCircularSentence(String sentence) {
        String words[] = sentence.split(" ");
        if(words.length > 1){
            for (int i=0;i<words.length-1;i++){
                if(words[0].charAt(0) != words[words.length-1].charAt(words[words.length-1].length()-1))
                    return  false;
                if(words[i].charAt(words[i].length()-1)!=words[i+1].charAt(0))
                    return false;
            }
        } else {
            if (words[0].charAt(0) != words[0].charAt(words[0].length() - 1)) {
                return false;
            }
        }
        return true;
    }
}
