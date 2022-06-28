package com.bl.tictac;

import java.util.Scanner;

public class TicTacToe {

        Scanner input = new Scanner(System.in);
        char userLetter, computerLetter;
        char[] index = new char[10];

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

        public void selectOption() {
            System.out.println("Select your letter : X?O");
            userLetter = input.next().toUpperCase().charAt(0);
            computerLetter = (userLetter == 'X' ? 'O' : 'X');
            System.out.println("User Letter: " + userLetter + ", " + "Computer Letter: " + computerLetter);
        }
    public void selectLocation() {
        System.out.println("select location from 1-9");
        int userMove = input.nextInt();
        do {
            if(userMove > index.length-1) {
                System.out.println("please select proper location from 1-9");
                userMove = input.nextInt();
            }
        }while(userMove >= index.length);

        for(int i = 0; i < index.length; i++) {
            if(userMove == i && index[i] == ' ') {
                index[i] = userLetter;
                showBoard();
                break;
            }
        }
    }

}



