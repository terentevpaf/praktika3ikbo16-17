public class MovablePoint implements Movable {
    public int x;
    public int y;
    public int xSpeed;
    public int ySpeed;
    MovablePoint() {
        x = 1;
        y = 1;
        xSpeed = 1;
        ySpeed = 1;
    }
    MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
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
