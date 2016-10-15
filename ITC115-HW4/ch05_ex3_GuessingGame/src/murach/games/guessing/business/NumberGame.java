// This version is by Dwayne Linde. 

package murach.games.guessing.business;

import java.util.Random;

public class NumberGame {
    private int upperLimit;
    private int number;
    private int guessCount;
    
    public NumberGame() {
        this(50);        
    }
    
    public NumberGame(int upperLimit) {
        this.upperLimit = upperLimit;
        Random random = new Random();
        number = random.nextInt(upperLimit - 1) + 1;
        guessCount = 1;
    }

    public int getNumber() {
        return number;
    }

    public int getGuessCount() {
        return guessCount;
    }
    
    public int getUpperLimit() {
        return upperLimit;
    }
    
    public void incrementGuessCount() {
        guessCount = guessCount + 1;
    }
}