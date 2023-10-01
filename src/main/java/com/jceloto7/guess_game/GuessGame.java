package com.jceloto7.guess_game;

import com.jceloto7.guess_game.Util.*;

public class GuessGame {
    public static void main(String[] args) {
        String stringOption;
        InputUtil inputUtil = new InputUtil();
        char charOption;
        ValidationUtil validationUtil = new ValidationUtil(inputUtil);
        ScreenUtil screenUtil = new ScreenUtil();

        System.out.println("""
               Hello! Welcome to the Guess Game.
               Do you want to read the instructions? Please type 1 to 'yes' or 2 to 'no'""");
        stringOption = inputUtil.getInput();
        charOption = validationUtil.validationCharOption(stringOption);
        if(charOption == '1'){
            String showInstructions;
            showInstructions = screenUtil.gameInstructions();
            System.out.println(showInstructions);
        }



    }
}