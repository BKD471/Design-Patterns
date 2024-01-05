package liskov_substitution_principle.bad_approach;

public class BeveragesItem extends MenuItem{
    public BeveragesItem(String name,int price,String description){
        super(name,price,description);
    }

    public double getPriceWithDiscount(int discountPercent){
        return this.getPrice()-(discountPercent*0.1*this.getPrice());
    }
}
