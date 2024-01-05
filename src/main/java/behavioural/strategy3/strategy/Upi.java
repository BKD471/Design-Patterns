package behavioural.strategy3.strategy;

public class Upi implements ITender{
    @Override
    public void pay() {
        System.out.println("Payment Settled through Upi");
    }
}
