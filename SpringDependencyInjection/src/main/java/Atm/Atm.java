package Atm;
//main entity
public class Atm {
    private Printer print;
//setter Injection
    public void setPrint(Printer print) {
        this.print = print;
    }

    public void getInfo(int accNo){
        print.printAccountBalance(accNo);
    }
}
