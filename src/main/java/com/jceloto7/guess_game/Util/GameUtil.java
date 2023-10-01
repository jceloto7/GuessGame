package com.jceloto7.guess_game.Util;

public class GameUtil {

    public void game(){
        boolean loop = true;

        while(loop){
            GetNumberUtil getNumberUtil = new GetNumberUtil();
            int guessNumber;
            guessNumber = getNumberUtil.getNumber();
            ScreenUtil screenUtil = new ScreenUtil();
            String guessTry;
            InputUtil inputUtil = new InputUtil();

            for(int tries =1; tries <=5; tries++){
                screenUtil.gameTries(tries);
                guessTry = inputUtil.getInput();



            }

        }

    }
}
