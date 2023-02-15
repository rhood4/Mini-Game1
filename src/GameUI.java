import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GameUI {


    static boolean isValidMove(String userInput, Player plr,
                               ArrayList<Room> rooms){ //Has the player made a move
        //Check if move is valid or not

        //all of these are parameters of isValidMove() method.
//        String userInput;
//        Player plr;
//        ArrayList<Room> rooms;
        return false;
    }
    public static void main(String[] args) {

        ArrayList<Room> rooms = new ArrayList<Room>();
        try{
            File file = new File("RoomsRef.txt");
            Scanner sc = new Scanner(file);

            while(sc.hasNextLine()){
                Room room = new Room();
                int roomID = Integer.parseInt(sc.nextLine());
                String roomName = sc.nextLine();
                String roomDescription = sc.nextLine();




//                Robert,
//                The code block creates a room object if there is next line
//                to process in RoomsRef.txt file. Then, it proceeds to read
//                the room id and store it in the variable roomID.
//                Next it moves on to the next line and save the data in that
//                line as the room name in the variable roomName.Then, it goes
//                to the next line and retrieves the description. It is stored
//                in the variable roomDescription. The program stores this information,
//                which is why you see output without any text being printed.
//
//                This while loop runs as long as the file has more lines to read, inside the loop.
//
//                Next thing to do:  You need to create another loop which will
//                read in lines of Exits as connection between rooms. Each exit
//                object includes a direction and a room Id as destination.
//                you will need to add those two separate information to
//                Room object by creating method such as addExits as a parameter
//                in the Room object.
//
//
//                        That’s the next task.




            }

        }catch(FileNotFoundException e){

        }

    }



    static void movePlayer(String userInput, Player plr, ArrayList<Room> room){
//        String UserInput;
//        Player plr;
//        ArrayList rooms;

    }
    static void printCurrentRoom(Player plr, ArrayList<Room> room){
//        Player plr;
//        ArrayList<Room> room;

    }
    static void printEnd(int loc, ArrayList<Room> rooms){
//        int loc;
//        ArrayList<Room> rooms;
    }
}
