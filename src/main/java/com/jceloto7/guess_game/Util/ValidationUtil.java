package com.jceloto7.guess_game.Util;

public class ValidationUtil {
    private final InputUtil inputUtil;

    public ValidationUtil(InputUtil inputUtil){
        this.inputUtil = inputUtil;
    }
    public char validationChar(String stringOption){
        char[] charOption = stringOption.toCharArray();

        while (charOption.length > 1 || charOption[0] != '1' && charOption[0] != '2') {
            System.out.println("Invalid option.Please just type 1 or 2:");
            stringOption = inputUtil.getInput();
            charOption = stringOption.toCharArray();
        }
        return charOption[0];

    }
}


