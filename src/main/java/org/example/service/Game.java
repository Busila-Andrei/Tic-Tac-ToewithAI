package org.example.service;

import org.example.domain.ArtificialIntelligence.IA;
import org.example.domain.Board;
import org.example.domain.Player;
import org.example.domain.ResultGame;

public class Game {
    private final Board board = new Board();

    public void newGame(Player player1, Player player2){
        board.createBoard();
        board.printBoard();
        for (;;) {
            player1.move(board,'X');
            board.printBoard();
            if (ResultGame.printResult(board)){
                break;
            }
            player2.move(board,'O');
            board.printBoard();
            if (ResultGame.printResult(board)){
                break;
            }
        }
        System.out.println();
    }
    public void newGame(Player player1, IA ia2){
        board.createBoard();
        board.printBoard();
        for (;;) {
            player1.move(board,'X');
            board.printBoard();
            if (ResultGame.printResult(board)){
                break;
            }
            ia2.move(board,'O');
            board.printBoard();
            if (ResultGame.printResult(board)){
                break;
            }
        }
        System.out.println();
    }
    public void newGame(IA ia1, Player player2){
        board.createBoard();
        board.printBoard();
        for (;;) {
            ia1.move(board,'X');
            board.printBoard();
            if (ResultGame.printResult(board)){
                break;
            }
            player2.move(board,'O');
            board.printBoard();
            if (ResultGame.printResult(board)){
                break;
            }
        }
        System.out.println();
    }
    public void newGame(IA ia1, IA ia2){
        board.createBoard();
        board.printBoard();
        for (;;) {
            ia1.move(board,'X');
            board.printBoard();
            if (ResultGame.printResult(board)){
                break;
            }
            ia2.move(board,'O');
            board.printBoard();
            if (ResultGame.printResult(board)){
                break;
            }
        }
        System.out.println();
    }

}
