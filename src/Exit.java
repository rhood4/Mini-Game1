public class Exit {
    private int destination;
    private String direction;

    //add no-arg constructor - default constructor
    public Exit() {

    }


    //add another constructor taking two parameters: direction and destination.
    public Exit(int destination, String direction) {
        this.destination = destination;
        this.direction = direction;
    }

    public int getDestination() {
        return destination;
    }

    public void setDestination(int destination) {
        this.destination = destination;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    //add toString method to return direction and the destination.

    @Override
    public String toString() {
        return "Exit:" +
                "destination=" + destination +
                ", direction='" + direction + '\'' ;
    }
}
