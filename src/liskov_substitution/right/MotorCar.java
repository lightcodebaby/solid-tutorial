package liskov_substitution.right;

public class MotorCar implements Car {

    private Engine engine;

    @Override
    public void accelerate() {
        engine.on();
        engine.powerOn(1000);
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
