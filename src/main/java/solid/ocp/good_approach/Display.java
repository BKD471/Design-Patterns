package solid.ocp.good_approach;

import solid.ocp.good_approach.displays.DisplayType;

public class Display {
    private  DisplayType displayType;
    public Display(DisplayType displayType){
        this.displayType=displayType;
    }

    public void configureMyDisplay(){
        displayType.display();
    }

    public void setDisplayType(DisplayType displayType){
        this.displayType=displayType;
    }
}
