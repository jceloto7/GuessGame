package com.jceloto7.guess_game.Util;

public class ScreenUtil {

    public String gameInstructions(){
        String instructions;

        instructions = """
                                       GUESS NUMBER GAME RULES
                                       
                Please, read with attention.
                
                In this game the computer will generate a random integer number from 0 to 100
                and you will have five tries to guess this number. In each wrong try, the computer
                will tell you if the number you chose is bigger or smaller than the generated number.
                
                Easy, don't you think?
                
                Good Luck! ^^""";

        return instructions;
    }

    public String gameTries(int tries){
        String stringTries;

        stringTries = """
                    The number has been generated.
                    
                                  Try""" + tries + """
                    
                    Please type one integer number from 1 to 100:""";
        return stringTries;
    }

    public String lastTry() {
        String stringLastTry;

        stringLastTry = """
                               Try 5
                    WARNING: This is your last shot to guess the number.
                    Please type one integer number from 1 to 100:""";

        return stringLastTry;
    }


}
