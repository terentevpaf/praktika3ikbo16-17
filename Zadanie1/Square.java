public class Square extends Rectangle {
    protected double side;
    Square()
    {
        this.filled = false;
        this.color = "blue";
        this.width = 100;
        this.length = 50;
        side = 100;
    }
    Square(double size)
    {
        this.filled = false;
        this.color = "blue";
        this.width = 100;
        this.length = 50;
        this.side = size;
    }
    Square(double size, String color, boolean filled)
    {
        this.filled = false;
        this.color = color;
        this.width = 100;
        this.length = 50;
        this.side = size;
        this.filled = filled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea()
    {
        return width*length;
    }
    @Override
    public double getPerimeter()
    {
        return 2*(width+length);
    }
    @Override
    public String toString()
    {
        return "Shape: square, width: "+this.width+", length: "+this.length+", side: "+this.side+", color: "+this.color;
    }
}
