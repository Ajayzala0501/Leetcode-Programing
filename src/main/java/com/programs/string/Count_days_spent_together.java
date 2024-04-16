package org.example.leetcode.string;

public class Count_days_spent_together {
    public static int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {

        String s1 =leaveAlice.substring(0,2);
                String s2 = arriveBob.substring(0,2);
                Integer i1 =Integer.parseInt(leaveAlice.substring(3,5));
                Integer i2 =Integer.parseInt(arriveBob.substring(3,5));
        if(leaveAlice.equals(arriveBob))
            return 1;
        if(leaveAlice.substring(0,2).equals(arriveBob.substring(0,2)) && Integer.parseInt(leaveAlice.substring(3,5)) > Integer.parseInt(arriveBob.substring(3,5)) ){
                return (Integer.parseInt(leaveAlice.substring(3,5)) - Integer.parseInt(arriveBob.substring(3,5)))+1;
        }
        return 0;
    }
}
