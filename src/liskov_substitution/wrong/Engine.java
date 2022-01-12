package liskov_substitution.wrong;

public class Engine {

    private int power;
    private boolean enabled;

    public void on() {
        setEnabled(true);
    }

    public void powerOn(int quantity) {
        setPower(power + quantity);
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
