package lab5;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

abstract class Shape
{
    protected Color color;
    protected int x, y;

    public Shape(Color color, int x, int y)
    {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    abstract void draw(Graphics g);
}

class RectangleShape extends Shape
{
    private int width, height;

    public RectangleShape(Color color, int x, int y, int width, int height)
    {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    void draw(Graphics g)
    {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}

class EllipseShape extends Shape
{
    private int width, height;

    public EllipseShape(Color color, int x, int y, int width, int height)
    {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    void draw(Graphics g)
    {
        g.setColor(color);
        g.fillOval(x, y, width, height);
    }
}

public class RandomShapes extends JFrame
{
    private static final int WINDOW_WIDTH = 600;
    private static final int WINDOW_HEIGHT = 600;
    private static final int NUM_SHAPES = 20;

    private Random random = new Random();

    private Shape[] shapes;

    public RandomShapes()
    {
        super("Отображение случайных фигур");

        shapes = new Shape[NUM_SHAPES];
        for (int i = 0; i < NUM_SHAPES; i++)
        {
            int x = random.nextInt(WINDOW_WIDTH);
            int y = random.nextInt(WINDOW_HEIGHT);
            int width = random.nextInt(100) + 20;
            int height = random.nextInt(100) + 20;
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            if (random.nextBoolean())
            {
                shapes[i] = new RectangleShape(color, x, y, width, height);
            } else
            {
                shapes[i] = new EllipseShape(color, x, y, width, height);
            }
        }

        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);

        setVisible(true);
    }

    @Override
    public void paint(Graphics g)
    {
        for (Shape shape : shapes)
        {
            shape.draw(g);
        }
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(RandomShapes::new);
    }
}