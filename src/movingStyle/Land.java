package movingStyle;

public class Land implements MoveStyle{
    @Override
    public void move() {
        System.out.println("Can walk and run");
    }
}
