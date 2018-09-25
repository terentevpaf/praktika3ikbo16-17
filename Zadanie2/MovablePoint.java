public class MovablePoint implements Movable {
    public int x;
    public int y;
    public int xSpeed;
    public int ySpeed;
    MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        x = 1;
        y = 1;
        xSpeed = 1;
        ySpeed = 1;
    }
    @Override
    public String toString() {
        return "x: " + x + ", y: " + y + ", xSpeed: " + xSpeed + ", ySpeed: " + ySpeed + "\n";
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
