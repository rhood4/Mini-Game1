import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingGame {
    public static void main(String[] args) {
        //MAking Scanner object
        File roomf = new File("RoomRef.txt");
//        try {
//            Scanner readFile = new Scanner(roomf);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
        Scanner input = null; //"Redeclaring" the scanner
        try {
            input = new Scanner(roomf);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        while(input.hasNextLine()){//Going onto the next line in the text file
            //So it won't keep on repeating 1
            String id=input.nextLine();
            System.out.println(id);
        }


    }
}
