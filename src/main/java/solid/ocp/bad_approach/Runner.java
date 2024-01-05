package solid.ocp.bad_approach;

public class Runner {
    public static void main(String[] args) {
        Display display=new Display();
        display.display(DisplayType.PC);
        display.display(DisplayType.MOBILE);
        display.display(DisplayType.TV);
        display.display(DisplayType.TABLET);
    }
}
