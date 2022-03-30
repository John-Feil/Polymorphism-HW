package polymorphism;

public class Bird implements IFlight{
    @Override
    public void fly() {
        System.out.println("Flap flap");
    }
}
