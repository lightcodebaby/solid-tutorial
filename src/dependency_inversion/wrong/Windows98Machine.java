package dependency_inversion.wrong;

public class Windows98Machine {

    private final StandardKeyboard keyboard;
    private final Monitor monitor;

    public Windows98Machine() {
        this.keyboard = new StandardKeyboard();
        this.monitor = new Monitor();
    }
}
