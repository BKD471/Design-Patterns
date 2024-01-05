package ocp.good_approach;

import ocp.good_approach.displays.MobileDisplay;
import ocp.good_approach.displays.PcDisplay;

public class Runner {
    public static void main(String[] args) {
        Display display=new Display(new PcDisplay());
        display.configureMyDisplay();

        display.setDisplayType(new MobileDisplay());
        display.configureMyDisplay();
    }
}
