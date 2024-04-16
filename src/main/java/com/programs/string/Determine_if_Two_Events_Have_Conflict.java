package org.example.leetcode.string;

public class Determine_if_Two_Events_Have_Conflict {
    public static boolean haveConflict(String[] event1, String[] event2) {

        return event1[1].compareTo(event2[0]) >= 0?true:false;
    }
}
