package solid.liskov_substitution_principle.bad_approach;

public class Runner {

    /**
     * MeuItem is the parent of BeverageItem but we cant
     * substitute the meu with bever in printItemPrice
     *
     * ***/
    public static void printItemPrice(MenuItem item){
        if(item instanceof  BeveragesItem){
            System.out.println("Beverage Item Price");
            System.out.println(item.getPrice());

            BeveragesItem beveragesItem=(BeveragesItem) item;
            System.out.println( beveragesItem.getPriceWithDiscount(10)); //it breaks gives wrong answer
            //since there no method() like getPriceWithDiscount() in MenuItem
            //you cannot call the specialized method of child class with parent reference type
        }else{
            System.out.println("Menu Item Price");
            System.out.println(item.getPrice());
        }
    }
    public static void main(String[] args) {
        MenuItem menuItem=new MenuItem("Pizza",100,"My Pizza");
        BeveragesItem beveragesItem=new BeveragesItem("Hennessy",100,"Whiskey");

        printItemPrice(menuItem);
        printItemPrice(beveragesItem);
    }
}
