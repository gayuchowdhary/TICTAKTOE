package com.bl.tictac;

public class TicTacToe {
    char[] index =  new char[10];
    public void Board() {
        for (int i = 1; i < index.length; i++) {
            index[i] = ' ';
        }
    }
    public void showBoard() {
        System.out.println(index[1] + "   " + " | " + index[2] + "  " + " | " + index[3] + " " + "\n" +
                index[4] + "   " + " | " + index[5] + "  " + " | " + index[6] + " " + " " + "\n" +
                index[7] + "   " + " | " + index[8] + "  " + " | " + index[9] + " ");
    }

}


