package liskov_substitution.wrong;

public class MotorCar implements  Car{

    private Engine engine;

    @Override
    public void turnOnEngine() {
        engine.on();
    }

    @Override
    public void accelerate() {
        engine.powerOn(1000);
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
