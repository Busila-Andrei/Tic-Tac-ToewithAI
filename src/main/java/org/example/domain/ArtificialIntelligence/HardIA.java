package org.example.domain.ArtificialIntelligence;

import org.example.domain.Board;

public class HardIA implements IA{
    @Override
    public void move(Board board, char player) {
        System.out.println("Making move level \"hard\"");
        char opponent;

        int bestVal = -1000;
        int row = -1;
        int col = -1;
        if (player == 'X')
            opponent = 'O';
        else opponent = 'X';

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (board.getCharacter(i,j) == ' '){
                    board.setCharacter(i,j ,player);
                    int moveVal = minimax(board,0,false,player,opponent);
                    board.setCharacter(i,j ,' ');
                    if (moveVal > bestVal){
                        row = i;
                        col = j;
                        bestVal = moveVal;
                    }
                }
            }
        }
        board.setCharacter(row,col,player);
    }

    public int minimax(Board board, int depth, Boolean isMax,char player,char opponent){
        int score = evaluate(board,player,opponent);

        if (score == 10)
            return score;

        if (score == -10)
            return score;

        if (!isMovesLeft(board))
            return 0;

        int best;
        if (isMax){
            best = -1000;
            for (int i = 0; i < 3 ; i++){
                for (int j = 0; j < 3; j++){
                    if (board.getCharacter(i,j) == ' '){
                        board.setCharacter(i,j,player);
                        best = Math.max(best,minimax(board,depth+1, false,player,opponent));
                        board.setCharacter(i,j,' ');
                    }
                }
            }
        }
        else {
            best = 1000;
            for (int i = 0; i < 3 ; i++){
                for (int j = 0; j < 3; j++){
                    if (board.getCharacter(i,j) == ' '){
                        board.setCharacter(i,j,opponent);
                        best = Math.min(best,minimax(board,depth+1, true,player,opponent));
                        board.setCharacter(i,j,' ');
                    }
                }
            }
        }
        return best;
    }

    public Boolean isMovesLeft(Board board){
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board.getCharacter(i,j) == ' ')
                    return true;
                return false;
    }

    public int evaluate(Board board, char player, char opponent){
        for (int row= 0; row < 3; row++){
            if (board.getCharacter(row,0) == board.getCharacter(row,1) &&
            board.getCharacter(row,1) == board.getCharacter(row,2)){
                if (board.getCharacter(row,0) == player)
                    return +10;
                else if (board.getCharacter(row,0) == opponent)
                    return -10;
            }
        }

        for (int col = 0; col < 3; col++){
            if (board.getCharacter(0,col) == board.getCharacter(1,col) &&
                    board.getCharacter(1,col) == board.getCharacter(2,col)){
                if (board.getCharacter(0,col) == player)
                    return +10;
                else if (board.getCharacter(0,col) == opponent)
                    return -10;
            }
        }

        if (board.getCharacter(0,0) == board.getCharacter(1,1) &&
                board.getCharacter(1,1) == board.getCharacter(2,2)){
            if (board.getCharacter(0,0) == player)
                return +10;
            else if (board.getCharacter(0,0) == opponent)
                return -10;
        }

        if (board.getCharacter(0,2) == board.getCharacter(1,1) &&
                board.getCharacter(1,1) == board.getCharacter(2,0)){
            if (board.getCharacter(0,2) == player)
                return +10;
            else if (board.getCharacter(0,2) == opponent)
                return -10;
        }
        return 0;
    }

}
