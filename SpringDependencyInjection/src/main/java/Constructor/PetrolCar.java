package Constructor;

public class PetrolCar implements Car{
    //HAS-A
    PetrolEngine engine;

    public PetrolCar(PetrolEngine engine) {
        this.engine = engine;
    }

    @Override
    public void getType() {
        System.out.println("Car Type Is Petrol Car");
    }

    @Override
    public void getEngineInfo() {
        engine.getType();
    }
}
