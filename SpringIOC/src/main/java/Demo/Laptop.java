package Demo;

public class Laptop implements Machine{
    @Override
    public void getType() {
        System.out.println("Machine Type IS Laptop");
    }

    @Override
    public void getPrice() {
        System.out.println("Machine Price Is 75000");
    }
}
