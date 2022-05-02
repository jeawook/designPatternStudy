package byJins.adapter;

public class LedFrameworkAdapter implements ILedFramework{

    public LedFramework led;

    public LedFrameworkAdapter() {
        this.led = new LedFramework();
    }

    @Override
    public void ledOff() {
        led.ledOff();
    }

    @Override
    public void ledOn(String color) {
        ledOff();
        led.ledOn(color);
    }

    @Override
    public void ledBlink(String color1) {
        for (int i = 0; i < 10; i++) {
            ledOn(color1);
        }
    }
}
