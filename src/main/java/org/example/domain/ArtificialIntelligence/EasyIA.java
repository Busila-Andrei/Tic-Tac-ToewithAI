package org.example.domain.ArtificialIntelligence;

import org.example.domain.Board;

import java.util.Random;

public class EasyIA implements IA{
    private final Random random = new Random();
    @Override
    public void move(Board board, char character) {
        System.out.println("Making move level \"easy\"");
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
