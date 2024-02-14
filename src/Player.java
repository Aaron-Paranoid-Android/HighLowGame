/**
 * Player class that manages the players in the high-low game.
 *
 * @author Aaron Ford and Abel Thomas
 * @version 2.0
 * @link <<a href="https://github.com/Aaron-Paranoid-Android/HighLowGame">Github repository</a>>
 */

import java.util.Random;
public class Player {
    private int highestAttempts; //variable holding the highest number of attempts
    private int id; //randomly generated id for each player
    private static int lastNumber; //holds the last number
    private int lowestAttempts; //variable holding the lowest number of attempts
    private String name; //names for each player, can be default or user input
    private int wins; //increments the amount of wins
public Player(){
    this.id = ++Player.lastNumber;
    this.name = "Unknown";
    this.lowestAttempts = 0;
    this.wins = 0;
    this.id= 0;
this.highestAttempts = 0;

}//creates a player with default name 'Unknown'

public Player(String name) {
this();
this.name = name;



}//creates a player with input name
    public String getName(){
        return this.name;
    }// returns player name


public void setName(String name) throws Exception {
    name = name.trim();
    if(name == "") {
        throw new Exception("Invalid name! Name cannot be null.");
    }
    else {
        this.name = name;
}//sets name to user input, throws exception if name is blank


}// sets player name to user input, throws exception if the name is blank

public void addWin(){
    wins ++;
}// adds 1 for every win

public int getHighestAttempts(){
    return highestAttempts;
}// returns the highest attempts int

public int getID(){
    return id;
}// returns the player id

public int getLowestAttempts(){
    return lowestAttempts;
}//returns the lowest attempts int



public int getWins(){
    return wins;
}//returns number of wins

public void setAttempts(int attempts){
    if(attempts > highestAttempts){
        highestAttempts = attempts;
    }
else if (attempts < lowestAttempts || attempts== 0 ) {
    attempts = lowestAttempts;

    }
}//sets the number of attempts/guesses
    public int getId (){
    Random rand = new Random();
    int id = rand.nextInt(1000);
    return id;
    }

}//end Player class


