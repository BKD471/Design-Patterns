package liskov_substitution_principle.good_approach;

public class MenuItem {
    private final int price;
    private final String name;
    private final String description;

    public MenuItem(String name,int price,String description){
        this.name=name;
        this.price=price;
        this.description=description;
    }

    public double getPrice(){
        return this.price;
    }
}
