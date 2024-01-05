package liskov_substitution_principle.good_approach;

public class Runner {
    public static void printItemPrice(MenuItem item){
        if(item instanceof BeveragesItem){
            System.out.println("Beverage Item Price");
            System.out.println(item.getPrice());
        }else{
            System.out.println("Menu Item Price");
            System.out.println(item.getPrice());
        }
    }
    public static void main(String[] args) {
        MenuItem menuItem=new MenuItem("Pizza",100,"My Pizza");
        BeveragesItem beveragesItem=new BeveragesItem("Hennesey",100,"Whiskey",10);

        printItemPrice(menuItem);
        printItemPrice(beveragesItem);
    }
}
