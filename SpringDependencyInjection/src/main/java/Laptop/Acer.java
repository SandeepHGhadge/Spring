package Laptop;

public class Acer implements Laptop{
    Ram r1;

    public Acer(Ram r1) {
        this.r1 = r1;
    }

    private GraphicsCard card;

    public void setCard(GraphicsCard card) {
        this.card = card;
    }

    @Override
    public void getCompany() {
        System.out.println("Laptop Name Is Acer");
    }

    @Override
    public void getRamInfo() {

    }

    @Override
    public void getGraphicsInfo() {

    }
}
