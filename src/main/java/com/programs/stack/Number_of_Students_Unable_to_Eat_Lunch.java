package org.example.leetcode.stack;

import java.util.*;

public class Number_of_Students_Unable_to_Eat_Lunch {
    public static int countStudents(int[] students, int[] sandwiches) {


        Queue<Integer> studentQ = new ArrayDeque<>();
        Stack<Integer> stackData = new Stack<>();
        for (int num:students){
            studentQ.add(num);
        }
        for (int num:sandwiches){
            stackData.push(num);
        }
        System.out.println("Queue"+studentQ.peek());
        System.out.println("Stack"+stackData.peek());

        return 0;
    }
}
