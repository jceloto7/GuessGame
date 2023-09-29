package com.jceloto7.guess_game.Util;

public class GameUtil {

    public void game(){
        GetNumberUtil getNumberUtil = new GetNumberUtil();
        int guessNumber;
        guessNumber = getNumberUtil.getNumber();
        boolean loop = true;

        while(loop){
            System.out.println("""
                    The number has been generated.
                    
                                  Try 
                    
                    Please type one integer number from 1 to 100:""");

        }

    }
}
