package Setter;
//implementation class
public class SmartPhone implements Mobile{
    private SimCard card;
    //Setter Method
    public void setCard(SimCard card) {
        this.card = card;
    }

    @Override
    public void getType() {
        System.out.println("Mobile Type Is Smart Phone");
    }

    @Override
    public void getSim() {
        card.getCompany();
    }
}
