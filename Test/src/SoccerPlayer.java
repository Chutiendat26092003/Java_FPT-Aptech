public class SoccerPlayer {
    private String name;
    private int number;
    private float xLocation;
    private float yLocation;

    public SoccerPlayer() {
        name = "Jame";
        number = 10;
        xLocation = 10;
        yLocation = 23;
    }

    public SoccerPlayer(String na, int nu) {
        name = na;
        number = nu;
        xLocation = 10;
        yLocation = 23;
    }

    public SoccerPlayer(String na, int nu, float x, float y) {
        name = na;
        number = nu;
        xLocation = x;
        yLocation = y;
    }

    public  String run() {
        return name;
    }

    public int jumpNumber() {
        return number;
    }

    public float jumpXL() {
        return xLocation;
    }

    public float jumpYL() {
        return yLocation;
    }

    public float kickBall() {
        return xLocation * yLocation;
    }

}
