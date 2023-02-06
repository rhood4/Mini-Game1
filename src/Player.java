import java.util.*;
import java.io.*;
public class Player {
    boolean isAlive;
    int location;

    //create a default constructor
    public Player(){

    }

    //create another constructor by taking isAlive and location.
    public Player(boolean isAlive, int location) {
        this.isAlive = isAlive;
        this.location = location;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }
}

