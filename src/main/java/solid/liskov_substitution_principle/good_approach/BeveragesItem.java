package solid.liskov_substitution_principle.good_approach;

public class BeveragesItem extends MenuItem {
    private final int discount;
    public BeveragesItem(String name,int price,String description,int discount){
        super(name,price,description);
        this.discount=discount;
    }

    @Override
    public double getPrice(){
        return super.getPrice()-this.getPriceWithDiscount(discount);
    }
    public double getPriceWithDiscount(int discountPercent){
        return (discountPercent*0.01*super.getPrice());
    }
}
