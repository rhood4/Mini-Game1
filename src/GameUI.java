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

                //use loop to join the string.
                //either you join each information as a long string as long
                // as the line is not equals to "----"



                //then, you will need to create elements of the exits.
                //use a loop to add exit information.
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
