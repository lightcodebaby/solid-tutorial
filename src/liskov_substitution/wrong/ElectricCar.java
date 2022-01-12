package liskov_substitution.wrong;

public class ElectricCar implements Car{
    @Override
    public void turnOnEngine() {
        throw new AssertionError("I don't have an engine!");
    }

    @Override
    public void accelerate() {
        //TODO
    }
}
