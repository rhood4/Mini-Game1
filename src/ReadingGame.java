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
        while(roomRead != null && roomRead.hasNextLine()) {
            //Assigning values to attributes
            int numOfRoom = Integer.parseInt(roomRead.nextLine()); //Room
            // number
            String nameofroom = roomRead.nextLine();//the room name


            String descript = roomRead.nextLine(); //Description of room
            // ---> you will need to retrieve multi-lines of description (Not
            // one single line) you can use the loop.





            boolean visitedRoom = Boolean.parseBoolean(roomRead.nextLine());

            //you will need to detect "----" this is the divider to identify
            // a room and direction/destination and identify another room
            // information.

            //then you will get the information of exit (direction and
            // destination)


            //Visited room
            // String set it to false
            ArrayList<String>directions = new ArrayList<>(); //directions

            String north = roomRead.nextLine();

            directions.add(north);
            String south = roomRead.nextLine();
            directions.add(south);
            String east = roomRead.nextLine();
            directions.add(east);
            String west = roomRead.nextLine();
            directions.add(west);

            //building rooms object
            rooms.add(new Room(numOfRoom, nameofroom, descript, directions,
                    false)); //for every room

        }
        if (rooms.get(0).isVisited()==false) //pulling from the list
            System.out.println("Not Visited");

    }
}

