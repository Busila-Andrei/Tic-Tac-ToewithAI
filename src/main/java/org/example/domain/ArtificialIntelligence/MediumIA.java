package org.example.domain.ArtificialIntelligence;

import org.example.domain.Board;

import java.util.Random;

public class MediumIA implements IA {

    private final Random random = new Random();

    @Override
    public void move(Board board, char character) {
        System.out.println("Making move level \"medium\"");
        char enemy;
        if (character=='X'){
            enemy = 'O';
        }else enemy = 'X';
        if (!logicMove(board,character,enemy)){
            for (;;){
                int i = random.nextInt(3);
                int j = random.nextInt(3);
                if (board.getCharacter(i,j) == ' '){
                    board.setCharacter(i,j,character);
                    break;
                }
            }
        }

    }

    public boolean logicMove(Board board, char character, char enemyChar) {
        int j;
        int i;
        j = 1;
        for (i = 0; i < 3; i++) {
            if (board.getCharacter(i, 0) == character & board.getCharacter(i, j) == character & board.getCharacter(i, j + 1) == ' ') {
                board.setCharacter(i, j + 1, character);
                return true;
            }
            if (board.getCharacter(i, 0) == character & board.getCharacter(i, j) == ' ' & board.getCharacter(i, j + 1) == character) {
                board.setCharacter(i, j, character);
                return true;
            }
            if (board.getCharacter(i, 0) == ' ' & board.getCharacter(i, j) == character & board.getCharacter(i, j + 1) == character) {
                board.setCharacter(i, 0, character);
                return true;
            }

            // vs enemy
            if (board.getCharacter(i, 0) == enemyChar & board.getCharacter(i, j) == enemyChar & board.getCharacter(i, j + 1) == ' ') {
                board.setCharacter(i, j + 1, character);
                return true;
            }
            if (board.getCharacter(i, 0) == enemyChar & board.getCharacter(i, j) == ' ' & board.getCharacter(i, j + 1) == enemyChar) {
                board.setCharacter(i, j, character);
                return true;
            }
            if (board.getCharacter(i, 0) == ' ' & board.getCharacter(i, j) == enemyChar & board.getCharacter(i, j + 1) == enemyChar) {
                board.setCharacter(i, 0, character);
                return true;
            }
        }

        i = 1;
        for (j = 0; j < 3; j++) {
            if (board.getCharacter(0, j) == character & board.getCharacter(i, j) == character & board.getCharacter(i + 1, j) == ' ') {
                board.setCharacter(i + 1, j, character);
                return true;
            }
            if (board.getCharacter(0, j) == character & board.getCharacter(i, j) == ' ' & board.getCharacter(i + 1, j) == character) {
                board.setCharacter(i, j, character);
                return true;
            }
            if (board.getCharacter(0, j) == ' ' & board.getCharacter(i, j) == character & board.getCharacter(i + 1, j) == character) {
                board.setCharacter(0, j, character);
                return true;
            }
            if (board.getCharacter(0, j) == enemyChar & board.getCharacter(i, j) == enemyChar & board.getCharacter(i + 1, j) == ' ') {
                board.setCharacter(i + 1, j, character);
                return true;
            }
            if (board.getCharacter(0, j) == enemyChar & board.getCharacter(i, j) == ' ' & board.getCharacter(i + 1, j) == enemyChar) {
                board.setCharacter(i, j, character);
                return true;
            }
            if (board.getCharacter(0, j) == ' ' & board.getCharacter(i, j) == enemyChar & board.getCharacter(i + 1, j) == enemyChar) {
                board.setCharacter(0, j, character);
                return true;
            }
        }


        i = 1;
        j = 1;
        if (board.getCharacter(0, 0) == character & board.getCharacter(i, j) == character & board.getCharacter(i+j, i+j) == ' ') {
            board.setCharacter(i+j, i+j, character);
            return true;
        }
        if (board.getCharacter(0, 0) == character & board.getCharacter(i, j) == ' ' & board.getCharacter(i+j, i+j) == character) {
            board.setCharacter(i, i, character);
            return true;
        }
        if (board.getCharacter(0, 0) == ' ' & board.getCharacter(i, j) == character & board.getCharacter(i+j, i+j) == character) {
            board.setCharacter(0, 0, character);
            return true;
        }
        if (board.getCharacter(0, 0) == enemyChar & board.getCharacter(i, j) == enemyChar & board.getCharacter(i+j, i+j) == ' ') {
            board.setCharacter(i+j, i+j, character);
            return true;
        }
        if (board.getCharacter(0, 0) == enemyChar & board.getCharacter(i, j) == ' ' & board.getCharacter(i+j, i+j) == enemyChar) {
            board.setCharacter(i, i, character);
            return true;
        }
        if (board.getCharacter(0, 0) == ' ' & board.getCharacter(i, j) == enemyChar & board.getCharacter(i+j, i+j) == enemyChar) {
            board.setCharacter(0, 0, character);
            return true;
        }


        if (board.getCharacter(2, 0) == character & board.getCharacter(i, j) == character & board.getCharacter(0, 2) == ' ') {
            board.setCharacter(0, 2, character);
            return true;
        }
        if (board.getCharacter(2, 0) == character & board.getCharacter(i, j) == ' ' & board.getCharacter(0, 2) == character) {
            board.setCharacter(i, i, character);
            return true;
        }
        if (board.getCharacter(2, 0) == ' ' & board.getCharacter(i, j) == character & board.getCharacter(0, 2) == character) {
            board.setCharacter(2, 0, character);
            return true;
        }
        if (board.getCharacter(2, 0) == enemyChar & board.getCharacter(i, j) == enemyChar & board.getCharacter(0, 2) == ' ') {
            board.setCharacter(0, 2, character);
            return true;
        }
        if (board.getCharacter(2, 0) == enemyChar & board.getCharacter(i, j) == ' ' & board.getCharacter(0, 2) == enemyChar) {
            board.setCharacter(i, i, character);
            return true;
        }
        if (board.getCharacter(2, 0) == ' ' & board.getCharacter(i, j) == enemyChar & board.getCharacter(0, 2) == enemyChar) {
            board.setCharacter(2, 0, character);
            return true;
        }

        return false;

    }
}
