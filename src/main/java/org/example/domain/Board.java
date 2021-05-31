package org.example.domain;

public class Board {

    private final char[][] board = new char[3][3];

    public void createBoard(){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                board[i][j] = ' ';
            }
        }
    }

    public void printBoard(){
        System.out.println("---------");
        for (int i = 0; i < 3; i++){
            System.out.print("| ");
            for (int j = 0; j < 3; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.print("|\n");
        }
        System.out.println("---------");
    }

    public char getCharacter(int i, int j) {
        return board[i][j];
    }

    public void setCharacter(int i, int j, char character) {
        this.board[i][j] = character;
    }


}
