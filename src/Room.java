import java.util.ArrayList;

public class Room {
    //creating Room objects by creating ID's, Room name, Description
    //and direction
    private int id;
    private String roomname;
    String descript;
    ArrayList<String> exit;
    boolean isVisited;

    public Room(int id, String roomname, String descript,
                ArrayList<String> exit, boolean isVisited) {
        this.id = id;
        this.roomname = roomname;
        this.descript = descript;
        this.exit = exit;
        this.isVisited = isVisited;
    }

    public int getId() {
        return id;
    }

    public String getRoomname() {
        return roomname;
    }

    public String getDescript() {
        return descript;
    }

    public ArrayList<String> getExit() {
        return exit;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public void setExit(ArrayList<String> exit) {
        this.exit = exit;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    //Create rooms with this info
    //Create a room object with id = 2

}
