package Setter;

public class FeaturePhone implements Mobile{
    private SimCard card;
        //Setter
    public void setCard(SimCard card) {
        this.card = card;
    }

    @Override
    public void getType() {
        System.out.println("Mobile Type Is Feature Phone");
    }

    @Override
    public void getSim() {
        card.getCompany();
    }
}
