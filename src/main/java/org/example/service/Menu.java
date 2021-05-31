package org.example.service;

import org.example.controller.StdinController;
import org.example.controller.UserInputController;
import org.example.domain.ArtificialIntelligence.EasyIA;
import org.example.domain.ArtificialIntelligence.HardIA;
import org.example.domain.ArtificialIntelligence.IA;
import org.example.domain.ArtificialIntelligence.MediumIA;
import org.example.domain.Player;

public class Menu {

    private final UserInputController inputController = new StdinController();
    private final Game game = new Game();

    public void start() {
        String input;
        for (; ; ) {
            input = inputController.inputCommand();
            if (input.equals("exit")) {
                break;
            } else {
                if (input.equals("start user user") ||
                        input.equals("start user easy") ||
                        input.equals("start user medium") ||
                        input.equals("start user hard") ||
                        input.equals("start easy easy") ||
                        input.equals("start easy user") ||
                        input.equals("start easy medium") ||
                        input.equals("start easy hard") ||
                        input.equals("start medium medium") ||
                        input.equals("start medium user") ||
                        input.equals("start medium easy") ||
                        input.equals("start medium hard") ||
                        input.equals("start hard hard") ||
                        input.equals("start hard user") ||
                        input.equals("start hard easy") ||
                        input.equals("start hard medium")) {
                    String[] text = input.split(" ");
                    typeGame(text[1], text[2]);
                } else System.out.println("Bad parameters!");
            }
        }
    }

    public void typeGame(String mode1, String mode2) {
        Player player1;
        Player player2;
        IA ia1;
        IA ia2;
        switch (mode1) {
            case "user":
                player1 = new Player();
                switch (mode2) {
                    case "user":
                        player2 = new Player();
                        game.newGame(player1, player2);
                        break;
                    case "easy":
                        ia2 = new EasyIA();
                        game.newGame(player1, ia2);
                        break;
                    case "medium":
                        ia2 = new MediumIA();
                        game.newGame(player1, ia2);
                        break;
                    case "hard":
                        ia2 = new HardIA();
                        game.newGame(player1, ia2);
                        break;
                }
                break;
            case "easy":
                ia1 = new EasyIA();
                switch (mode2) {
                    case "user":
                        player2 = new Player();
                        game.newGame(ia1, player2);
                        break;
                    case "easy":
                        ia2 = new EasyIA();
                        game.newGame(ia1, ia2);
                        break;
                    case "medium":
                        ia2 = new MediumIA();
                        game.newGame(ia1, ia2);
                        break;
                    case "hard":
                        ia2 = new HardIA();
                        game.newGame(ia1, ia2);
                        break;
                }
                break;
            case "medium":
                ia1 = new MediumIA();
                switch (mode2) {
                    case "user":
                        player2 = new Player();
                        game.newGame(ia1, player2);
                        break;
                    case "easy":
                        ia2 = new EasyIA();
                        game.newGame(ia1, ia2);
                        break;
                    case "medium":
                        ia2 = new MediumIA();
                        game.newGame(ia1, ia2);
                        break;
                    case "hard":
                        ia2 = new HardIA();
                        game.newGame(ia1, ia2);
                        break;
                }
                break;
            case "hard":
                ia1 = new HardIA();
                switch (mode2) {
                    case "user":
                        player2 = new Player();
                        game.newGame(ia1, player2);
                        break;
                    case "easy":
                        ia2 = new EasyIA();
                        game.newGame(ia1, ia2);
                        break;
                    case "medium":
                        ia2 = new MediumIA();
                        game.newGame(ia1, ia2);
                        break;
                    case "hard":
                        ia2 = new HardIA();
                        game.newGame(ia1, ia2);
                        break;
                }
                break;
        }
    }
}
