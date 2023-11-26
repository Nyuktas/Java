package dzlaba;

public class Ball
{
    private int size;
    private String color;

    public Ball(String c, int s)
    {
        size = s;
        color = c;
    }
    public Ball(String c)
    {
        color = c;
        size = 0;
    }
    public Ball()
    {
        color = "blue";
        size = 5;
    }

    public void setSize(int size)
    {
        this.size = size;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public String getColor(String color)
    {
        return color;
    }
    public int getSize()
    {
        return size;
    }
    public String toString()
    {
        return this.size+", color "+this.color;
    }
    public void outBallsInf()
    {
        System.out.println(color + " ball with " + size + "'th size");
    }
}
