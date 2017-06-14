package com.Test;

/**
 * Created by aojha on 6/10/17.
 */


public class Braket{
    char[] str ;

    public void printParenthisis(int n) {
        str = new char[2*n];
        if(n > 0)
            _printParenthisis(0, n, 0, 0);
        return;

    }

    private void _printParenthisis(int pos, int n, int open, int close) {
        if(close == n){
            System.out.println(str);
        }
        else{
            if(open < n ){
                str[pos] = '(';
                _printParenthisis(pos+1, n, open+1, close);

            }
            if(open > close){
                str[pos] = ')';
                _printParenthisis(pos+1, n, open, close+1);
            }
        }
    }
}

class Main{
    public static void main(String[] args) {
        Braket braket = new Braket();
        braket.printParenthisis(2);
    }
}

