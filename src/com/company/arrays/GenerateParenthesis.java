package com.company.arrays;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/generate-parentheses/
/*
*Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
Example 1:

Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
Example 2:

Input: n = 1
Output: ["()"]
* */
public class GenerateParenthesis {

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        helper(list, "", 0, 0, n);
        return list;
    }

    private void helper(List<String> l , String s, int open, int close, int max){
        if(s.length()==max*2){
            l.add(s);
            return;
        }
        if(open<max){
            helper(l,s+"(", open+1,close, max);
        }
        if(open>close){
            helper(l,s+")", open,close+1, max);
        }
    }

    public static void main(String[] args) {
        GenerateParenthesis gp = new GenerateParenthesis();
        gp.generateParenthesis(3).forEach(System.out::println);
    }

}
