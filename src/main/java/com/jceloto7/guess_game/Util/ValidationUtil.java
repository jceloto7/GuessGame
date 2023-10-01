package com.jceloto7.guess_game.Util;

import org.apache.commons.lang3.math.NumberUtils;

public class ValidationUtil {
    private final InputUtil inputUtil;

    public ValidationUtil(InputUtil inputUtil){
        this.inputUtil = inputUtil;
    }
    public char validationCharOption(String stringOption){
        char[] charOption = stringOption.toCharArray();

        while (charOption.length > 1 || charOption[0] != '1' && charOption[0] != '2') {
            System.out.println("Invalid option.Please just type 1 or 2:");
            stringOption = inputUtil.getInput();
            charOption = stringOption.toCharArray();
        }
        return charOption[0];

    }

    public int validationInt(String stringNumberGuess){
        boolean validation;
        int intNumber = 0;
        double doubleNumber =0;
        InputUtil inputUtil = new InputUtil();

        validation = NumberUtils.isParsable(stringNumberGuess);
        while (!validation) {
            System.out.println("Invalid input.Please just type one number from 0 to 100.");
            stringNumberGuess = inputUtil.getInput();
            validation = NumberUtils.isParsable(stringNumberGuess);
        }
        doubleNumber = Double.parseDouble(stringNumberGuess);

        while (doubleNumber <0 && doubleNumber >100 && doubleNumber%1 ==0)
        intNumber = Integer.parseInt(stringNumberGuess);

        double a = doubleNumber;
        int b = (int) doubleNumber;
        double c = a - b;

        return intNumber;

    }




    }




