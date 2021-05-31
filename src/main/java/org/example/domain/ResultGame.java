package org.example.domain;

public class ResultGame {

    public static boolean printResult(Board board){
        if (win(board,'X')){
            System.out.println("X wins");
            return true;
        } else if (win(board,'O')){
            System.out.println("O wins");
            return true;
        } if (draw(board)){
            System.out.println("Draw");
            return true;
        }
        return false;
    }

    private static boolean win(Board board, char character){
        return board.getCharacter(0, 0) == character && board.getCharacter(0, 1) == character && board.getCharacter(0, 2) == character ||
                board.getCharacter(1, 0) == character && board.getCharacter(1, 1) == character && board.getCharacter(1, 2) == character ||
                board.getCharacter(2, 0) == character && board.getCharacter(2, 1) == character && board.getCharacter(2, 2) == character ||
                board.getCharacter(0, 0) == character && board.getCharacter(1, 0) == character && board.getCharacter(2, 0) == character ||
                board.getCharacter(0, 1) == character && board.getCharacter(1, 1) == character && board.getCharacter(2, 1) == character ||
                board.getCharacter(0, 2) == character && board.getCharacter(1, 2) == character && board.getCharacter(2, 2) == character ||
                board.getCharacter(0, 0) == character && board.getCharacter(1, 1) == character && board.getCharacter(2, 2) == character ||
                board.getCharacter(2, 0) == character && board.getCharacter(1, 1) == character && board.getCharacter(0, 2) == character;
    }

    private static boolean draw(Board board){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (board.getCharacter(i,j) == ' ')
                    return false;
            }
        }
        return true;
    }
}
