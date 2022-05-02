package byJins.adapter;

//adeptee
public class LedFramework {
    public int state = 0;
    public String curColor;

    public void ledOn(String color) {
        if(state == 0) {
            System.out.println("LED " + color + " ON");
            curColor = color;
            state = 1;
        }
        else {
            if (curColor.equals(color)) {
                System.out.println("LED " + color + " ON");
                state = 1;
                return;
            }

            if (color.equals("RED")) {
                curColor = curColor + " RED";
                System.out.println("LED " + curColor + " ON");
            } else if (color.equals("BLUE")) {
                curColor = curColor + " BLUE";
                System.out.println("LED " + curColor +" ON");
            } else if (color.equals("GREEN")) {
                curColor = curColor + " GREEN";
                System.out.println("LED " + curColor +" ON");
            }
        }
    }
    public void ledOff() {
        System.out.println("Led Off");
        state = 0;
        curColor = "";
    }
}
