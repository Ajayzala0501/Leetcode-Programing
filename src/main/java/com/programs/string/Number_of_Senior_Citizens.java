package org.example.leetcode.string;

public class Number_of_Senior_Citizens {
    public static int countSeniors(String[] details) {
        int totalNumberOfSeniorCitizens =0;
        for(String input:details){
            if(Integer.parseInt(input.substring(11,13))>60){
                totalNumberOfSeniorCitizens++;
            }
        }
        return totalNumberOfSeniorCitizens;
    }
}
