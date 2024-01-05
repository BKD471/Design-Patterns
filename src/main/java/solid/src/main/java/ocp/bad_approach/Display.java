package ocp.bad_approach;

public class Display {

    public void display(DisplayType displayType){
        switch (displayType){
            case PC -> {
                System.out.println("I am PC");
            }
            case TV -> {
                System.out.println("I am TV");
            }
            case MOBILE -> {
                System.out.println("I am MOBILE");
            }
            case TABLET -> {
                System.out.println("I am TABLET");
            }
            default -> throw new RuntimeException("Invalid Display Type");
        }
    }
}
