package org.example.domain;

import org.example.controller.StdinController;
import org.example.controller.UserInputController;

public class Player {

    public void move(Board board, char character) {
        UserInputController inputController = new StdinController();
        int i = 0, j = 0;
        for (;;) {
            try {
                String[] text = inputController.inputCoordinates().split(" ");
                i = Integer.parseInt(text[0]);
                j = Integer.parseInt(text[1]);
            } catch (NumberFormatException e) {
                System.out.println("You should enter numbers!");
            }
            if (i > 3 || i < 1 || j > 3 || j < 1) {
                System.out.println("Coordinates should be from 1 to 3!");
            } else if (board.getCharacter(i-1, j-1) == ' ') {
                board.setCharacter(i-1, j-1, character);
                break;
            } else System.out.println("This cell is occupied! Choose another one!");
        }
    }
}
