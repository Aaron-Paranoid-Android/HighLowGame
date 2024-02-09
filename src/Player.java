public class Player {
    private int highestAttempts;
    private int id;
    private static int lastNumber;
    private int lowestAttempts;
    private java.lang.String name;
    private int wins;
public Player(){
    System.out.println("Default constructor");
    this.id = ++lastNumber.id;
    this.HighestAttempts = 0;
    this.name = "Unknown";
}

public Player(java.lang.String name){

}

public void addWin(){
    wins += 1;
}

public int getHighestAttempts(){
    return highestAttempts;
}

public int getID(){
    return id;
}

public int getLowestAttempts(){
    return lowestAttempts;
}

public String getName(){
    return name;
}

public int getWins(){
    return wins;
}

public void setAttempts(int attempts){

}

public void setName(String name){

    if(name != null){

    }
    else{
        throw java.lang.exception ("name cannot be empty");
    }
}

}
