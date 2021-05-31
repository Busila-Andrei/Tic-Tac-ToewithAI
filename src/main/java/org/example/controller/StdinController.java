package org.example.controller;

import org.example.controller.utils.ScannerUtils;

public class StdinController implements UserInputController{
    @Override
    public String inputCoordinates() {
        System.out.print("Enter the coordinates: ");
        return ScannerUtils.nextLine();
    }

    @Override
    public String inputCommand() {
        System.out.print("Input command: ");
        return ScannerUtils.nextLine();
    }
}
