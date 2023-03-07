package Demo;

public class Projector implements Machine{
    @Override
    public void getType() {
        System.out.println("Machine Type Is Projector");
    }

    @Override
    public void getPrice() {
        System.out.println("Machine Price Is 25000");
    }
}
