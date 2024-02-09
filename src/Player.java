/**
 * Represents an Invoice Calculator.
 *
 * @author Aaron Ford and Abel Thomas
 * @version 2.0
 * @link https://github.com/Aaron-Paranoid-Android/HighLowGame
 */public class Player {
    private int highestAttempts;
    private int id;
    private static int lastNumber;
    private int lowestAttempts;
    private java.lang.String name;
    private int wins;
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


    public void setName(String name){
    if(name== "") {
        throw  java.lang.exception;
        System.out.Println("Invalid name! Name cannot be blank");
    }
    else {
        this.name = name;
    }


}// sets player name to user input, throws exception if the name is blank

public void addWin(){
    wins += 1;
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

}//sets the number of attempts/guesses

}//end Player class


