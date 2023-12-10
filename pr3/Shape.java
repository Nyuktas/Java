package pr3;

abstract class Shape
{
    protected String color;
    protected boolean filled;

    public Shape()
    {
        this.color = "red";
        this.filled = true;
    }

    public Shape(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public boolean isFilled()
    {
        return filled;
    }

    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString()
    {
        return "Shape's color is " + color + ", filled - " + filled;
    }
}

class Circle extends Shape
{
    protected double radius;

    public Circle()
    {
        this.radius = 1.0;
    }

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled)
    {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    @Override
    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString()
    {
        return "Circle " + super.toString() + ", radius " + radius;
    }
}

class Rectangle extends Shape
{
    protected double width;
    protected double length;

    public Rectangle()
    {
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length)
    {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled)
    {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public double getLength()
    {
        return length;
    }

    public void setLength(double length)
    {
        this.length = length;
    }

    @Override
    public double getArea()
    {
        return width * length;
    }

    @Override
    public double getPerimeter()
    {
        return 2 * (width + length);
    }

    @Override
    public String toString()
    {
        return "Rectangle " + super.toString() + ", width " + width + ", length " + length;
    }
}

class Square extends Rectangle
{
    public Square()
    {
        super();
    }

    public Square(double side)
    {
        super(side, side);
    }

    public Square(double side, String color, boolean filled)
    {
        super(side, side, color, filled);
    }

    public double getSide()
    {
        return width;
    }

    public void setSide(double side)
    {
        width = side;
        length = side;
    }

    @Override
    public void setWidth(double side)
    {
        setSide(side);
    }

    @Override
    public void setLength(double side)
    {
        setSide(side);
    }

    @Override
    public String toString()
    {
        return "Square " + super.toString() + ", side " + width;
    }
}

interface Movable
{
    void moveUp();

    void moveDown();

    void moveLeft();

    void moveRight();
}

class MovablePoint implements Movable
{
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp()
    {
        y -= ySpeed;
    }

    @Override
    public void moveDown()
    {
        y += ySpeed;
    }

    @Override
    public void moveLeft()
    {
        x -= xSpeed;
    }

    @Override
    public void moveRight()
    {
        x += xSpeed;
    }

    @Override
    public String toString()
    {
        return "MovablePoint x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed;
    }
}

class MovableCircle extends MovablePoint
{
    protected int radius;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
    {
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public void moveUp()
    {
        super.moveUp();
    }

    @Override
    public void moveDown()
    {
        super.moveDown();
    }

    @Override
    public void moveLeft()
    {
        super.moveLeft();
    }

    @Override
    public void moveRight()
    {
        super.moveRight();
    }

    @Override
    public String toString()
    {
        return "MovableCircle " + super.toString() + ", radius=" + radius;
    }
}

class MovableRectangle implements Movable
{
    protected MovablePoint topLeft;
    protected MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed)
    {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
        if (xSpeed != ySpeed)
        {
            System.out.println("Different speeds for x and y directions");
        }
    }

    @Override
    public void moveUp()
    {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown()
    {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft()
    {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight()
    {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    @Override
    public String toString()
    {
        return "MovableRectangle topLeft " + topLeft + ", bottomRight " + bottomRight;
    }
}