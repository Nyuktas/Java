package dzlaba;

public class TestBall
{
    public static void main(String[] args)
    {
        Ball b1 = new Ball("Blue", 5);
        Ball b2 = new Ball("Green", 7);
        Ball b3 = new Ball("White");
        b3.setSize(6);
        System.out.println(b1);
        b1.outBallsInf();
        b2.outBallsInf();
        b3.outBallsInf();
    }
}