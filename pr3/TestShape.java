package pr3;

public class TestShape
{
    public static void main(String[] args)
    {
        Circle c1  = new Circle(5.0, "blue", true);
        Rectangle r1 = new Rectangle(4.0, 6.0, "green", false);
        Square s1 = new Square(3.0, "red", true);

        System.out.println("Circle: " + c1);
        System.out.println("Circle Area: " + c1.getArea());
        System.out.println("Circle Perimeter: " + c1.getPerimeter());

        System.out.println("\nRectangle: " + r1);
        System.out.println("Rectangle Area: " + r1.getArea());
        System.out.println("Rectangle Perimeter: " + r1.getPerimeter());

        System.out.println("\nSquare: " + s1);
        System.out.println("Square Area: " + s1.getArea());
        System.out.println("Square Perimeter: " + s1 .getPerimeter());

        MovablePoint mP = new MovablePoint(1, 2, 3, 4);
        MovableCircle mC = new MovableCircle(0, 0, 1, 1, 5);
        MovableRectangle mR = new MovableRectangle(0, 0, 2, 2, 2, 2);

        System.out.println("\nMovablePoint: " + mP);
        mP.moveUp();
        System.out.println("After moving up: " + mP);

        System.out.println("\nMovableCircle: " + mC);
        mC.moveRight();
        System.out.println("After moving right: " + mC);

        System.out.println("\nMovableRectangle: " + mR);
        mR.moveDown();
        System.out.println("After moving down: " + mR);
    }
}