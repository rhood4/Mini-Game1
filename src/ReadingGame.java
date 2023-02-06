import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadingGame {
    public static void main(String[] args) throws FileNotFoundException {
        List<Room> rooms = new ArrayList<>();
        //new Player Object
        Player player = new Player();
        //opening text file
        //MAking Scanner object
        File roomf = new File("RoomRef.txt");
        Scanner roomRead = null;
        try {
            roomRead = new Scanner(roomf);
        } catch (FileNotFoundException e) {
            System.out.println("The file: RoomRef.txt is nonexistent");
        }
        //reading one value at a time in the file in a while loop
        while (roomRead != null && roomRead.hasNextLine()) {
            //Assigning values to attributes
            int numOfRoom = Integer.parseInt(roomRead.nextLine()); //Room
            // number
            String nameofroom = roomRead.nextLine();//the room name
//          ---> you will need to retrieve multi-lines of description (Not
            // one single line) you can use the loop.

            ArrayList<String> descript = new ArrayList<String>(); //Description of room
            String lineofdescription = roomRead.nextLine();
            descript.add(lineofdescription);


//            try {
//                FileReader fr = new FileReader(roomf);
//                BufferedReader inFile = new BufferedReader(fr);
//                while(descript!=null){
//                    System.out.println(descript);
//                    descript= inFile.readLine();
//                    System.out.println()
//
//                }
//
//
//          } catch (FileNotFoundException e) {
//                throw new RuntimeException(e);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }


            boolean visitedRoom = Boolean.parseBoolean(roomRead.nextLine());

            //you will need to detect "----" this is the divider to identify
            // a room and direction/destination and identify another room
            // information.

            //then you will get the information of exit (direction and
            // destination)
            while (!lineofdescription.equalsIgnoreCase("----")) {
                lineofdescription = roomRead.nextLine();
                descript.add(lineofdescription);
            }


            //Visited room
            // String set it to false
            ArrayList<String> directions = new ArrayList<>(); //directions

            String north = roomRead.nextLine();

            directions.add(north);
            String south = roomRead.nextLine();
            directions.add(south);
            String east = roomRead.nextLine();
            directions.add(east);
            String west = roomRead.nextLine();
            directions.add(west);
            //create an ArrayLidy of Exit type
            ArrayList<Exit> exits = new ArrayList<Exit>();
            String exit = "";
            String[] z = new String[2];
            ArrayList<String> z2 = new ArrayList<String>();
            Exit exits1 = new Exit();
            while(!exit.equalsIgnoreCase("----")){
                exit = roomRead.nextLine();
                z = exit.split(" ");

            }


            //building rooms object
            rooms.add(new Room(numOfRoom, nameofroom, descript, directions,
                    false)); //for every room


            if (rooms.get(0).isVisited() == false) //pulling from the list
                System.out.println("Not Visited");

        }
    }
}

