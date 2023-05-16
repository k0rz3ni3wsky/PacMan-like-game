import java.io.Serializable;
import java.util.Vector;

public class PacMan implements Serializable {
    private String username;
    private int x;
    private int y;
    private boolean isAlive;
    private static Vector<PacMan> usernames = new Vector<>();
    private int points;
    private int healthPoints;

    public PacMan(int x, int y) {
        this.healthPoints = 3;
        this.points = 0;
        this.isAlive = true;
        this.x = x;
        this.y = y;
        usernames.add(this);
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public static Vector<PacMan> getUsernames() {
        return usernames;
    }

    public int getPoints() {
        return points;
    }
    @Override
    public String toString() {
        return "Username: ["+username+"] "+"                         |                          High score: ["+points+"]";
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isAlive() {
        return isAlive;
    }
    public void addPoint() {
        points++;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}

