import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadingGame {
    public static void main(String[] args) {
        List<Room>rooms= new ArrayList<>();
        //new Player Object
        Player player = new Player();
        //opening text file
        //MAking Scanner object
        File roomf = new File("RoomRef.txt");
        Scanner roomRead = null;
        try {
            roomRead = new Scanner(roomf);
        }
        catch(FileNotFoundException e){
            System.out.println("The file: RoomRef.txt is nonexistent");
        }
        //reading one value at a time in the file in a while loop
        while(roomRead != null && roomRead.hasNext()) {
            //Assigning values to attributes
            String numOfRoom = roomRead.nextLine(); //Room number
            String nameofroom = roomRead.nextLine();//the room name
            String descript = roomRead.nextLine(); //Description of room

//            String visitedRoom = roomRead.nextLine(); //Visited room String set it to false
//            boolean visited = Boolean.parseBoolean(visitedRoom); //answering the question have you visited this room
            ArrayList<String>directions = new ArrayList<>(); //directions
            String N = roomRead.nextLine();
            directions.add(N);
            String S = roomRead.nextLine();
            directions.add(S);
            String E = roomRead.nextLine();
            directions.add(E);
            String W = roomRead.nextLine();
            directions.add(W);

            //building rooms object
            rooms.add(new Room(numOfRoom, nameofroom, descript, directions, false)); //for every room


        }
        if (rooms.get(0).isVisited()==false) //pulling from the list
            System.out.println("Not Visited");



    }
}
