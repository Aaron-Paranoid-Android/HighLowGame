public class Player {
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

}

public Player(String name) {
this();
this.name = name;



}
    public String getName(){
        return this.name;
    }


    public void setName(String name){
    if(name== "") {
        throw  java.lang.exception;
        System.out.Println("Invalid name! Name cannot be blank");
    }
    else {
        this.name = name;
    }


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



public int getWins(){
    return wins;
}

public void setAttempts(int attempts){

}

}


