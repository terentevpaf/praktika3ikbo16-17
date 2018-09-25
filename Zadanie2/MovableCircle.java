public class MovableCircle implements Movable {
    public int x;
    public int y;
    public int xSpeed;
    public int ySpeed;
    private int radius;
    private MovablePoint center;
    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        x = 1;
        y = 1;
        xSpeed = 1;
        ySpeed = 1;
        radius = 1;
    }
    @Override
    public String toString() {
        return "x: " + x + ", y: " + y + ", xSpeed: " + xSpeed + ", ySpeed: " + ySpeed + ", radius: " + radius + "\n";
    }
    public void moveUp() {
        y+= 1;
    }
    public void moveDown() {
        y-= 1;
    }
    public void moveLeft() {
        x-= 1;
    }
    public void moveRight() {
        x+= 1;
    }
}
